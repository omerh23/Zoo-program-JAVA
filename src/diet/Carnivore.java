package diet;
import animals.Animal;
import food.EFoodType;
import food.IEdible;



public class Carnivore implements IDiet {
	
	@Override
	public boolean canEat(EFoodType food) {
		if (food == EFoodType.MEAT) {
			return true;
		}
		
		return false;
	}

	@Override
	public double eat(Animal animal, IEdible food) {
		double W = 0;
		EFoodType foodType  = food.getFoodtype();
		if(this.canEat(foodType)) 
			W = (animal.getWeight()/10);
		return W;
	}
	


}
