package com;

public final class InfinityStone {

	private final String name;	
	private final String color;
	private final int power;
	
	// TODO: refactor, this violates the open/closed principle, cuz new stone added -> have to change this
	// but in this case, properties are set, not method calls so, the properties set must be defined.
	// this is a facotry
	public InfinityStone(Stone stone) {
		super();
		this.name = stone.name();
		
		switch(stone) {
			case MIND:
				this.power = 1;
				this.color = "Yellow";
				break;
			case POWER:
				this.power = 2;
				this.color = "Purple";
				break;
			case REALITY:
				this.power = 3;
				this.color = "Red";
				break;
			case SOUL:
				this.power = 4;
				this.color = "Orange";
				break;
			case SPACE:
				this.power = 5;
				this.color = "Blue";
				break;
			case TIME:
				this.power = 6;
				this.color = "Green";
				break;
			default:
				throw new IllegalArgumentException("This type not defined in the factory");
		}
	}

	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}

	public int getPower() {
		return power;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + power;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InfinityStone other = (InfinityStone) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (power != other.power)
			return false;
		return true;
	}	
	
}
