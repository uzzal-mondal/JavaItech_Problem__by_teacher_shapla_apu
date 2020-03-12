package Itech.PatternWord.SimplePattern;

import java.util.Scanner;

public class Patern22 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your num");
        int n = sc.nextInt();
        int r, c;

        for (r=1; r<=n; r++){
            for (c=1; c<=n; c++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
