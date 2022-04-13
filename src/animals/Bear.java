package animals;
import java.awt.Graphics;

import diet.Omnivore;
import food.EFoodType;
import food.IEdible;
import mobility.Point;
import utilities.MessageUtility;
/**
 * A class describing a bear inherits from RoarAnimal
 *
 * @author  Vladislav Shevtsov id: 322162553; Omer Halfon id: 315429951
 * @see     RoarAnimal
 */
public class Bear extends RoarAnimal  {
	
	private String furColor ;
	private static final Point starting_location = new Point(100,5);
	private static final Omnivore diet = new Omnivore();
	/**
	 * A constructor for the Bear class.
	 * sets default furColor and weight and diet.
	 * 
	 * @param name
	 *            - Name of the Bear
	 * @param location
	 *            - Starting location of the Bear
	 */
	public Bear(String name, Point location,float weight) {
		super(name,location);
		super.setWeight(weight);
		this.furColor = "gray";
		MessageUtility.logConstractor("Bear", name);
	}
	/**
	 * A constructor for the Bear class with a default starting location.
	 * sets default furColor and weight and diet.
	 * 
	 * @param name
	 *            - Name of the Bear
	 */
	public Bear(String name,float weight) {
		super(name,starting_location);
		this.furColor = "gray";
		super.setWeight(weight);
		MessageUtility.logConstractor("Bear", name);
		
	}
	/**
	 * Setter method for the fur variable
	 * must be gray white or black
	 * 
	 * @param fur
	 *            - fur color of the Bear
	 *            
	 * @return boolean
	 *            - Return true if the setter succeeded and false otherwise
	 */
	public boolean setFur(String fur) {
		if(fur == "gray" || fur == "white" || fur == "black") {
			this.furColor = fur;
			MessageUtility.logSetter(super.getName(), "setFur", fur, true);
			return true;
		}
		MessageUtility.logSetter(super.getName(), "setFur", fur, false);
		return false;
	}
	
	/**
	 * An implementation of the roar method using the MessageUtility method and the Bear special message 
	 */
	public void roar() {
		MessageUtility.logSound(super.getName(), "Stands on its hind legs, roars and scratches its belly");
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
	 * an eat method for the Bear gets a type of food and checks weather it can eat it and adds weight if eating is possible otherwise returning false
	 * 
	 * @param food
	 *            - a type of food
	 *            
	 * @return boolean
	 *            - Return true if the Bear can eat this food and false if not
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
