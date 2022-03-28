package zoo;

import animals.*;
import food.IEdible;
import mobility.Point;

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
	
	
	public static boolean  move(Object animal, Point point){
		double distance = 0;
		double weight = 0;
		if(!Point.checkBoundaris(point)) { return false; }
		// else move on to check animals
		if(animal instanceof Lion)
		{
			distance = ((Lion) animal).calcDistance(point);
			double animal_weight = ((Lion) animal).getWeight();
			weight = animal_weight - (distance*animal_weight*0.00025);
			return ((Lion) animal).setWeight(weight);
		}
		if(animal instanceof Bear)
		{
			distance = ((Bear) animal).calcDistance(point);
			double animal_weight = ((Bear) animal).getWeight();
			weight = animal_weight - (distance*animal_weight*0.00025);
			return ((Bear) animal).setWeight(weight);
		}
		if(animal instanceof Elephant)
		{
			distance = ((Elephant) animal).calcDistance(point);
			double animal_weight = ((Elephant) animal).getWeight();
			weight = animal_weight - (distance*animal_weight*0.00025);
			return ((Elephant) animal).setWeight(weight);
		}
		if(animal instanceof Giraffe)
		{
			distance = ((Giraffe) animal).calcDistance(point);
			double animal_weight = ((Giraffe) animal).getWeight();
			weight = animal_weight - (distance*animal_weight*0.00025);
			return ((Giraffe) animal).setWeight(weight);
		}
		if(animal instanceof Turtle)
		{
			distance = ((Turtle) animal).calcDistance(point);
			double animal_weight = ((Turtle) animal).getWeight();
			weight = animal_weight - (distance*animal_weight*0.00025);
			return ((Turtle) animal).setWeight(weight);
		}
		//if animal is not a known animal		
		return false; 
		
	}
}


