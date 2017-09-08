package gameZone;

import javax.swing.JOptionPane;

public class RandomGuessMatch {

	public static void main(String[] args) {
		int random = 1 + (int)(Math.random() * 5);
		String input = JOptionPane.showInputDialog(null, "Guess a random number between 1 and 5.");
		int userGuess = Integer.parseInt(input);
		int difference = userGuess - random;
		JOptionPane.showMessageDialog(null, "There was a difference of " + difference + " between your guess and the number.");
		boolean isItEqual = (random == userGuess);
		JOptionPane.showMessageDialog(null, "Your guess was " + isItEqual);

	}

}
