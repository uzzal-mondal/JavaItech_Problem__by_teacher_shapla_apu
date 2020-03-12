package Itech.PatternWord.SimplePattern;

import java.util.Scanner;

public class Pattern_21 {

    public static void main(String[] args) {

        int n, count = 0;
        int c, r;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a data");
        n = sc.nextInt();

        for ( r = 1; r<=n; r++){
            for ( c = 1; c<=n-r; c++){
                System.out.print(" ");
            }
            for ( c = 1; c<=r; c++){
                System.out.print(c);
            }

            System.out.println(" ");
        }

        //sssssssssssssssssssssssssssssssss
        for (c=r; c>=1; c--) {
            System.out.print(c);
        }

            System.out.println(" ");
        }
    }

