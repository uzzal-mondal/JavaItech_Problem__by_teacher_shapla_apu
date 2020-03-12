package Itech.PatternWord.SimplePattern;

import java.util.Scanner;

public class Patern26 {
    public static void main(String[] args) {
        int n, r, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your data");

        n = sc.nextInt();

        for (r=n; r>=0; r--){
            for (c=1; c<=n-r; c++){
                System.out.print(" ");
            }
            for (c=1; c<=(2*r)-1; c++){
                System.out.print("*");
            }

            System.out.println(" ");
        }
    }
}
