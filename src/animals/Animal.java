package animals;

import diet.*;
import utilities.*;
import food.*;
import mobility.*;


public abstract class Animal extends Mobile implements IEdible {

	private String name;
	private double weight;
	private IDiet diet;
	
	public Animal(String name, Point location) {
		super(location);
		this.name = name;
	}
	public void makeSound() {}
	public boolean eat(IEdible food) {
		return false;
	}
	public boolean setWeight(double weight) {
		if (weight > 0) {
			this.weight = weight;
			return true;
		}
		return false;
	}
	public boolean setDiet(IDiet diet) {
		this.diet = diet;
		return true;
	}
	
	@Override
	public EFoodType getFoodtype() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getWeight() {
		return this.weight;
	}

}