package Itech.Task;

import java.util.Scanner;

public class GcdLcm {

    public static void main(String args[]){

        int n1, n2, num1, num2, rem, gcd, lcm;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter f num");
        num1 = sc.nextInt();
        System.out.println("Enter s num");
        num2 = sc.nextInt();

        n1 = num1;
        n2 = num2;

        while (n2!=0){
            rem = n1%n2;
            n1 = n2;
            n2 = rem;
        }

        gcd = n1;
        lcm = (num1*num2)/gcd;

        System.out.println(gcd);
        System.out.println(lcm);





    }
}
