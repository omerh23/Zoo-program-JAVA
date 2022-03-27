package animals;

import java.awt.Point;
import food.EFoodType;
import food.IEdible;

public class Main {

	public static void main(String[] args)
	{
		Animal dambo = new Elephant("dambo");
		Animal simba = new Lion("simba");
		simba.eat(dambo);
		mobility.Point p  = new mobility.Point(405,13);
		simba.move(p);
		System.out.println(simba.toString());
		simba.makeSound();
		
		
		//simba.getFoodtype();
		
	}

}
