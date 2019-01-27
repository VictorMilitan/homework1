import java.util.Scanner;

public class AddCalculator {
	
	public static void main (String[] args) {
		System.out.println("\nVictor Militan");
		System.out.println("\nAddCalculator");
		System.out.println("\nThis application adds two numbers");
		
		int x;
		int y;
		int result;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("\nWhat is your first number?");
		x = input.nextInt();
		System.out.println("\nWhat is yout second numer?");
		y = input.nextInt();
		
		result = x + y;
		
		System.out.println("\nAnd your answer is " + result);
		
	}	
}		