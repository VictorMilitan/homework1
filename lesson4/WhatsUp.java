import java.util.Scanner;

public class WhatsUp {
	public static void main(String [] args) {
		System.out.println("\nHello User");
		System.out.println("\nLet's get to know each other");
		System.out.println("\nWhat is your name?");
		Scanner reader = new Scanner(System.in);
		String userName = reader.next();
		System.out.println("\nWhat is yout Surname?");
		String userSurname = reader.next();
		System.out.println("\nWhat do you do?");
		String userOccupation = reader.next();
		reader.close();
		System.out.println("\nSo, you are " + userName + " " + userSurname + ("\nand you are ") + userOccupation);
	}
}