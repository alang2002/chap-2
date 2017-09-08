package gameZone;

import java.util.Scanner;

public class MadLibsExercise {

	public static void main(String[] args) {
		String color, ending, bodyPart, animal, noun, pluralNoun;
		@SuppressWarnings("resource")
		Scanner inputDevice = new Scanner(System.in);
		
		System.out.print("Enter a color:");
		color = inputDevice.nextLine();
		System.out.print("Enter a word that ends in 'est':");
		ending = inputDevice.nextLine();
		System.out.print("Enter a body part of your choice:");
		bodyPart = inputDevice.nextLine();
		System.out.print("Enter an animal of your choice:");
		animal = inputDevice.nextLine();
		System.out.print("Enter any noun:");
		noun = inputDevice.nextLine();
		System.out.print("Enter any plural noun:");
		pluralNoun = inputDevice.nextLine();
		
		int a;
		System.out.print("Choose a number under 12:");
		a = inputDevice.nextInt();
		int b;
		System.out.print("Choose another number under 12:");
		b = inputDevice.nextInt();
		int c = a - b;

		System.out.println("The " + color + " Dragon is the " + ending + " Dragon of all. It has " + c + " " + bodyPart + ", and a " + animal + 
				" shaped like a " + noun + ". It loves to eat " + pluralNoun + ", although it will feast on nearly anything.");
		
		
	}

}
