package animals;
import java.awt.Graphics;
import java.util.Random;

import diet.Carnivore;
import food.EFoodType;
import food.IEdible;
import mobility.Point;
import utilities.MessageUtility;
/**
 * A class describing a Lion inherits from RoarAnimal
 *
 * @author  Vladislav Shevtsov id: 322162553; Omer Halfon id: 315429951
 * @see     RoarAnimal
 */
public class Lion extends RoarAnimal {

	private static final Point starting_location = new Point(20,0);
	private static final Carnivore diet = new Carnivore();
	private int scarCount ;
	/**
	 * A constructor for the Lion class.
	 * sets default scarCount and weight and diet.
	 * 
	 * @param name
	 *            - Name of the Lion
	 */
	public Lion(String name,float weight , String color) {
		super(name,starting_location,color);
		super.setWeight(weight);
		super.setDiet(diet);
		this.scarCount = 0;
		MessageUtility.logConstractor("Lion", name);
	}
	/**
	 * A constructor for the Lion class with a default location.
	 * sets default scarCount and weight and diet.
	 * 
	 * @param name
	 *            - Name of the Lion
	 */
//	public Lion(String name, Point location, float weight) {
//		super(name,location);
//		super.setWeight(weight);
//		super.setDiet(diet);
//		this.scarCount = 0 ;
//		MessageUtility.logConstractor("Lion", name);
//	}
	
	/**
	 * An implementation of the roar method using the MessageUtility method and the Lion special message 
	 */
	public void roar() {
		MessageUtility.logSound(super.getName(), "Roars, then stretches and shakes its mane");
			
	}
	
	/**
	 * an eat method for the Lion gets a type of food and checks weather it can eat it and adds weight if eating is possible otherwise returning false
	 * 
	 * @param food
	 *            - a type of food
	 *            
	 * @return boolean
	 *            - Return true if the Lion can eat this food and false if not
	 */
	public boolean eat(IEdible food) {
		double W = diet.eat(this, food);
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
	/**
	 * toString method of the class
	 * 
	 * 
	 * @return String
	 *            - Returns String representation of the object of this class
	 */
	
	@Override
	public EFoodType getFoodtype() {
		MessageUtility.logGetter(this.getClass().getSimpleName(), "getFoodType", EFoodType.NOTFOOD);
		return EFoodType.NOTFOOD;
	}
	


}