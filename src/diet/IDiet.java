package diet;
import animals.*;
import  food.*;
public interface IDiet {
	public boolean canEat(EFoodType food);//return true if the animal cat eat this prey
	
	public double eat(Animal animal, IEdible food); // check if is edible and calculate the weight

}
