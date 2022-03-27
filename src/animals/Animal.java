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
		MessageUtility.logConstractor("Animal", name);
	}
	
	public abstract void makeSound();
		
		
	public abstract boolean eat(IEdible food);
	
	public boolean setWeight(double weight) {
		if (weight > 0) {
			this.weight = weight;
			MessageUtility.logSetter(this.name, "setWeight", this.weight, true);
			return true;
		}
		MessageUtility.logSetter(this.name, "setWeight", this.weight, false);
		return false;
	}
	public boolean setDiet(IDiet diet) { 
		this.diet = diet;
		MessageUtility.logSetter(this.name, "setDiet", this.diet, true);
		return true;
		}
	
	
	
	public String getName() {
		MessageUtility.logGetter(this.name, "getName", this.name);
		return this.name;
	}
	
	public double getWeight() {
		MessageUtility.logGetter(this.name, "getWeight", this.weight);
		return this.weight;
	}
	public void walk(Point d) //helper function for movement different from "move"
	{
		double distacne = super.move(d);
		double W = this.getWeight()-(distacne*this.getWeight()*0.00025);
		this.setWeight(W);
	}
	
public String toString() {
	
		return "[" + this.getClass().getSimpleName() +  "]" + this.name + "\ttotal distance:" + String.format("%.2f", super.getDistance())+ "\tweight:" + this.getWeight();
		
	}

}