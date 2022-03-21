package animals;

import diet.*;
import food.*;
import mobility.*;


public  class Animal extends Mobile implements IEdible {

	private String name;
	private double weight;
	private IDiet diet;
	
	public Animal(String name, Point location) {
		super(location);
		this.name = name;
		
	
		
	}
	
	
	
	
	
	@Override
	public EFoodType getFoodtype() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
