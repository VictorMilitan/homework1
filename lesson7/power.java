import java.util.Scanner;

public class power {
	
	public static void main(String[] args) {
		
		System.out.println("What is your number?");
		Scanner reader = new Scanner(System.in);
		
		int power = 0;
		int ourNumber = reader.nextInt();
		
		for (int number = 0; number < ourNumber; number++) {
			power++;
		}
		power = (power*ourNumber);
		System.out.println(power);
		
	}
}