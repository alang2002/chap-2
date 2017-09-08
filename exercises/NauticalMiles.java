package exercises;

import java.util.Scanner;

public class NauticalMiles {

	public static void main(String[] args) {
		final double KILOMETERS_IN_N_MILE = 1.852;
		final double MILES_IN_N_MILE = 1.150779;
		int nauticalMiles;
		@SuppressWarnings("resource")
		Scanner inputDevice = new Scanner(System.in);
		
		System.out.println("Enter a number of nautical miles >> ");
		nauticalMiles = inputDevice.nextInt();
		float kilometers = (float) (nauticalMiles / KILOMETERS_IN_N_MILE);
		float miles =  (float) (nauticalMiles / MILES_IN_N_MILE);

		System.out.println("There are " + kilometers + " kilometers and " + miles + " miles in " + nauticalMiles + " nautical miles.");
		
		
	}

}
