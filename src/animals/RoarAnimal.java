package animals;

import mobility.Point;

public abstract class RoarAnimal extends Animal{

	public RoarAnimal(String name, Point location) {
		super(name, location);
		// TODO Auto-generated constructor stub
	}

	
	public void makeSound() {
		this.roar();
		
	}
	
	public abstract void roar();
	

}
