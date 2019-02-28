/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraydemo;

/**
 *
 * @author User
 */
public class ArrayDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numArr = new int[10];
        int[][] chessBoard = new int[8][8];
        int[][][] computerScreen = new int[1920][1080][3];

        numArr[0] = 1;
        numArr[3] = 10;
        numArr[5] = 12;
        numArr[7] = 15;
        numArr[9] = 20;

        for (int i = 0; i < numArr.length; i++) { //length - позволяет определить обьем array если не помним сколько его
            for (int i2 = 0; i2 < chessBoard.length; i2++) {
                for (int i3 = 0; i3 < computerScreen[i][i2].length; i3++) {
                    System.out.println(computerScreen[i][i2][i3]);
                }
                    System.out.println(chessBoard[i][i2] + " ");
                }
            System.out.println();

            }
            System.out.println();
        }
    }

//        public void showEach() {
//        System.out.println("for each");
//
//        for (int element : numArr) {
//            System.out.println(element);
//            element = 1;//цикл называется for each
//        }
//
//        System.out.println("hello");
//
//        int i = 0;
//        while (i < 10) {
//            System.out.println(numArr[i]);
//            i++;
//        }
//
//    }

}
