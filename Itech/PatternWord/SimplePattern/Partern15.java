package Itech.PatternWord.SimplePattern;

import java.util.Scanner;

public class Partern15 {
    public static void main(String args[]) {

        int r, c, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your data: ");
        n = sc.nextInt();

        for (r= 1; r<=n; r++){

            for (c = 1; c<=n-r; c++){
                System.out.print(" ");
            }

            for (c = 1; c<=r; c++){
                System.out.print(r);
            }


            System.out.println(" ");
        }

    }
}
