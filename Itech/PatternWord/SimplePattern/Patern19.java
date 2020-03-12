package Itech.PatternWord.SimplePattern;

import java.util.Scanner;

public class Patern19 {

    public static void main(String[] args) {

        int n, r, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data");
        n = sc.nextInt();

        for ( r=1; r<=n; r++){
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
