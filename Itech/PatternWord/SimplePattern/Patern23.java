package Itech.PatternWord.SimplePattern;

import java.util.Scanner;

public class Patern23 {

    public static void main(String[] args) {

        int r, c, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a data: ");
        n = sc.nextInt();

        for (r=1; r<=n; r++){
            for (c=1; c<=r; c++){
                System.out.print(r*c+" ");
            }
            System.out.println(" ");
        }
    }
}
