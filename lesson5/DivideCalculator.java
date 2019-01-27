import java.util.Scanner;

public class DivideCalculator {
	
	public static void main (String[] args) {
		System.out.println("\nVictor Militan");
		System.out.println("\nDivideCalculator");
		System.out.println("\nThis application devides two numbers");
		
		double x;
		double y;
		double result;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("\nWhat is your first number?");
		x = input.nextInt();
		System.out.println("\nWhat is yout second numer?");
		y = input.nextInt();
		
		result = x / y;
		
		System.out.println("\nAnd your answer is " + result);
		
	}	
}