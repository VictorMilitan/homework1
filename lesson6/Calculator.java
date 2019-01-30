import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		double number1;
		double number2;
		String operation;
		
		Scanner calculation = new Scanner(System.in);
		
		System.out.println("\nWhat is your first number?");
		number1 = calculation.nextDouble();
		
		System.out.println("\nWhat is your second number?");
		number2 = calculation.nextDouble();
		
		Scanner opera = new Scanner(System.in);
		
		System.out.println("\nWhat do you want to do?");
		operation = opera.next();
		
		if (operation.equals("+")) {
			System.out.println("\nYour answer is " + (number1 + number2));
		}
		if (operation.equals("-")) {
			System.out.println("\nYour answer is " + (number1 - number2));
		}
		if (operation.equals("*")) {
			System.out.println("\nYour answer is " + (number1 * number2));
		}
		if (operation.equals("/")) {
			System.out.println("\nYour answer is "+ (number1 / number2));
		}
		if (operation.equals("%")) {
			System.out.println("\nYour answer is " + (number1 % number2));
		}
	}
}