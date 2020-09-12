package com;

public class Avenger implements Comparable<Avenger>{

	private Hero hero_type;
	private String name;
	private int power;	
	private InfinityStone stone;	
	
	public Avenger(String name, int power, Stone stone, int type) {
		
		// needs factory pattern
		{
			if(type<0 || type >1)
				throw new IllegalArgumentException("only 0 or 1 type allowed");
			
			if(type==0)									
				this.hero_type = new EarthHero();
			else if(type==1)
				this.hero_type = new AlienHero();
		}
		
		this.name = name;
		this.power = power;
		this.stone = InfinityStones.entities.get(stone);
	}		
	
	
	//Behaviors
	public int getId() {
		return hero_type.id;
	}
	
	public void fly() {
		hero_type.fly();
	}
	
	public void swim() {
		hero_type.swim();
	}
	
	public void flameThrow() {
		hero_type.flameThrow();
	}

	//Attributes
	public String getName() {
		return name;
	}


	public int getPower() {
		return power;
	}


	public InfinityStone getStone() {
		return stone;
	}

	
	public Hero getHero_type() {
		return hero_type;
	}


	@Override
	public int compareTo(Avenger other) {
		
		if(this.stone.getPower() > other.stone.getPower())
			return 1;
		else if(this.stone.getPower() < other.stone.getPower())
			return -1;
		else 
			return this.name.compareTo(other.name);
	}


	@Override
	public String toString() {		
		return name;
	}
	
	
	
	
}
