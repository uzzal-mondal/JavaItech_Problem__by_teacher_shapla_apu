package Itech.Task;

import java.util.Scanner;

public class BE {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data");
        int m, n, r, c;
        m = sc.nextInt();
        n = sc.nextInt();

        int [][] mat = new  int[m][n];

        //input matrix elements
        System.out.println("Input matrix elements.");
        for (int i = 0; i<m; i++){
            for (int j =0; j<n; j++){
                mat[i][j] = sc.nextInt();
            }

        }

        System.out.println("Boundary matrix");
        for (int i =0; i<m; i++){
            for (int j =0; j<n; j++){
                if (i == 0 || j == 0 || i == n-1 || j== n-1)
                {
                    System.out.print(mat[i][j] +" ");

                }else {
                    System.out.print(" ");
                }
            }

            System.out.println(" ");
        }


    }
}
