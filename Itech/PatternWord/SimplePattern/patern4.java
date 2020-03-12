package Itech.PatternWord.SimplePattern;

import java.util.Scanner;

public class patern4 {
    public static void main(String args[]) {

        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your data:");
        n = sc.nextInt();

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col % 2); // want to hear my_apu.
            }
            System.out.println(" ");
        }


    }
}
