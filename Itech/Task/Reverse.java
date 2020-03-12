package Itech.Task;

import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {

        int num, temp, r, sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your num");
        num = sc.nextInt();

        temp = num; // input num storage in temp.

        while (temp!=0){     // while temp = 0 , then true is working.
           r =  temp%10;     // Modulas storage in r.
           sum = sum*10+r;   // sum include in extra 10,
           temp = temp/10;   // temp value is changeable..
        }

        System.out.println(" Reverse num : "+sum);
    }
}
