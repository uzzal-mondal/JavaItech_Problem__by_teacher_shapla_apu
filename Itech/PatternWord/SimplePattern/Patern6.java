package Itech.PatternWord.SimplePattern;

import java.util.Scanner;

public class Patern6 {
    public static void main(String args[]) {

        int r, c;
        int alphabet = 65;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number.");
        int n = sc.nextInt();

        for (r = 0; r <= n; r++) {
            for (c = 0; c <= r; c++) {
                System.out.print((char) (alphabet+c)+" ");
            }
            System.out.println(" ");
        }


    }
}
