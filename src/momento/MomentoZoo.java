package momento;

import java.util.ArrayList;
import java.util.List;

import animals.Animal;
import mobility.Point;

public class MomentoZoo {
	
	private ArrayList<Point> location = null;
	
	public MomentoZoo(ArrayList<Animal> animals) {
		location = new  ArrayList<Point>();
		for(Animal animal : animals) {
			location.add(animal.getLocation());
			
		}
	}
	
	public ArrayList<Point> getState() {
		return location;
	}
	

}
