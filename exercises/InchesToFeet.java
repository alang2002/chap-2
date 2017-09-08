package exercises;

import java.util.Scanner;

public class InchesToFeet {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner inputDevice = new Scanner(System.in);
		float inches;
		int feet;
		float leftoverInches;
		final int INCHES_IN_FOOT = 12;
		
		System.out.print("Enter a number of inches (can be decimals) >> ");
		inches = inputDevice.nextFloat();
		feet = (int) (inches / INCHES_IN_FOOT);
		leftoverInches = (float) (inches % INCHES_IN_FOOT);
		
		System.out.println("There are " + feet + " feet and " + leftoverInches + " inches in " + inches + " inches.");

	}

}
