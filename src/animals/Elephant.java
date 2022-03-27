package animals;

import diet.Herbivore;
import food.EFoodType;
import food.IEdible;
import mobility.Point;
import utilities.MessageUtility;

public class Elephant extends ChewAnimal{
	private double trunkLength ;
	private static final Herbivore diet = new Herbivore();
	private static final Point starting_location = new Point(50,90);
	public Elephant(String name,Point location) {
		super(name, location);
		super.setWeight(500);	
		this.trunkLength = 1;
		MessageUtility.logConstractor("Elephant", name);	
	}
	
	public Elephant(String name){
		super(name, starting_location);
		super.setWeight(500);
		this.trunkLength = 1;
		MessageUtility.logConstractor("Elephant", name);
	}
	
	
	public boolean setTrunk(double trunk) {
		if(0.5 <= trunk && trunk >= 3) {
			this.trunkLength = trunk;
			MessageUtility.logSetter(super.getName(), "setTrunk", trunk, true);
			return true;
		}
		MessageUtility.logSetter(super.getName(), "setTrunk", trunk, false);
		return false;
	}
	
	
	@Override
	public boolean eat(IEdible food) {
		double W = diet.eat(this, food);
		if(W > 0) {
			super.setWeight(super.getWeight()+W);
			super.makeSound();
			return true;
		}
	
	return false;
	}
	
	@Override
	public EFoodType getFoodtype() {
		MessageUtility.logGetter(this.getClass().getSimpleName(), "getFoodType", EFoodType.MEAT);
		return EFoodType.MEAT;
	}
	
	public String toString() {
		return "[" + this.getClass().getSimpleName() + "] ";
		
	}
	
	public void chew() {
		MessageUtility.logSound(super.getName(), "Trumpets with joy while flapping its ears, then chews");
		
	}
	

}
