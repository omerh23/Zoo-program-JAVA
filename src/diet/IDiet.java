package diet;
import animals.*;
import  food.*;
public interface IDiet {
	public boolean canEat(EFoodType food);
	
	public double eat(Animal animal, IEdible food);

}
