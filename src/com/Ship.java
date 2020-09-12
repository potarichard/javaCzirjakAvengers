package com;

import java.util.HashSet;
import java.util.Set;


public class Ship {

	private int capacity;
	private int number = 0;
	private Avenger[] avengers;
	
	public Ship(int capacity) {
		super();
		this.capacity = capacity;
		this.avengers = new Avenger[capacity];
	}
	
	public void printStones() {
		
//		nem oke, minden kobol csak 1 lehet
//		Map<InfinityStone, Integer> stones = new HashMap<InfinityStone, Integer>();
//		
//		for(Avenger avenger : avengers) {
//			
//			InfinityStone stone = avenger.getStone();
//			
//			if(stones.get(stone) != null) {
//				int val = stones.get(stone);
//				stones.put(stone, ++val);
//			}
//			else
//				stones.put(stone, 1);
//		}
//		
//		for(Entry<InfinityStone, Integer> ent : stones.entrySet())	{
//			
//		}
		
		Set<InfinityStone> stones = new HashSet<InfinityStone>();
		
		for(Avenger avenger : avengers) {
			if(avenger == null)
				break;
			stones.add(avenger.getStone());
		}
			
		
		for(var stone : stones)
			System.out.println(stone.getName() + " 1 darab");
	}
	
	public void addAvenger(Avenger avg) {		
		if(number < capacity)
			avengers[number++] = avg;		
	}
	
}





