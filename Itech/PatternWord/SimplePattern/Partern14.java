package Itech.PatternWord.SimplePattern;

import java.util.Scanner;

public class Partern14 {

    public static void main(String[] args) {

        int r, c, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your data");
        n = sc.nextInt();

        for (r=1; r<=n; r++) {
            //System.out.println(r);
            //printing space.
            for (c=1; c<=n-r; c++){
                System.out.print(" ");
            }
            //printing number.
            for (c=1; c<=r; c++){
                System.out.print(c);
            }

            System.out.println(" ");

        }



    }
}
