package animals;

import diet.Carnivore;
import diet.Herbivore;
import food.EFoodType;
import food.IEdible;
import mobility.Point;
import utilities.MessageUtility;

public class Elephant extends Animal{
	private double trunkLength =1 ;
	private static final Herbivore diet = new Herbivore();
	private static final Point starting_location = new Point(50,90);
	public Elephant(String name) {
		super(name, starting_location);
		super.setWeight(500);
		
	}
	@Override
	public boolean eat(IEdible food) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public EFoodType getFoodtype() {
		MessageUtility.logGetter(this.getClass().getSimpleName(), "getFoodType", EFoodType.NOTFOOD);
		return EFoodType.MEAT;
	}
	

}
