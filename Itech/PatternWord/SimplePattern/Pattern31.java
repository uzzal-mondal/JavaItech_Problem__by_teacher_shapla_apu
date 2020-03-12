package Itech.PatternWord.SimplePattern;

import java.util.Scanner;

public class Pattern31 {

    public static void main(String args[]){

        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your num");
        n = sc.nextInt();

        for (int i = 1; i<=n; i++){
            for (int c = 1; c<=n-i; c++){
                System.out.print(" ");
            }
            for (int c = 1; c<=i; c++){
                System.out.print("* ");
            }

            System.out.println(" ");
        }

        //second element.

        for (int r = n-1; r>=1; r--){
            for (int j = 1; j<=n-r; j++){
                System.out.print(" ");
            }
            for (int j = 1; j<=r; j++){
                System.out.print("* ");
            }

            System.out.println(" ");
        }

    }
}
