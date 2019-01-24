import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		String version = System.getProperty("java.version");
		System.out.println("\nHello Stranger");
		System.out.println("\nLet's get to know each other");
		System.out.println("\nWhat's your name: ");
		Scanner reader = new Scanner(System.in);
		String userName = reader.next();
		reader.close();
		System.out.println("\nNice to meet you, " + userName);
		System.out.println("\nI am Java " + version);
	}
}