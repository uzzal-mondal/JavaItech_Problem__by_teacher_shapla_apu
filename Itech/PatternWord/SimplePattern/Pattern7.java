package Itech.PatternWord.SimplePattern;

import java.util.Scanner;

public class Pattern7 {

    public static void main(String[] args) {

        int r, c, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your num");
        n = sc.nextInt();

        for (r = 0; r<=n; r++){
            for (c =0; c<=r; c++){
                System.out.print((char) (97+c)+" ");
            }
            System.out.println(" ");
        }


    }
}
