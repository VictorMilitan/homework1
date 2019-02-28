import java.util.Scanner;

public class sumeven {
	
	public static void main(String[] args) {
		
		System.out.println("What is your number?");
		Scanner reader = new Scanner(System.in);
		
		int sum = 0;
		int ourNumber = reader.nextInt();
		
		for (int number = 0; number <= ourNumber; number++) {
			if (number % 2 > 0) {
				continue;
			}
			sum = sum + number;
			
		}
		System.out.println("Sum of even numbers =" + sum);
		
	}
}