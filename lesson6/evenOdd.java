import java.util.Scanner;

public class evenOdd {

public static void main (String[] args) {
	
	Scanner number = new Scanner(System.in);
	int a;
	
	System.out.println("\nWhat is your number?");
	a = number.nextInt();
	int b = a % 2;
	
	if (b == 0) {
		System.out.println ("\nThis number is even");
	} 
	else {
		System.out.println("\nThis number is odd");
	}
}
}