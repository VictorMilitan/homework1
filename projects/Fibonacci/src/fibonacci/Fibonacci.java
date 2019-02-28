/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        int a0 = 0;
        int a1 = 1;
        int a2;

        System.out.println("Which Fibonacci number would you like?");
        Scanner reader = new Scanner(System.in);
        int fibonacci = reader.nextInt();

        System.out.print(a0 + " " + a1 + " ");

        for (int i = 0; i < fibonacci - 2; i++) {
            a2 = a0 + a1;
            System.out.print(a2 + " ");
            a0 = a1;
            a1 = a2;
        }

        System.out.println("using while");
        System.out.println("Which Fibonacci number would you like?");

        int x0 = 0;
        int x1 = 1;
        int x2;
        Scanner keyBoard = new Scanner(System.in);
        int fibonacci1 = keyBoard.nextInt();
        System.out.print(x0 + " " + x1 + " ");

        int i = 0;
        while (i < fibonacci1 - 2) {
            x2 = x0 + x1;
            System.out.print(x2 + " ");
            x0 = x1;
            x1 = x2;
            i++;
        }

        System.out.println("Using do-while");
        System.out.println("Which Fibonacci number would you like?");

        int z0 = 0;
        int z1 = 1;
        int z2;
        Scanner number = new Scanner(System.in);
        int fibonacci2 = number.nextInt();
        System.out.print(z0 + " " + z1 + " ");

        int index = 0;
        do {
            z2 = z0 + z1;
            System.out.print(z2 + " ");
            z0 = z1;
            z1 = z2;
            index++;

        } 
        while (index < fibonacci2 -2);
    
    }
}
