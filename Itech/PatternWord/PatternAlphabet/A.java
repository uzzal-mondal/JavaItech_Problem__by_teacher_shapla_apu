package Itech.PatternWord.PatternAlphabet;

import java.util.Scanner;

public class A {

    public static void main(String args[]) {

        int r, c;

        for (r = 0; r <= 5; r++) {

            for (c = 0; c <= 4; c++) {
                if ((c == 0 || c == 4) && (r != 0) || (r == 0 || r == 3) && (c > 0 && c < 4)) {

                    System.out.print(" "+"*");
                } else {
                    System.out.print(" "+" ");
                }
            }

            System.out.println();
        }


    }
}
