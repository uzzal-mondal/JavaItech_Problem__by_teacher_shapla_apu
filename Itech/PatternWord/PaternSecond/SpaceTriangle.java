package Itech.PatternWord.PaternSecond;

import java.util.Scanner;

public class SpaceTriangle {

    public static void main(String[] args) {

        int r, c, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data: ");
        n = sc.nextInt();


        for (r = n; r >= 1; r--) {
            for (c = 1; c <= n - r; c++) {
                System.out.print(" ");
            }

            for (c = 1; c <= r; c++) {
                System.out.print("*");
            }


            System.out.println("   ");
        }

    }
}
