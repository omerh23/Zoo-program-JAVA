package animals;
import java.awt.*;
import java.awt.image.BufferedImage;
import diet.*;
import utilities.*;
import food.*;
import graphics.*;
import mobility.*;
import mobility.Point;


/**
 * An abstract class describing animals inherits from mobile class and implaments IEdible interface
 *
 * @author  Vladislav Shevtsov id: 322162553; Omer Halfon id: 315429951
 * @see     Mobile, IEdible
 */

public abstract class Animal extends Mobile implements IEdible,IAnimalBehavior,IDrawable {

	private String name;
	private double weight;
	private IDiet diet;
	private final int EAT_DISTANCE = 10;
	private int size;
	private String col;
	private int horSpeed;
	private int verSpeed;
	private boolean coordChanged;
	private Thread thread;
	private int x_dir;
	private int y_dir;
	private int eatCount;
	private ZooPanel pan;
	private BufferedImage img1, img2;
	
	/**
	 * A constructor for the animal class.
	 * 
	 * @param name
	 *            - Name of the Animal
	 * @param location
	 *            - Starting location of the animal
	 */
	public Animal(String name, Point location) {
		super(location);
		this.name = name;
		MessageUtility.logConstractor("Animal", name);
	}
	
	
	
	
	/**
	 * An abstract declaration for the makeSound method to be initialized in later classes
	 */
	public abstract void makeSound();
		
	/**
	 * An abstract declaration for the eat method to be initialized in later classes
	 */
	public abstract boolean eat(IEdible food);
	/**
	 * Setter method for the weight variable
	 * 
	 * @param weight
	 *            - Weight of the Animal
	 *            
	 * @return boolean
	 *            - Return true if the setter succeeded and false otherwise
	 */
	public boolean setWeight(double weight) {
		if (weight > 0) {
			this.weight = weight;
			MessageUtility.logSetter(this.name, "setWeight", this.weight, true);
			return true;
		}
		MessageUtility.logSetter(this.name, "setWeight", this.weight, false);
		return false;
	}
	/**
	 * Setter method for the diet variable
	 * 
	 * @param diet
	 *            - Diet of the Animal
	 *            
	 * @return boolean
	 *            - Return true if the setter succeeded 
	 */
	public boolean setDiet(IDiet diet) { 
		this.diet = diet;
		MessageUtility.logSetter(this.name, "setDiet", this.diet.getClass().getSimpleName(), true);
		return true;
		}
	
	
	/**
	 * Getter method for the name variable
	 * 
	 * @return name
	 *            - Returns the name of the animal
	 */
	public String getName() {
		MessageUtility.logGetter(this.name, "getName", this.name);
		return this.name;
	}
	/**
	 * Getter method for the weight variable
	 * 
	 * @return weight
	 *            - Returns the weight of the animal
	 */
	public double getWeight() {
		MessageUtility.logGetter(this.name, "getWeight", this.weight);
		return this.weight;
	}
	
	/**
	 * toString method of the class
	 * 
	 * 
	 * @return String
	 *            - Returns String representation of the object of this class
	 */
public String toString() {
	
		return "[" + this.getClass().getSimpleName() +  "]" + this.name + "\ttotal distance:" + String.format("%.2f", super.getDistance())+ "\tweight:" + this.getWeight();
		
	}

}