package Itech.PatternWord.SimplePattern;

import java.util.Scanner;

public class InvertedRightTriangle_3 {

    public static void main(String[] args) {

       int n, r, c;
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter our data");
        n = sc.nextInt();

        for (r= n; r>=1; r--){ // r - n=4, 4>=1, true
            for (c=1; c<=r; c++ ){ // c=5 , 4<=4                   * * * * *
                System.out.print("* ");                         // * * * *
            }
            System.out.println(" ");
        }

    }
}
