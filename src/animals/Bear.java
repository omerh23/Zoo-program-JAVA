package animals;
import diet.Omnivore;
import food.EFoodType;
import food.IEdible;
import mobility.Point;
import utilities.MessageUtility;

public class Bear extends RoarAnimal  {
	
	private String furColor ;
	private static final Point starting_location = new Point(100,5);
	private static final Omnivore diet = new Omnivore();
	public Bear(String name, Point location) {
		super(name,location);
		super.setWeight(308.2);
		this.furColor = "gray";
		MessageUtility.logConstractor("Bear", name);
	}
	public Bear(String name) {
		super(name,starting_location);
		this.furColor = "gray";
		super.setWeight(308.2);
		MessageUtility.logConstractor("Bear", name);
		
	}
	
	public boolean setFur(String fur) {
		if(fur == "gray" || fur == "white" || fur == "black") {
			this.furColor = fur;
			MessageUtility.logSetter(super.getName(), "setFur", fur, true);
			return true;
		}
		MessageUtility.logSetter(super.getName(), "setFur", fur, false);
		return false;
	}
	
	
	public void roar() {
		MessageUtility.logSound(super.getName(), "Stands on its hind legs, roars and scratches its belly");
	}
	
	@Override
	public EFoodType getFoodtype() {
		MessageUtility.logGetter(this.getClass().getSimpleName(), "getFoodType", EFoodType.MEAT);
		return EFoodType.MEAT;
	}
	@Override
	public boolean eat(IEdible food) {
		double W = diet.eat(this, food);
		if(W > 0) {
			super.setWeight(super.getWeight()+W);
			super.makeSound();
			return true;
		}
		return false;
	}
	
	public String toString() {
		return "[" + this.getClass().getSimpleName() + "] ";
		
	}
	

}
