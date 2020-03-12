package Itech.Teacher;

import java.util.Scanner;

public class SerisPrint {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your data");
        int n = sc.nextInt();

        while (n!=1){
            System.out.println(n);
            if (n%2!=0){
              n = 3*n+1;
            }else {
              n = n/2;
            }
        }

    }
}
