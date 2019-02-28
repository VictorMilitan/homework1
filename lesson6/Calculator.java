import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		double number1;
		double number2;
		String operation;

		while (true) {
		
		Scanner calculation = new Scanner(System.in);
		
		System.out.println("\nWhat is your first number?");
		number1 = calculation.nextDouble();
		
		System.out.println("\nWhat is your second number?");
		number2 = calculation.nextDouble();
		
		Scanner sign = new Scanner(System.in);
		
		System.out.println("\nWhat do you want to do?");
		oparation = sign.next();
		

			
		switch(operation) {
		 
		 case "+" :
			System.out.println("\nYour answer is " + (number1 + number2));
			break;
			
		 case "-" :
			System.out.println("\nYour answer is " + (number1 - number2));
			break;
			
		 case "*" :
			System.out.println("\nYour answer is " + (number1 * number2));
			break;
			
		 case "/" :
			System.out.println("\nYour answer is "+ (number1 / number2));
			break;

		 case "%" :
			System.out.println("\nYour answer is " + (number1 % number2));
			break;
			
		 default: 
		 System.out.println("No such operation!!!");
		}
		}
		
	}
}