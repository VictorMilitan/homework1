import java.util.Scanner;

public class SubtractCalculator {
	
	public static void main (String[] args) {
		System.out.println("\nVictor Militan");
		System.out.println("\nSubtractCalculator");
		System.out.println("\nThis application subtracts two numbers");
		
		int x;
		int y;
		int result;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("\nWhat is your first number?");
		x = input.nextInt();
		System.out.println("\nWhat is yout second numer?");
		y = input.nextInt();
		
		result = x - y;
		
		System.out.println("\nAnd your answer is " + result);
		
	}	
}