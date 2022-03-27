package animals;

import diet.*;

import food.EFoodType;
import food.IEdible;
import mobility.Point;
import utilities.MessageUtility;

public class Turtle extends ChewAnimal{
	
	private int Age;
	private static final Point starting_location = new Point(80,0);
	private static final Herbivore diet = new Herbivore();
	
	public Turtle(String name, Point location) {
		super(name,location);
		super.setWeight(1);
		super.setDiet(diet);
		this.Age = 1;
		MessageUtility.logConstractor("Turtle", name);
		
	}
	
	public Turtle(String name) {
		super(name,starting_location);
		super.setWeight(1);
		super.setDiet(diet);
		this.Age = 1;
		MessageUtility.logConstractor("Turtle", name);
		
	}
	
	public boolean setAge(int Age) {
		if(0 <= Age && Age <= 500) {
			this.Age = Age;
			MessageUtility.logSetter(super.getName(), "setAge", Age, true);
			return true;
		}
		MessageUtility.logSetter(super.getName(), "setAge", Age, false);
		return false;
		
	}
	
	
	
	@Override
	public EFoodType getFoodtype() {
		MessageUtility.logGetter(this.getClass().getSimpleName(), "getFoodType", EFoodType.MEAT);
		return EFoodType.MEAT;
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
	public void chew() {
		MessageUtility.logSound(super.getName(), "Retracts its head in then eats quietly");
		
	}
	

}
