import java.util.Scanner;

public class sum {
	
	public static void main(String[] args) {
		
		System.out.println("Enter your number");
		Scanner reader = new Scanner (System.in);
		
		int ourNumber = reader.nextInt();
		int sum = 0;
		
		for (int number = 0; number <= ourNumber; number++) {
			sum = sum + number;
			
		}
		System.out.println("Sum of all numbers =" +sum);
	}
}