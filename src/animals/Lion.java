package animals;
import java.util.Random;

import diet.Carnivore;
import food.EFoodType;
import food.IEdible;
import mobility.Point;
import utilities.MessageUtility;

public class Lion extends Animal {

	private static final Point starting_location = new Point(20,0);
	private static final Carnivore diet = new Carnivore();
	private int scarCount = 0;
	public Lion(String name) {
		super(name, starting_location);
		super.setWeight(408.2);
		super.setDiet(diet);
	}
	
	public Lion(String name, Point location) {
		super(name,location);
		super.setWeight(408.2);
		super.setDiet(diet);
	}
	
	public EFoodType getFoodType() {
		MessageUtility.logGetter(this.getClass().getSimpleName(), "getFoodType", EFoodType.NOTFOOD);
		return EFoodType.NOTFOOD;
	}
	
	public void roar() {
		MessageUtility.logSound(super.getName(), "Roars, then stretches and shakes its mane");
			
	}
	
	public void makeSound() {
		this.roar();
		
	}
	
	
	public boolean eat(IEdible IE) {//check the func eat in carnivore
		double W = diet.eat(this, IE);
		if(W != 0) {
			super.setWeight(W);
			boolean val = new Random().nextInt(50)==0;
			if (val)
				this.scarCount += 1;
			return true;
		}
		return false;
			
		
	}
	public String toString() {
		return "[" + this.getClass().getSimpleName() + "] ";
		
	}

}