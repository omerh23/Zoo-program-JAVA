package diet;

import animals.Animal;
import food.EFoodType;
import food.IEdible;

public class Omnivore implements IDiet{

	@Override
	public boolean canEat(EFoodType food) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public double eat(Animal animal, IEdible food) {
		// add 10% to weight when eating meat
		// add 7% to weight when eating vegetable
		return 0;
	}
	
	
	
	

}
