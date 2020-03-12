package Itech.PatternWord.SimplePattern;

import java.util.Scanner;

public class Patern9 {
    public static void main(String args[]){

        // alphabet right angle triangle..

        int r, c, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your data");
        n = sc.nextInt();

        for (r=0; r<=n; r++){
            for (c=0; c<=r; c++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
