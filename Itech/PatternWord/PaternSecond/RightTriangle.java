package Itech.PatternWord.PaternSecond;

import java.util.Scanner;

public class RightTriangle {
    public static void main(String args[]){

        int r, c, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your data: ");
        n = sc.nextInt();


        for (r = 1; r<=n; r++){
            if (r%4==0){
                for (c=1; c<=r; c++){
                    System.out.print("* ");
                }
                System.out.println(" ");
            }

        }





    }
}
