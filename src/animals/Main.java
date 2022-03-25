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
		System.out.println(simba.getWeight());
		simba.walk(p);
		System.out.println(simba.getWeight());
		
		//simba.getFoodtype();
		
	}

}
