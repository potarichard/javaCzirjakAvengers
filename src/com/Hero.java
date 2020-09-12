package com;

public abstract class Hero {

	protected int id = -1;
	protected boolean can_fly;
	protected boolean can_swim;
	protected boolean flamethrower;	
	
	
	public abstract int getId(); 
	
	public abstract void fly();
	
	public abstract void swim();
	
	public abstract void flameThrow();
}
