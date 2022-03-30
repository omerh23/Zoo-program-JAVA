package main;

import java.util.InputMismatchException;

import java.util.Scanner;

import animals.Animal;
import animals.*;
import mobility.Point;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		//String animal_name = "";
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
						while(x < 0 ) {
							try {
								System.out.println("Enter location for X:");
								x = sc.nextInt();
							}
							catch(InputMismatchException e){System.out.println("Please enter only numbers");sc.nextLine();}
						}
						
						while(y < 0) {
							try {
								System.out.println("Enter location for Y:");
								y = sc.nextInt();
							}
							catch(InputMismatchException e){System.out.println("Please enter only numbers");sc.nextLine();}
						
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
					
					
											
//						
//					x = -1;
//					y = -1;
//					choose_location = 0;
					
					
		
			}//if right choice on animal
			else {i--;}
			}//try
			catch(InputMismatchException e) {
				System.out.println("Enter only numbers between 1 to 5");
				i--;
				sc.nextLine();}
			
		
				}//for
		
		for(int j = 0; j<animal_arr.length;j++) {
			System.out.println(animal_arr[j]);
			
		}
			
		}//args
					
			
		
	
	} //main class


