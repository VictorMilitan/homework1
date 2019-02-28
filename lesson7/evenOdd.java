import java.util.Scanner;

public class evenOdd {
	
	public static void main(String[] args) {
		
		System.out.println("What is your 10 numbers?");
		Scanner reader = new Scanner(System.in);
		
		int even = 0;
		int odd = 0;
		int number1 = reader.nextInt() % 2;
		int number2 = reader.nextInt() % 2;
		int number3 = reader.nextInt() % 2;
		int number4 = reader.nextInt() % 2;
		int number5 = reader.nextInt() % 2;
		int number6 = reader.nextInt() % 2;
		int number7 = reader.nextInt() % 2;
		int number8 = reader.nextInt() % 2;
		int number9 = reader.nextInt() % 2;
		int number10 = reader.nextInt() % 2;
		
		if (number1 == 0) {
			even++;
		} else {odd++;} 
		if (number2 == 0) {
			even++;
		} else {odd++;}
		if (number3 == 0) {
			even++;
		} else {odd++;}
		if (number4 == 0) {
			even++;
		} else {odd++;} 
		if (number5 == 0) {
			even++;
		} else {odd++;} 
		if (number6 == 0) {
			even++;
		} else {odd++;}
		if (number7 == 0) {
			even++;
		} else {odd++;} 
		if (number8 == 0) {
			even++;
		} else {odd++;}
		if (number9 == 0) {
			even++;
		} else {odd++;} 
		if (number10 == 0) {
			even++;
		} else {odd++;} 
		
		System.out.println("There are " + even + " even numbers");
		System.out.println("There are " + odd + " odd numbers");
		
	}
}