package Itech.PatternWord.SimplePattern;

import java.util.Scanner;

public class Pattern30 {

    public static void main(String args[]){

        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your data: ");
        n = sc.nextInt();

        for (int r = 1; r<=n; r++){
            for (int c = 1; c<=n-r; c++){
                System.out.print(" ");
            }
            for (int c =1; c<=r; c++){
                System.out.print("* ");
            }

            System.out.println(" ");
        }


        for (int r=n; r>=1; r--){
            for (int c=1; c<=n-r; c++){
                System.out.print(" ");
            }
            for (int c = 1; c<=r; c++){
                System.out.print("* ");
            }

            System.out.println(" ");
        }
    }
}
