import java.util.Scanner;

public class numberFibonacci {
	
	public static void main(String[] args) {
		int count;
		int num1 = 0;
        int num2 = 1;
        int sum = 0;
        System.out.print(num1 + " " + num2); // если бы не было этой строчки то мы бы не ставили count-2
        for (int i = 0; i < count-2; i++) {  // так как мы показываем первые два числа
            sum = num1 + num2;
            num1 = num2;                      // мы могли написать i = 3 и i <=count; и вышел тот же результат
            num2 = sum;
            System.out.print(" " + sum);
    }
		
		
	}
}