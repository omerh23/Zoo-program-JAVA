package diet;

import animals.Animal;
import food.EFoodType;
import food.IEdible;

public class Herbivore implements IDiet{

	@Override
	public boolean canEat(EFoodType food) {
		if (food == EFoodType.VEGETABLE) {
			return true;
		}
		
		return false;
	}

	@Override
	public double eat(Animal animal, IEdible food) {
		// add 7% to weight when eating vegetable
		double W = 0;
		if(this.canEat(food.getFoodtype())) 
			W = (animal.getWeight()*0.07);
	
		return W;
	}
	

}
