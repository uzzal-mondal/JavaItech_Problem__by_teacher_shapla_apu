package Itech.HackerRank;

import java.util.Scanner;

public class Multiply {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        if (age<0){
            System.out.println("Age is not valid."+age);
        }else if(age<10){
            System.out.println("Tinager ");
        }

    }
}
