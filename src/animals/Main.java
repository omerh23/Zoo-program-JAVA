package animals;

import java.awt.Point;
import food.EFoodType;
import food.IEdible;

public class Main {

	public static void main(String[] args)
	{
		
		IEdible dambo = new Elephant("dambo");
		Animal Baloo = new Bear("Baloo");
		Baloo.eat(dambo);
		//simba.getFoodtype();
		
	}

}
