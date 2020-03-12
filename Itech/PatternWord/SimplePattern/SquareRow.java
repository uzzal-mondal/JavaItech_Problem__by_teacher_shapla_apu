package Itech.PatternWord.SimplePattern;

import java.util.Scanner;

public class SquareRow {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your data: ");
        int n = sc.nextInt();

        for (int r = 1; r<=n; r++){
            for (int c =1; c<=n; c++){
                if (r==1 || r==n || c==1 || c==n){
                    System.out.print(r+" ");
                }else {
                    System.out.print("  ");
                }
            }

            System.out.println(" ");
        }
    }
}
