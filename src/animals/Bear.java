package animals;

import java.util.Random;

import diet.Omnivore;
import food.EFoodType;
import food.IEdible;
import mobility.Point;
import utilities.MessageUtility;

public class Bear extends Animal  {
	
	private String furColor ;
	private static final Point starting_location = new Point(100,5);
	private static final Omnivore diet = new Omnivore();
	public Bear(String name, String fur) {
		super(name,starting_location);
		super.setWeight(308.2);
		if(fur == "white" ||fur == "black" || fur == "gray") {
			this.furColor = fur;
		}
		else
			this.furColor = "gray";
		MessageUtility.logConstractor("Bear", name);
	}
	public Bear(String name) {
		super(name,starting_location);
		this.furColor = "gray";
		super.setWeight(308.2);
		MessageUtility.logConstractor("Bear", name);
		
	}
	
	public void roar() {
		MessageUtility.logSound(super.getName(), "Stands on its hind legs, roars and scratches its belly");
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
	
	public String toString() {
		return "[" + this.getClass().getSimpleName() + "] ";
		
	}
	

}
