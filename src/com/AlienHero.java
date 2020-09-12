package com;

public class AlienHero extends Hero {		
	
	public AlienHero() {
		super();
		this.can_swim = true;
		this.flamethrower = true;
	}


	public boolean isCan_swim() {
		return can_swim;
	}
	public boolean isFlamethrower() {
		return flamethrower;
	}
	
	public void swim() {
		System.out.println("Swimming");
	}
	
	public void flameThrow() {
		System.out.println("Throwing flames");
	}


	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}
}
