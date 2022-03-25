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
	public void makeSound() {
		
		if(this.getClass()== Lion.class) {
			Lion temp = (Lion)this;
			temp.roar();
		}
		
		if(this.getClass()== Bear.class) {
			Bear temp = (Bear)this;
			temp.roar();
		}
		
		if(this.getClass()== Elephant.class) {
			Elephant temp = (Elephant)this;
			temp.chew();
			
		}
			
		
	}

	
	
	public abstract boolean eat(IEdible food);
	
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
	
	
	
	public String getName() {
		return this.name;
	}
	
	public double getWeight() {
		return this.weight;
	}
	public void walk(Point d) //helper function for movement different from "move"
	{
		double distacne = super.move(d);
		double W = this.getWeight()-(distacne*this.getWeight()*0.00025);
		this.setWeight(W);
	}
	

}