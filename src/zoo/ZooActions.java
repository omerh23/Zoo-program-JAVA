package zoo;

import animals.*;
import food.IEdible;

public class ZooActions {
	
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
}
