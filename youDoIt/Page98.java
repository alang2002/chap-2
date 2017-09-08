package youDoIt;

import java.util.Scanner;

public class Page98 {

	public static void main(String[] args) {
		//Everything has been switched to the format of ArithmeticDemo2
		
		double firstNumber;
		double secondNumber;
		double sum;
		double difference;
		double average;
		
		@SuppressWarnings("resource")
		Scanner inputDevice = new Scanner(System.in);
		
		System.out.print("Please enter a double >> ");
		firstNumber = inputDevice.nextDouble();
		System.out.print("Please enter another double >> ");
		secondNumber = inputDevice.nextDouble();
		
		sum = (double)firstNumber + secondNumber;
		difference = (double)firstNumber - secondNumber;
		average = (double)sum / 2;
		
		System.out.println(firstNumber + " + " + secondNumber + " is " + sum);
		System.out.println(firstNumber + " - " + secondNumber + " is " + difference);
		System.out.println("The average of " + firstNumber + " and " + secondNumber + " is " + average);

	}

}
