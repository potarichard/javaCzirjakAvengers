package com;

import java.util.Random;

public class EarthHero extends Hero{
	
	
	public EarthHero() {
		super();
		this.id = this.generate_id();
		this.can_fly = true;
	}
	
	private int generate_id() {
		
		Random rand = new Random();
		int id = 1;
		int digit;
		
		for(int i=0; i<6; i++) {
			digit = rand.nextInt(10) + 1;
			id += digit * Math.pow(10, i);		// TODO: do bitshift, instead of pow
		}
		
		return id;
	}

	public int getId() {
		return id;
	}

	public boolean isCanfly() {
		return can_fly;
	}	
	
	public void fly() {
		System.out.println("Flying");
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void flameThrow() {
		// TODO Auto-generated method stub
		
	}
}
