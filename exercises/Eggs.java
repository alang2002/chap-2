package exercises;

import java.util.Scanner;

public class Eggs {

	public static void main(String[] args) {
		 final double DOZEN_EGGS_PRICE = 3.25;
		 final double INDIVIDUAL_EGGS = .45;
		 final int NUMBER_IN_DOZEN = 12;
		 int eggs;
		 int dozen;
		 int looseEggs;
		 double totalCost;
		 @SuppressWarnings("resource")
		 Scanner inputDevice = new Scanner(System.in);
		 
		 System.out.println("How many eggs are you ordering?");
		 eggs = inputDevice.nextInt();
		 
		 dozen = eggs / NUMBER_IN_DOZEN;
		 looseEggs = eggs % NUMBER_IN_DOZEN;
		 totalCost = (DOZEN_EGGS_PRICE * dozen) + (looseEggs * INDIVIDUAL_EGGS);
		 
		 System.out.println("Amount of Ordered Eggs: " + eggs + "\nAt $" + DOZEN_EGGS_PRICE + " per dozen and $" + INDIVIDUAL_EGGS
				 + " per individual egg, that brings a total of $" + totalCost + " (" + dozen + " dozen eggs and " + looseEggs 
				 	+ " individual eggs ordered).");

	}

}
