package zoo;

import animals.*;
import food.IEdible;
import mobility.Ilocatable;
import mobility.Point;
/**
 * An abstract class describing general Zoo actions implementing static methods eat and move
 *
 * @author  Vladislav Shevtsov id: 322162553; Omer Halfon id: 315429951
 * @see     animals
 */
public abstract class ZooActions {
	/**
	 * a static method that gets an animal and food checks if the animal is a known animal and calls the animals eat method
	 * if the animal can eat the food the method returns true otherwise returns false
	 * @param animal
	 *            - an animal object
	 * @param food
	 *            - a type of food          
	 * @return boolean
	 *            - true if the animal can eat the food and false otherwise
	 */
	public static boolean eat(Object animal, IEdible food) {
		
		if(animal instanceof Lion)
		{
			if(((Lion) animal).eat(food)) 
			{
				return true;
			}
			else { return false;}
		}
		if(animal instanceof Bear)
		{
			if(((Bear) animal).eat(food)) 
			{
				return true;
			}
			else { return false;}
		}
		if(animal instanceof Elephant)
		{
			if(((Elephant) animal).eat(food)) 
			{
				return true;
			}			
			else { return false;}
		}
		if(animal instanceof Giraffe)
		{
			if(((Giraffe) animal).eat(food)) 
			{
				return true;
			}
			else { return false;}
		}
		if(animal instanceof Turtle)
		{
			if(((Turtle) animal).eat(food)) 
			{
				return true;
			}
			else { return false;}
		}
		//if animal is not a known animal		
		return false; 
	}
	
	/**
	 * a static method that gets an animal and a point checks if the point is within bounds
	 * if the animal is a known animal and moves the animal
	 * @param animal
	 *            - an animal object
	 * @param point
	 *            - a point object         
	 * @return boolean
	 *            - true if the animal moved successfully and false otherwise
	 */
	public static boolean  move(Object animal, Point point){
		
		double distance = 0;
		double weight = 0;
		if(!Point.checkBoundaris(point)) { return false; }
		// else move on to check animals
		if(animal instanceof Lion)
		{
			
			distance = ((Lion) animal).move(point);
			double animal_weight = ((Lion) animal).getWeight();
			weight = animal_weight - (distance*animal_weight*0.00025);
			return ((Lion) animal).setWeight(weight);
		}
		if(animal instanceof Bear)
		{
			distance = ((Bear) animal).move(point);
			double animal_weight = ((Bear) animal).getWeight();
			weight = animal_weight - (distance*animal_weight*0.00025);
			return ((Bear) animal).setWeight(weight);
		}
		if(animal instanceof Elephant)
		{
			distance = ((Elephant) animal).move(point);
			double animal_weight = ((Elephant) animal).getWeight();
			weight = animal_weight - (distance*animal_weight*0.00025);
			return ((Elephant) animal).setWeight(weight);
		}
		if(animal instanceof Giraffe)
		{
			distance = ((Giraffe) animal).move(point);
			double animal_weight = ((Giraffe) animal).getWeight();
			weight = animal_weight - (distance*animal_weight*0.00025);
			return ((Giraffe) animal).setWeight(weight);
		}
		if(animal instanceof Turtle)
		{
			distance = ((Turtle) animal).move(point);
			double animal_weight = ((Turtle) animal).getWeight();
			weight = animal_weight - (distance*animal_weight*0.00025);
			return ((Turtle) animal).setWeight(weight);
		}
		//if animal is not a known animal		
		return false; 
		
	}
}


