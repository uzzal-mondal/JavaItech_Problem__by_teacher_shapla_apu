package Itech.Task;
import java.util.Scanner;

public class ArrayMatrixWithSub {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int A[][] = new int[3][3]; //2d
        int B[][] = new int[3][3];

        int C[][] = new int[3][3];

        System.out.println("input A Matrix: ");
        for (int row = 0; row < A.length; row++) {
            for (int col = 0; col < A.length; col++) {

                System.out.printf("A[%d][%d] = ",row, col);
                A[row][col] = sc.nextInt();
            }
        }

        System.out.println("input B Matrix: ");
        for (int row=0; row<B.length; row++){
            for (int col=0; col<B.length; col++){
                System.out.printf("B[%d][%d] = ", row, col);
                B[row][col]= sc.nextInt();
            }
        }

        System.out.println("A Matrix : ");
        for (int row = 0; row<A.length; row++){
            for (int col = 0; col<A.length; col++){
                System.out.print("\t "+A[row][col]);
            }
            System.out.println(" ");
        }


        System.out.println("B matrix : ");
        for (int row=0; row<B.length; row++){
            for (int col = 0; col<B.length; col++){

                System.out.print("\t "+B[row][col]);
            }
            System.out.println(" ");
        }


        // adding to A , B Matrix.

        System.out.println("A+B = ");
        for (int row = 0; row<A.length; row++){
            for (int col = 0; col<B.length; col++){

                C[row][col] = (A[row][col] + B[row][col]);
                System.out.print("\t "+C[row][col]);
            }

            System.out.println(" ");
        }


    }
}
