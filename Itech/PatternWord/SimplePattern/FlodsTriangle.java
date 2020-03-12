package Itech.PatternWord.SimplePattern;

import java.util.Scanner;

public class FlodsTriangle {

    public static void main(String[] args) {
        int n , count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data");
        n = sc.nextInt();

        for (int r = 1; r<=n; r++){

            for (int c= 1; c<=r; c++){
                System.out.print(++count+" ");
            }
            System.out.println(" ");
        }
    }
}
