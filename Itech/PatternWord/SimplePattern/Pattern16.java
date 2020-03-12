package Itech.PatternWord.SimplePattern;

import java.util.Scanner;

public class Pattern16 {

    public static void main(String args[]){

        int r, c, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your data: ");
        n = sc.nextInt();

        //small to bigger..#
        for (r=1; r<=n; r++){

            for (c = 1; c<=r; c++){
                System.out.print(c+" ");
            }
                System.out.println(" ");
        }

        //new bigger to small..#
        for (r=n; r>=1; r--){

            for (c = 1; c<=r; c++){

                System.out.print(c+" ");
            }

            System.out.println(" ");
        }



    }
}
