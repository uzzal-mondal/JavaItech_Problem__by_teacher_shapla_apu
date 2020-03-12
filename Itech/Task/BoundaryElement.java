package Itech.Task;

import java.util.Scanner;

public class BoundaryElement {
    public static void main(String args[]) {

        int i, j, row, col;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows data: ");
        row = sc.nextInt();
        System.out.println("Enter the columns data");
        col = sc.nextInt();

        int [][]A = new int[row][col];


        for (i=0; i<row; i++){
            for (j=0; j<col; j++){
                System.out.println("Enter the elements");
                A[i][j]= sc.nextInt();
            }
        }

        for (i=0; i<row; i++){
            for (j=0; j<col; j++){
                if (i==0 || j==0 || i==row-1 || j==col-1){
                    System.out.print(A[i][j]+"\t");
                }
                else{
                    System.out.print(" \t");
                }
            }
            System.out.println();
        }


    }
}
