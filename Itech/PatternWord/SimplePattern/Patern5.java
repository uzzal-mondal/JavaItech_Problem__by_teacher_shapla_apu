package Itech.PatternWord.SimplePattern;

import java.util.Scanner;

public class Patern5 {
    public static void main(String args[]){

        int n, r, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number.");
         n = sc.nextInt();

        for (r=1; r<=n; r++){
            for (c=1; c<=r; c++){
               System.out.print(r%2); // I want to hear my_apu.

            }
            System.out.println(" ");
        }
    }
}
