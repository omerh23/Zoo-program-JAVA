package animals;

import mobility.Point;
/**
 * An abstract class describing animals that chew implementing the makeSound method and defines the chew method, inherits from Animal class
 *
 * @authors  Vladislav Shevtsov id: 322162553; Omer Halfon id: 315429951
 * @see     Animal
 */
public abstract class ChewAnimal extends Animal {
	/**
	 * A constructor for the RoarAnimal class.
	 * 
	 * @param name
	 *            - Name of the ChewAnimal
	 * @param location
	 *            - Starting location of the ChewAnimal
	 */
	public ChewAnimal(String name, Point location) {
		super(name, location);
		
	}
	/**
	 * An implementation of the makeSound method calling the chew method
	 */
	public void makeSound() {
		this.chew();
	}
	/**
	 * A declaration of the chew method.
	 */
	public abstract void chew();

	
}
