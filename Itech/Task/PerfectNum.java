package Itech.Task;

import java.util.Scanner;

public class PerfectNum {

    public static void main(String args[]){

        int sum = 0, num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        for (int i = 1; i<num; i++){
            if (num%i == 0){
                sum = sum+i;
            }
        }
        if (sum == num){
            System.out.println("Perfect num "+num);
        }else {
            System.out.println("Not a perfect "+num);
        }

    }
}
