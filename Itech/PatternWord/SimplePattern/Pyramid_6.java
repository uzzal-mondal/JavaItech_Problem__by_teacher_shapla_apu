package Itech.PatternWord.SimplePattern;

import java.util.Scanner;

public class Pyramid_6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your data: ");
        int n = sc.nextInt();

        for (int r = 1; r<=n; r++){
            for (int c=1; c<=n-r;c++ ){
                System.out.print(" ");
            }

            for (int c = 1; c<=r; c++){
                System.out.print("* ");
            }

            System.out.println(" ");
        }
    }
}
