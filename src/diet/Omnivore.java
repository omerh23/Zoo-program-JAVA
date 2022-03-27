package diet;

import animals.Animal;
import food.EFoodType;
import food.IEdible;

public class Omnivore implements IDiet{

	@Override
	public boolean canEat(EFoodType food) {
		if (food == EFoodType.MEAT || food == EFoodType.VEGETABLE) {
			return true;
		}
		return false;
	}

	@Override
	public double eat(Animal animal, IEdible food) {
		// add 10% to weight when eating meat
		// add 7% to weight when eating vegetable
		double W = 0;
		EFoodType foodType  = food.getFoodtype();
		if(this.canEat(foodType)) { 	
			if(foodType == EFoodType.MEAT) {
				W = (animal.getWeight()/10);
			}
			if(foodType == EFoodType.VEGETABLE) {
				W = (animal.getWeight()*0.07);				
			}
		}
	
		return W;
	}
	
	
	
	

}
