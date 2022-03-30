package animals;
import java.util.Random;

import diet.Carnivore;
import food.EFoodType;
import food.IEdible;
import mobility.Point;
import utilities.MessageUtility;

public class Lion extends RoarAnimal {

	private static final Point starting_location = new Point(20,0);
	private static final Carnivore diet = new Carnivore();
	private int scarCount ;
	
	public Lion(String name) {
		super(name,starting_location);
		MessageUtility.logConstractor("Lion", name);
		super.setWeight(408.2);
		super.setDiet(diet);
		this.scarCount = 0;
		
	}
	
	public Lion(String name, Point location) {
		super(name,location);
		MessageUtility.logConstractor("Lion", name);
		super.setWeight(408.2);
		super.setDiet(diet);
		this.scarCount = 0 ;
		
	}
	
	
	public void roar() {
		MessageUtility.logSound(super.getName(), "Roars, then stretches and shakes its mane");
			
	}
	
	
	public boolean eat(IEdible IE) {
		double W = diet.eat(this, IE);
		if(W > 0) {
			super.setWeight(super.getWeight()+W);
			boolean val = new Random().nextInt(50)==0;
			if (val)
				this.scarCount += 1;
			super.makeSound();
			return true;
		}
		return false;
			
		
	}


	@Override
	public EFoodType getFoodtype() {
		MessageUtility.logGetter(this.getClass().getSimpleName(), "getFoodType", EFoodType.NOTFOOD);
		return EFoodType.NOTFOOD;
	}


	
	
	
	
	
	
	
	
	
	

}