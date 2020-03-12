package Itech.Task;

import java.util.Scanner;

public class ArrayDaigonal {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int[][] A = new int[3][3];
        int sum = 0, upperElements = 0, lowerElements = 0;

        System.out.println(" User Input number");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("A[%d][%d] = ", row, col);
                A[row][col] = sc.nextInt();
            }
            //System.out.print(" ");
        }

        System.out.println(" ");
        //loop is create get matrix element..
        //diagonal
        for (int row = 0; row < 3; row++) {

            for (int col = 0; col < 3; col++) {

                // row & column index same is daigonal.
                if (row == col) {

                    // System.out.println("Daigonal num");
                    // sum = sum+A[row][col];
                    System.out.print("\t"+A[row][col]);
                }
                if (row < col) {

                    // System.out.println("Upper triangle elements");
                    upperElements = A[row][col];
                    System.out.print("\t"+upperElements);
                }

                if (row > col) {
                    // System.out.println("Lower triangle elements");
                    lowerElements = A[row][col];
                    System.out.print("\t"+lowerElements);
                }

            }

            System.out.println(" ");
        }

        //  System.out.println("Diagonal num "+sum);
        //  System.out.println("upperElements num "+upperElements);
        //  System.out.println("lowerElements num "+lowerElements);


    }
}
