package animals;

import java.awt.Graphics;

import diet.Herbivore;
import food.EFoodType;
import food.IEdible;
import mobility.Point;
import utilities.MessageUtility;
/**
 * A class describing an elephant inherits from ChewAnimal
 *
 * @author  Vladislav Shevtsov id: 322162553; Omer Halfon id: 315429951
 * @see     ChewAnimal
 */
public class Elephant extends ChewAnimal{
	private double trunkLength ;
	private static final Herbivore diet = new Herbivore();
	private static final Point starting_location = new Point(50,90);
	/**
	 * A constructor for the Elephant class.
	 * sets default trunkLenght and weight and diet.
	 * 
	 * @param name
	 *            - Name of the Elephant
	 * @param location
	 *            - Starting location of the Elephant
	*/
	public Elephant(String name,Point location, float weight) {
		super(name, location);
		super.setWeight(weight);	
		this.trunkLength = 1;
		MessageUtility.logConstractor("Elephant", name);	
	}
	/**
	 * A constructor for the Elephant class with default starting location.
	 * sets default trunkLenght and weight and diet.
	 * 
	 * @param name
	 *            - Name of the Elephant
	*/
	public Elephant(String name,float weight){
		super(name, starting_location);
		super.setWeight(weight);
		this.trunkLength = 1;
		MessageUtility.logConstractor("Elephant", name);
	}
	/**
	 * Setter method for the trunk variable
	 * must be between 0.5 and 3
	 * 
	 * @param trunk
	 *            - trunk length of the Elephant
	 *            
	 * @return boolean
	 *            - Return true if the setter succeeded and false otherwise
	 */
	
	public boolean setTrunk(double trunk) {
		if(0.5 <= trunk && trunk >= 3) {
			this.trunkLength = trunk;
			MessageUtility.logSetter(super.getName(), "setTrunk", trunk, true);
			return true;
		}
		MessageUtility.logSetter(super.getName(), "setTrunk", trunk, false);
		return false;
	}
	
	/**
	 * an eat method for the Elephant gets a type of food and checks weather it can eat it and adds weight if eating is possible otherwise returning false
	 * 
	 * @param food
	 *            - a type of food
	 *            
	 * @return boolean
	 *            - Return true if the Elephant can eat this food and false if not
	 */
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
	/**
	 * Getter method for the Foodtype variable
	 * 
	 * @return Foodtype
	 *            - Returns what type of food the animal is
	 */
	@Override
	public EFoodType getFoodtype() {
		MessageUtility.logGetter(this.getClass().getSimpleName(), "getFoodType", EFoodType.MEAT);
		return EFoodType.MEAT;
	}
	
	/**
	 * An implementation of the Chew method using the MessageUtility method and the Elephant special message 
	 */
	public void chew() {
		MessageUtility.logSound(super.getName(), "Trumpets with joy while flapping its ears, then chews");
		
	}
	@Override
	public String getAnimalName() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void eatInc() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int getEatCount() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public boolean getChanges() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void setChanges(boolean state) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void loadImages(String nm) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void drawObject(Graphics g) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
