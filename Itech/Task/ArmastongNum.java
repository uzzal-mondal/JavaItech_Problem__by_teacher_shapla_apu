package Itech.Task;

import java.util.Scanner;

public class ArmastongNum {
    public static void main(String args[]){

        int num, rem, temp,sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num ");
        num = sc.nextInt();

        temp = num;

        while (temp!=0){
           rem =  temp%10;
           sum = sum+rem*rem*rem;
           temp = temp/10;

        }

        if (num == sum){
            System.out.println("ArmStrong num");
        }else {
            System.out.println("Not a ArmStrong num.");
        }


    }
}
