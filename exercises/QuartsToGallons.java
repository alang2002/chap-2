package exercises;

import java.util.Scanner;

public class QuartsToGallons {

	public static void main(String[] args) {
		final int NUMBER_OF_QUARTS = 4;
		int paintingJobQuarts;
		@SuppressWarnings("resource")
		Scanner inputDevice = new Scanner(System.in);
		
		System.out.println("How many quarts of paint do you need for the painting job?");
		paintingJobQuarts = inputDevice.nextInt();
		
		int gallons = paintingJobQuarts / NUMBER_OF_QUARTS;
		int quarts = paintingJobQuarts % NUMBER_OF_QUARTS;
		
		System.out.println("A painting job that needs to use " + paintingJobQuarts + " quarts requires "
				+ gallons + " gallons and " + quarts + " quarts of paint.");

	}

}
