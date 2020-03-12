package Itech.PatternWord.PatternAlphabet;

import javax.swing.*;
import java.util.Scanner;

public class LoveSecondPart {

    public static void main(String args[]) {

        int r, c , num, n;
        String message;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your data: ");
         num = sc.nextInt();
        System.out.println("Please , Enter your message");
        message = sc.nextLine();
         message.length();

         n = num/2;




        for (r = 1; r <= n; r++) {
            // space print for row ..#
            for (c = 1; c <= n - r; c++) {
                System.out.print(" ");
            }
            for (c = 1; c <= r; c++) {
                System.out.print("* ");
            }

            if (num%2==0){
                for (c = 1; c <= 2 * (n - r); c++) {
                    System.out.print(" ");
                }
            }else {
                for (c = 1; c <= 2 * (n - r)+1; c++) {
                    System.out.print(" ");
                }
            }



            for (c = 1; c <= r; c++) {
                System.out.print("* ");
            }


            System.out.println(" ");
        }



        if (num%2==0){
            if (1%2==0){
                System.out.println("* "+((num-1)/2)+" "+"Uzzal"+" *"+((num-1)/2));
            }else {
                System.out.println("* "+((num-1)/2)+" "+"Uzzal"+"  *"+((num-1)/2+1));
            }
        }else {

            if (1%2==0){
                System.out.println("* "+((num-1)/2)+" "+"Android"+" *"+((num-1)/2));
            }else {
                System.out.println("* "+((num-1)/2)+" "+"Android"+" *"+((num-1)));
            }

        }

        /*if (1%2==0){
            System.out.println("* "+((num-1)/2)+" "+"Shapla"+" *"+((num-1)/2+1));
        }else {
            System.out.println("* "+((num-1)/2)+" "+"Shapla"+" *"+(((num-1)/2)+1));
        }*/

//        next part...

        for (r = num; r >= 1; r--) {
            for (c = 1; c <= num - r; c++) {
                System.out.print(" ");
            }

            for (c=1; c<=r; c++){
                System.out.print("* ");
            }

            System.out.println();
        }

    }
}


