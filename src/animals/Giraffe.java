package animals;

import diet.Herbivore;
import food.EFoodType;
import food.IEdible;
import mobility.Point;
import utilities.MessageUtility;

public class Giraffe extends Animal {
	
	
	private static final Herbivore diet = new Herbivore();
	private static final Point starting_location = new Point(50,0);
	private double neckLength;
	
	
	public Giraffe(String name,Point location, double neckLength){
		super(name,location);
		super.setWeight(450);
		super.setDiet(diet);
		MessageUtility.logConstractor("Giraffe", name);
		if(1 <= neckLength && neckLength >= 2.5) {
			this.neckLength = neckLength;
		}
		else {this.neckLength = 1.5 ;}
	}
	
	public Giraffe(String name) {
		super(name,starting_location);
		super.setWeight(450);
		super.setDiet(diet);
		MessageUtility.logConstractor("Giraffe", name);
		this.neckLength = 1.5 ;
			
	}


	@Override
	public EFoodType getFoodtype() {
		MessageUtility.logGetter(this.getClass().getSimpleName(), "getFoodType", EFoodType.MEAT);
		return EFoodType.MEAT;
	}


	@Override
	public boolean eat(IEdible food) {
		// TODO Auto-generated method stub
		return false;
	}

}
