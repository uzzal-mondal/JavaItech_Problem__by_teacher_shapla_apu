package Itech.Task;

import java.util.Scanner;

public class SumOfDigit {

    public static void main(String[] args) {

        int num, temp, r, sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your data");
        num = sc.nextInt();

        temp = num; // main value storage to temp value.

        while (temp!=0){   // temp isn't 0 then working. then true.
          r =  temp%10;     // modulas storage in r.
          sum = sum+r;       // sum including .
          temp = temp/10;    // temp value changeable ,
        }

        System.out.println(" Sum of digit "+sum);


    }
}
