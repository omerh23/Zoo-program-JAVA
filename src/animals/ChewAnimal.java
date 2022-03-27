package animals;

import mobility.Point;

public abstract class ChewAnimal extends Animal {
	
	public ChewAnimal(String name, Point location) {
		super(name, location);
		
	}
	
	public void makeSound() {
		this.chew();
		
	}
	
	public abstract void chew();

	
}
