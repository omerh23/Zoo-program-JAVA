package animals;

import java.awt.Point;
import food.EFoodType;
import food.IEdible;

public class Main {

	public static void main(String[] args)
	{
		
		IEdible dambo = new Elephant("dambo");
		Animal simba = new Lion("simba");
		simba.eat(dambo);
		
	

	}

}
