package main;

import java.util.InputMismatchException;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;
import java.util.Random;
import animals.*;
import mobility.Point;
import zoo.*;


/**
 * the main class that is running the program
 *
 * @author Vladislav Shevtsov id: 322162553; Omer Halfon id: 315429951
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Scanner sd = new Scanner(System.in);
		
		int arr_size = -1;
		while(arr_size <3) {
			try {
				System.out.println("Enter a size of array (minimun 3): ");
				arr_size = sc.nextInt();
			}
			catch(InputMismatchException e){System.out.println("Please enter only numbers");sc.nextLine();}
		}
		Animal animal_arr[] = new Animal[arr_size];
		int animal_choice = -1;
		int choose_location = 0;
		int x = -1;
		int y = -1 ;
		
		for(int i = 0 ; i < arr_size ; i++) 
		{
			try {
				System.out.println("\nPlease choose an animal to put in the array:\n1. Lion\n2. Bear\n3. Elephant\n4. Giraffe\n5. Turtle\n");
				animal_choice = sc.nextInt();
				if(animal_choice >0 && animal_choice <6) {
					System.out.println("Enter Animal name");
					String animal_name =  sd.nextLine();
					while(choose_location != 1 && choose_location != 2 ) {
						try {
							
							System.out.println("Do you want to enter starting location?\n1. yes\n2. no");
							choose_location = sc.nextInt();
						}
						catch(InputMismatchException e){System.out.println("Please enter only numbers");sc.nextLine();}
					}
					if(choose_location == 1) {
						while(x < 0 || x > 800) {
							try {
								System.out.println("Enter location for X:(max X is 800)");
								x = sc.nextInt();
							}
							catch(InputMismatchException e){System.out.println("Please enter only numbers,max X is 800");sc.nextLine();}
						}
						
						while(y < 0 || y > 600) {
							try {
								System.out.println("Enter location for Y:(max Y is 600)");
								y = sc.nextInt();
							}
							catch(InputMismatchException e){System.out.println("Please enter only numbers, max Y is 600");sc.nextLine();}
						
						}	
						}
				
					if(animal_choice == 1 && choose_location == 1 ) { //Lion
						Animal lion = new Lion(animal_name,new Point(x,y));
						animal_arr[i] = lion;
						
					}
							
					else if(animal_choice == 1 && choose_location != 1 ) {
						Animal lion = new Lion(animal_name);
						animal_arr[i] = lion;
						}
					
					
					
					if(animal_choice == 2 && choose_location == 1 ) { //Bear
						Animal bear = new Bear(animal_name,new Point(x,y));
						animal_arr[i] = bear;
					}
							
					else if(animal_choice == 2 && choose_location != 1 ) {
						Animal bear = new Bear(animal_name);
						animal_arr[i] = bear;
						}
					
					
					
					if(animal_choice == 3 && choose_location == 1 ) { //Elephant
						Animal elephant = new Elephant(animal_name,new Point(x,y));
						animal_arr[i] = elephant;
					}
							
					else if(animal_choice == 3 && choose_location != 1 ) {
						Animal elephant = new Elephant(animal_name);
						animal_arr[i] = elephant;
						}
					
					
					
					if(animal_choice == 4 && choose_location == 1 ) { //Giraffe
						Animal giraffe = new Giraffe(animal_name,new Point(x,y));
						animal_arr[i] = giraffe;
					}
							
					else if(animal_choice == 4 && choose_location != 1 ) {
						Animal giraffe = new Giraffe(animal_name);
						animal_arr[i] = giraffe;
						}
					
					
					
					if(animal_choice == 5 && choose_location == 1 ) { //Turtle
						Animal turtle = new Turtle(animal_name,new Point(x,y));
						animal_arr[i] = turtle;
					}
							
					else if(animal_choice == 5 && choose_location != 1 ) {
						Animal turtle = new Turtle(animal_name);
						animal_arr[i] = turtle;
						}
					
					
											
						
					x = -1;
					y = -1;
					choose_location = 0;
					
					
		
			}//if right choice on animal
			else {i--;}
			}//try
			catch(InputMismatchException e) {
				System.out.println("Enter only numbers between 1 to 5");
				i--;
				sc.nextLine();}
			
		
				}//for
		
		
		for(int j = 0; j<animal_arr.length;j++) {
			System.out.println("\n\n");
			animal_arr[j].getName();
			
			do {
				try {
					
					System.out.println("\nEnter location for X:(max X is 800)");
					x = sc.nextInt();
					System.out.println("Enter location for Y:(max Y is 600)");
					y = sc.nextInt();
					if(!Point.checkBoundaris(new Point(x,y))){
						System.out.println("\nThe point entered is invalid, please try again");
					}
				}
				catch(InputMismatchException e){System.out.println("Please enter only numbers, max Y is 600 and max X is 800");sc.nextLine();}
				}while(!Point.checkBoundaris(new Point(x,y)));
	
			ZooActions.move(animal_arr[j], new Point(x,y));	
			
		}
		
		
		
		for(int j = 0; j<animal_arr.length / 2 ;j++) {
			int random_Animal_1 = (int)Math.floor(Math.random()*(animal_arr.length));
			int random_Animal_2 = (int)Math.floor(Math.random()*(animal_arr.length));
			System.out.println(ZooActions.eat(animal_arr[random_Animal_1], animal_arr[random_Animal_2]));
			
				
			
		}
		
		
		}//arguments
					
			
		
	
	} //main class


