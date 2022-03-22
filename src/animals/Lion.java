package animals;
import java.util.Random;
import diet.Carnivore;
import food.EFoodType;
import food.IEdible;
import mobility.Point;
import utilities.MessageUtility;

public class Lion extends Animal {

	private static final Point starting_location = new Point(20,0);
	private static final Carnivore diet = new Carnivore();
	private int scarCount = 0;
	public Lion(String name) {
		super(name, starting_location);
		super.setWeight(408.2);
		super.setDiet(diet);
	}
	public EFoodType getFoodType() {
		MessageUtility.logGetter(this.getClass().getSimpleName(), "getFoodType", EFoodType.NOTFOOD);
		return EFoodType.NOTFOOD;
	}
	
	public void roar() {
		
		
	}
	
	public void makeSound() {
		MessageUtility.logSound(super.getName(), "roar");
	}
	
	public boolean eat(IEdible IE) {
		if(diet.canEat(IE.getFoodtype())) {
			double W = super.getWeight()+ (super.getWeight()/10);
			super.setWeight(W);
			boolean val = new Random().nextInt(50)==0;
			if (val)
				this.scarCount += 1;
			return true;
		}
		return false;
			
		
	}

}