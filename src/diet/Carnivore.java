package diet;
import animals.Animal;
import food.EFoodType;
import food.IEdible;



public class Carnivore implements IDiet {
	
	@Override
	public boolean canEat(EFoodType food) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public double eat(Animal animal, IEdible food) {
		// to add 10% to weight
		return 0;
	}
	


}
