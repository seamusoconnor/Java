package tutorial7;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// Crate Scanner object
		
		Scanner input = new Scanner(System.in);
		// output the prompt
		System.out.println("Enter a line of text: ");
		
		// wait for user to eter line
		String line = input.nextLine();
		// Tell them waht they aentered
		System.out.println("You entered: " + line);


	}

}
