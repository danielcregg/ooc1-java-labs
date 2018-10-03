package ie.gmit.javalabs2.exceptionhandling;

import java.util.Scanner;
import java.util.InputMismatchException;

public class DivideByZero {
	public static void main(String args[]) {
		Scanner userInput = new Scanner(System.in); // Create scanner object
		int numerator = 0;
		int denominator = 0;
		boolean continueAsking = true; // determines if more input is needed
		
		do 
		{
			try {
				// Get numerator
				System.out.print("Please enter an integer numerator: ");     
				numerator = userInput.nextInt();
				// Get denominator
				System.out.print("Please enter an integer denominator: ");
				denominator = userInput.nextInt();
				// Print Result
				System.out.println("\nResult: " + numerator/denominator);
				continueAsking = false; // input successful; end looping        
			} catch (InputMismatchException inputMisEx) {
				System.err.printf( "\nException: %s\n", inputMisEx );                                    
				System.out.println("You did not enter an integer.\n");
				userInput.nextLine(); // discard input so user can try again    
			} catch(ArithmeticException ae) {
				System.out.println("\nThere was an Arithmetic Error!");
				System.out.println("Please check your input numbers!");
				System.out.println( "Exception: " + ae );
			} 
		} while (continueAsking);
		
		userInput.close(); // Close Scanner object
	} // end main
} // end class DivideByZero

