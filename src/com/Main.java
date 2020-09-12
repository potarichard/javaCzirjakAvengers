package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		Avenger cap = new Avenger("Captain", 5, Stone.MIND, 0);
		Avenger wid = new Avenger("Natasha", 3, Stone.MIND, 0);
		Avenger muri = new Avenger("Murray", 7, Stone.REALITY, 1);
		Avenger iro = new Avenger("IronMan", 5, Stone.MIND, 0);
		
		Avenger pho = new Avenger("Phonix", 3, Stone.POWER, 0);
		Avenger war = new Avenger("WarMachine", 7, Stone.POWER, 1);
		Avenger drs = new Avenger("DrStrange", 5, Stone.TIME, 0);
		Avenger wit = new Avenger("Wanda", 3, Stone.SPACE, 0);
		
//		Avenger hul = new Avenger("Hulk", 9, Stone.SOUL, 1);
		
		List<Avenger> list_of_heroes = List.of(cap,wid,muri,iro, pho,war,drs,wit);
		
//		cap.flameThrow();
//		System.out.println(cap.getId());
//		
//		wid.flameThrow();
//		System.out.println(wid.getId());
//		
//		muri.flameThrow();
//		System.out.println(muri.getId());

		System.out.println();
		
		
		
		Ship ship_1 = new Ship(4);
		Ship ship_2 = new Ship(4);
		Ship ship_3 = new Ship(4);
		
		ship_1.addAvenger(cap); ship_1.addAvenger(wid); ship_1.addAvenger(muri); ship_1.addAvenger(iro);
		
		ship_2.addAvenger(pho); ship_2.addAvenger(war); ship_2.addAvenger(drs); ship_2.addAvenger(wit);
		
//		ship_3.addAvenger(hul);
		
		System.out.println("ship 1");
		ship_1.printStones();
		System.out.println("ship 2");
		ship_2.printStones();
		System.out.println("ship 3");
		ship_3.printStones();
		
		
		long num = list_of_heroes.stream().filter(avenger -> avenger.getHero_type().getClass() == EarthHero.class).count();
		
		num = list_of_heroes.stream().filter(avenger -> avenger.getHero_type() instanceof EarthHero).count();
		
		System.out.println(num);
		
		Avenger most_powerfull = Collections.max(list_of_heroes, Comparator.comparing(avg -> avg.getPower()));
		
		System.out.println(most_powerfull);
		
		List<Integer> ids = list_of_heroes.stream()
								.filter(avenger -> avenger.getHero_type().getClass() == EarthHero.class)
								.map(avg -> avg.getId())
								.collect(Collectors.toList());
		
		ids.forEach(id -> System.out.println(id));
		
		System.out.println();
		
		ids.forEach(System.out::println);
		
//		int number_of_ships = (int)Math.floor(list_of_heroes.size() / 4.0) + list_of_heroes.size()%4 > 0 ? 1 : 0;
		
		List<Ship> ships = new ArrayList<Ship>();
		Ship ship = new Ship(4);
		int i = 0;
		
		for(Avenger avenger : list_of_heroes) {
			
			if(i<4)
				ship.addAvenger(avenger);
			else {
				i=0;
				ships.add(ship);
				ship = new Ship(4);
				ship.addAvenger(avenger);
			}
			i++;
		}
		
		if(ship.hasMember())
			ships.add(ship);
		
		System.out.println();
		
		List<Avenger> asd = new ArrayList<>(list_of_heroes);
		
		Collections.sort(asd);
		
		asd.forEach(System.out::println);
	} 

}





