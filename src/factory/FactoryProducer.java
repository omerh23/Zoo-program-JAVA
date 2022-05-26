package factory;

import diet.Carnivore;
import diet.Herbivore;
import diet.IDiet;
import diet.Omnivore;

public class FactoryProducer {
	
	public static IDiet getFactory(String st) {
		if (st == "Carnivore") 
			return new Carnivore();
		
		else if (st == "Herbivore") 
			 return new Herbivore();
		
		else if (st == "Herbivore") 
			return new Herbivore();
		
		else if (st == "Omnivore") 
			return new Omnivore();
		
		return null;
	}

}
