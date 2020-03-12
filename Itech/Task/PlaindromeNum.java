package Itech.Task;

import java.util.Scanner;

public class PlaindromeNum {

    public static void main(String[] args) {
        int num, temp, rem, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your  input");
        num = sc.nextInt();

        temp = num;

        while (temp!=0){
           rem =  temp%10;
           sum = sum*10+rem;
           temp = temp/10;
        }

        if (num==sum){
            System.out.println("Palindrome num"+ num);
        }else {
            System.out.println("Not a Palindrome num "+num);
        }





    }
}
