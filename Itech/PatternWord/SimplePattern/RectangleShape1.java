package Itech.PatternWord.SimplePattern;

import java.util.Scanner;

public class RectangleShape1 {
    public static void main(String args[]){

        int r, c, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your data");
        n = sc.nextInt();

        for ( r=1; r<=n; r++){
            for (c=1;c<=n; c++){
                if (r==1 || r==n || c==1 || c==n){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }

            }
            System.out.println(" ");
        }

    }
}
