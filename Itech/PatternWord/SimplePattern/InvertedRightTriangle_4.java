package Itech.PatternWord.SimplePattern;

import java.util.Scanner;

public class InvertedRightTriangle_4 {

    public static void main(String[] args) {

        int n, r, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter our  data");
        n = sc.nextInt();

        for (r =n; r>=1; r--){

            for (c=1; c<=n-r; c++){
                System.out.print(" ");
            }

            for (c=1; c<=r; c++){
                System.out.print("*");
            }


            System.out.println(" ");
        }
    }
}
