package zoo;

import animals.*;
import food.IEdible;

public class ZooActions {
	
	public static boolean eat(Object animal, IEdible food) {
		
		if(animal instanceof Lion) {
			if(((Lion) animal).eat(food)) {
				return true;
			}
			
		}
				
		return false;
		
	}

}
