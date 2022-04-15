package zoo;

import java.util.InputMismatchException;
import java.util.Scanner;

import animals.*;
import food.IEdible;
import mobility.Ilocatable;
import mobility.Point;
import plants.Plant;
import utilities.MessageUtility;
/**
 * An abstract class describing general Zoo actions implementing static methods eat and move
 *
 * @author  Vladislav Shevtsov id: 322162553; Omer Halfon id: 315429951
 * @see     animals
 */
public abstract class ZooActions {
	/**
	 * a static method that gets an animal and food checks if the animal is a known animal and calls the animals eat method
	 * if the animal can eat the food the method returns true otherwise returns false
	 * @param animal
	 *            - an animal object
	 * @param food
	 *            - a type of food          
	 * @return boolean
	 *            - true if the animal can eat the food and false otherwise
	 */
	public static boolean eat(Object animal, IEdible food) {
		
		if(animal instanceof Lion)
		{
			if(((Lion) animal).eat(food)) 
			{
				MessageUtility.logBooleanFunction(((Lion)animal).getName(), "eat","["+ food.getClass().getSimpleName()+"]"+((Animal)food).getName(), true);
				return true;
			}
			else {MessageUtility.logBooleanFunction(((Lion)animal).getName(), "eat","["+ food.getClass().getSimpleName()+"]"+((Animal)food).getName(), false); return false;}
		}
		if(animal instanceof Bear)
		{
			if(((Bear) animal).eat(food)) 
			{
				if(food instanceof Animal) {
				MessageUtility.logBooleanFunction(((Bear)animal).getName(), "eat","["+ food.getClass().getSimpleName()+"]"+((Animal)food).getName(), true);
				return true;
			}
			else {MessageUtility.logBooleanFunction(((Bear)animal).getName(), "eat","["+ food.getClass().getSimpleName()+"]"+((Animal)food).getName(), false); return false;}
			}
			if(food instanceof Plant) {
				MessageUtility.logBooleanFunction(((Lion)animal).getName(), "eat","["+ food.getClass().getSimpleName()+"]", true);
				return true;
			}
			else {MessageUtility.logBooleanFunction(((Lion)animal).getName(), "eat","["+ food.getClass().getSimpleName()+"]", false); return false;}
				
		}
		
		if(animal instanceof Elephant)
		{
			if(((Elephant) animal).eat(food)) 
			{
				MessageUtility.logBooleanFunction(((Elephant)animal).getName(), "eat","["+ food.getClass().getSimpleName()+"]", true);
				return true;
			}			
			else {MessageUtility.logBooleanFunction(((Elephant)animal).getName(), "eat","["+ food.getClass().getSimpleName()+"]"+((Animal)food).getName(), false); return false;}
		}
		if(animal instanceof Giraffe)
		{
			if(((Giraffe) animal).eat(food)) 
			{
				MessageUtility.logBooleanFunction(((Giraffe)animal).getName(), "eat","["+ food.getClass().getSimpleName()+"]", true);
				return true;
			}
			else {MessageUtility.logBooleanFunction(((Giraffe)animal).getName(), "eat","["+ food.getClass().getSimpleName()+"]"+((Animal)food).getName(), false); return false;}
		}
		if(animal instanceof Turtle)
		{
			if(((Turtle) animal).eat(food)) 
			{
				MessageUtility.logBooleanFunction(((Turtle)animal).getName(), "eat","["+ food.getClass().getSimpleName()+"]", true);
				return true;
			}
			else {MessageUtility.logBooleanFunction(((Turtle)animal).getName(), "eat","["+ food.getClass().getSimpleName()+"]"+((Animal)food).getName(), false); return false;}
		}
		//if animal is not a known animal		
		return false; 
	}
	
	/**
	 * a static method that gets an animal and a point checks if the point is within bounds
	 * if the animal is a known animal and moves the animal
	 * @param animal
	 *            - an animal object
	 * @param point
	 *            - a point object         
	 * @return boolean
	 *            - true if the animal moved successfully and false otherwise
	 */
	public static boolean  move(Object animal, Point point){
		
		double distance = 0;
		double weight = 0;
		if(!Point.checkBoundaris(point)) {MessageUtility.logBooleanFunction(((Animal)animal).getName(), "move","("+ point.get_x()+","+point.get_y()+")", false);
		return false; }
		// else move on to check animals
		if(animal instanceof Lion)
		{
			distance = ((Lion) animal).move(point);
			double animal_weight = ((Lion) animal).getWeight();
			weight = animal_weight - (distance*animal_weight*0.00025);
			MessageUtility.logBooleanFunction(((Lion)animal).getName(), "move","("+ point.get_x()+","+point.get_y()+")", true);
			return ((Lion) animal).setWeight(weight);
		}
		if(animal instanceof Bear)
		{
			distance = ((Bear) animal).move(point);
			double animal_weight = ((Bear) animal).getWeight();
			weight = animal_weight - (distance*animal_weight*0.00025);
			MessageUtility.logBooleanFunction(((Bear)animal).getName(), "move","("+ point.get_x()+","+point.get_y()+")", true);
			return ((Bear) animal).setWeight(weight);
		}
		if(animal instanceof Elephant)
		{
			distance = ((Elephant) animal).move(point);
			double animal_weight = ((Elephant) animal).getWeight();
			weight = animal_weight - (distance*animal_weight*0.00025);
			MessageUtility.logBooleanFunction(((Elephant)animal).getName(), "move","("+ point.get_x()+","+point.get_y()+")", true);
			return ((Elephant) animal).setWeight(weight);
		}
		if(animal instanceof Giraffe)
		{
			distance = ((Giraffe) animal).move(point);
			double animal_weight = ((Giraffe) animal).getWeight();
			weight = animal_weight - (distance*animal_weight*0.00025);
			MessageUtility.logBooleanFunction(((Giraffe)animal).getName(), "move","("+ point.get_x()+","+point.get_y()+")", true);
			return ((Giraffe) animal).setWeight(weight);
		}
		if(animal instanceof Turtle)
		{
			distance = ((Turtle) animal).move(point);
			double animal_weight = ((Turtle) animal).getWeight();
			weight = animal_weight - (distance*animal_weight*0.00025);
			MessageUtility.logBooleanFunction(((Turtle)animal).getName(), "move","("+ point.get_x()+","+point.get_y()+")", true);
			return ((Turtle) animal).setWeight(weight);
		}
		//if animal is not a known animal		
		return false; 
		
	}
//public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//		Scanner sd = new Scanner(System.in);
//		
//		int arr_size = -1;
//		while(arr_size <3) {
//			try {
//				System.out.println("Enter a size of array (minimun 3): ");
//				arr_size = sc.nextInt();
//			}
//			catch(InputMismatchException e){System.out.println("Please enter only numbers");sc.nextLine();}
//		}
//		Animal animal_arr[] = new Animal[arr_size];
//		int animal_choice = -1;
//		int choose_location = 0;
//		int x = -1;
//		int y = -1 ;
//		
//		for(int i = 0 ; i < arr_size ; i++) 
//		{
//			try {
//				System.out.println("\nPlease choose an animal to put in the array:\n1. Lion\n2. Bear\n3. Elephant\n4. Giraffe\n5. Turtle\n");
//				animal_choice = sc.nextInt();
//				if(animal_choice >0 && animal_choice <6) {
//					System.out.println("Enter Animal name");
//					String animal_name =  sd.nextLine();
//					while(choose_location != 1 && choose_location != 2 ) {
//						try {
//							
//							System.out.println("Do you want to enter starting location?\n1. yes\n2. no");
//							choose_location = sc.nextInt();
//						}
//						catch(InputMismatchException e){System.out.println("Please enter only numbers");sc.nextLine();}
//					}
//					if(choose_location == 1) {
//						while(x < 0 || x > 800) {
//							try {
//								System.out.println("Enter location for X:(max X is 800)");
//								x = sc.nextInt();
//							}
//							catch(InputMismatchException e){System.out.println("Please enter only numbers,max X is 800");sc.nextLine();}
//						}
//						
//						while(y < 0 || y > 600) {
//							try {
//								System.out.println("Enter location for Y:(max Y is 600)");
//								y = sc.nextInt();
//							}
//							catch(InputMismatchException e){System.out.println("Please enter only numbers, max Y is 600");sc.nextLine();}
//						
//						}	
//						}
//				
//					if(animal_choice == 1 && choose_location == 1 ) { //Lion
//						Animal lion = new Lion(animal_name,new Point(x,y));
//						animal_arr[i] = lion;
//						
//					}
//							
//					else if(animal_choice == 1 && choose_location != 1 ) {
//						Animal lion = new Lion(animal_name);
//						animal_arr[i] = lion;
//						}
//					
//					
//					
//					if(animal_choice == 2 && choose_location == 1 ) { //Bear
//						Animal bear = new Bear(animal_name,new Point(x,y));
//						animal_arr[i] = bear;
//					}
//							
//					else if(animal_choice == 2 && choose_location != 1 ) {
//						Animal bear = new Bear(animal_name);
//						animal_arr[i] = bear;
//						}
//					
//					
//					
//					if(animal_choice == 3 && choose_location == 1 ) { //Elephant
//						Animal elephant = new Elephant(animal_name,new Point(x,y));
//						animal_arr[i] = elephant;
//					}
//							
//					else if(animal_choice == 3 && choose_location != 1 ) {
//						Animal elephant = new Elephant(animal_name);
//						animal_arr[i] = elephant;
//						}
//					
//					
//					
//					if(animal_choice == 4 && choose_location == 1 ) { //Giraffe
//						Animal giraffe = new Giraffe(animal_name,new Point(x,y));
//						animal_arr[i] = giraffe;
//					}
//							
//					else if(animal_choice == 4 && choose_location != 1 ) {
//						Animal giraffe = new Giraffe(animal_name);
//						animal_arr[i] = giraffe;
//						}
//					
//					
//					
//					if(animal_choice == 5 && choose_location == 1 ) { //Turtle
//						Animal turtle = new Turtle(animal_name,new Point(x,y));
//						animal_arr[i] = turtle;
//					}
//							
//					else if(animal_choice == 5 && choose_location != 1 ) {
//						Animal turtle = new Turtle(animal_name);
//						animal_arr[i] = turtle;
//						}
//					
//					
//											
//						
//					x = -1;
//					y = -1;
//					choose_location = 0;
//					
//					
//		
//			}//if right choice on animal
//			else {i--;}
//			}//try
//			catch(InputMismatchException e) {
//				System.out.println("Enter only numbers between 1 to 5");
//				i--;
//				sc.nextLine();}
//			
//		
//				}//for
//		
//		
//		for(int j = 0; j<animal_arr.length;j++) {
//			System.out.println("\n\n");
//			animal_arr[j].getName();
//			
//			do {
//				try {
//					
//					System.out.println("\nEnter location for X:(max X is 800)");
//					x = sc.nextInt();
//					System.out.println("Enter location for Y:(max Y is 600)");
//					y = sc.nextInt();
//					if(!Point.checkBoundaris(new Point(x,y))){
//						System.out.println("\nThe point entered is invalid, please try again");
//					}
//				}
//				catch(InputMismatchException e){System.out.println("Please enter only numbers, max Y is 600 and max X is 800");sc.nextLine();}
//				}while(!Point.checkBoundaris(new Point(x,y)));
//	
//			ZooActions.move(animal_arr[j], new Point(x,y));
//			System.out.print("\n");
//			
//		}
//		
//		int random_Animal_1 = -1;
//		int random_Animal_2 = -1;
//		
//		for(int j = 0; j<animal_arr.length / 2 ;j++) {
//			
//			do {
//				random_Animal_1 = (int)Math.floor(Math.random()*(animal_arr.length));
//				random_Animal_2 = (int)Math.floor(Math.random()*(animal_arr.length));
//			}while(random_Animal_1 == random_Animal_2);
//			ZooActions.eat(animal_arr[random_Animal_1], animal_arr[random_Animal_2]);
//			
//		}
//		
//		
//		}//arguments
}


