package Itech.Task;

import java.util.Scanner;

public class PrimeNum {

    public static void main(String args[]){

        int count = 0;
        int n;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num");
         n = sc.nextInt();

        for (int i = 2; i<n; i++){
            if (n%i == 0){
                count++;
                break;
            }
        }

        if(count==0){
            System.out.println("prime num "+n);
        }else {
            System.out.println("Not a prime num "+n);
        }

    }
}
