package animals;

import food.EFoodType;
import food.IEdible;
import mobility.Point;

public abstract class RoarAnimal extends Animal{

	public RoarAnimal(String name, Point location) {
		super(name, location);
		// TODO Auto-generated constructor stub
	}

	@Override
	public EFoodType getFoodtype() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean eat(IEdible food) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public void makeSound() {
		this.roar();
		
	}
	
	public abstract void roar();
	

}
