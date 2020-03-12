package Itech.PatternWord.SimplePattern;

import java.util.Scanner;

public class Patern2 {
    public static void main(String args[]){

        //number angle triangle.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your data");
        int n = sc.nextInt();

        for (int row =1; row<=n; row++){
            for (int col= 1; col<=row; col++){
                System.out.print(row);
            }
            System.out.println(" ");
        }


    }
}
