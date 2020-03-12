package Itech.PatternWord.SimplePattern;

import java.util.Scanner;

public class Patern21 {

    public static void main(String[] args) {

        int r, c, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your data");
        n = sc.nextInt();

        for (r= 1; r<=n; r++){
            for (c=1; c<=n-r; c++){
                System.out.print(" ");
            }
            for (c=1; c<=r; c++){
                System.out.print(c);
            }

            System.out.println(" ");
        }


        for (int row=n; row>=1; row--){
            for (int col=1; col<=n-row; col++){
                System.out.print(" ");
            }
            for (int col=1;  col<=row;  col++){
                System.out.print(col);
            }
            System.out.println(" ");
        }


    }
}
