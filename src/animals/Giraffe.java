package animals;

import diet.Herbivore;
import food.EFoodType;
import food.IEdible;
import mobility.Point;
import utilities.MessageUtility;

public class Giraffe extends ChewAnimal {
	
	
	private static final Herbivore diet = new Herbivore();
	private static final Point starting_location = new Point(50,0);
	private double neckLength;
	
	
	public Giraffe(String name,Point location){
		super(name,location);
		super.setWeight(450);
		super.setDiet(diet);
		MessageUtility.logConstractor("Giraffe", name);
		this.neckLength = 1.5 ;
			
	}
	
	public Giraffe(String name) {
		super(name,starting_location);
		super.setWeight(450);
		super.setDiet(diet);
		MessageUtility.logConstractor("Giraffe", name);
		this.neckLength = 1.5 ;
			
	}
	
	public boolean setNeck(double neck) {
		if(1 <= neck && neck >= 2.5) {
			this.neckLength = neck;
			MessageUtility.logSetter(super.getName(), "setNeck", neck, true);
			return true;
		}
		MessageUtility.logSetter(super.getName(), "setNeck", neck, false);
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
		MessageUtility.logSound(super.getName(), "Bleats and Stomps its legs, then chews");
		
	}

}
