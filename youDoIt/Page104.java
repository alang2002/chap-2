package youDoIt;

import java.util.Scanner;

public class Page104 {

	public static void main(String[] args) {
		int firstNumber;
		int secondNumber;
		int sum;
		int difference;
		double average;
		
		@SuppressWarnings("resource")
		Scanner inputDevice = new Scanner(System.in);
		
		System.out.print("Please enter a double >> ");
		firstNumber = inputDevice.nextInt();
		System.out.print("Please enter another double >> ");
		secondNumber = inputDevice.nextInt();
		
		sum = firstNumber + secondNumber;
		difference = firstNumber - secondNumber;
		average = (double) sum / 2.0;
		
		System.out.println(firstNumber + " + " + secondNumber + " is " + sum);
		System.out.println(firstNumber + " - " + secondNumber + " is " + difference);
		System.out.println("The average of " + firstNumber + " and " + secondNumber + " is " + average);

	}

}
