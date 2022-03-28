package main;

import java.util.Scanner;

import animals.Animal;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr_size = -1;
		while(arr_size <3) {
			System.out.println("Enter a size of array (minimun 3): ");
			arr_size = sc.nextInt();
		}
		Animal animal_arr[] = new Animal[arr_size];
		int animal_choice = -1;
		while(animal_choice <1) {
			System.out.println("Please choose an animal to put in the array:\n1. Lion\n2. Bear\n3. Elephant\n4. Giraffe\n5. Turtle\n");
			animal_choice = sc.nextInt();
		}
		switch(animal_choice) {
		case 1: //Lion
			break;
		case 2: //Bear
			break;
		case 3: //Elephant
			break;
		case 4: //Giraffe
			break;
		case 5: //Turtle
			break;
		default:
			break;
			
			
		}
		
		}
	}


