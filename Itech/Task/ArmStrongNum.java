package Itech.Task;

import java.util.Scanner;

public class ArmStrongNum {

    public static void main(String[] args) {

        int num, temp, r , sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num");
        num = sc.nextInt();

        temp = num;
        while (temp!=0){
           r =  temp%10;
           sum = sum+r*r*r;
           temp = temp/10;
        }
        if (num == sum){
            System.out.println("ArmStrong num "+num);
        }else {
            System.out.println("Not a Armstrong "+num);
        }

    }
}
