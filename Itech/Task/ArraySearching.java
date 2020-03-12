package Itech.Task;

import java.util.Scanner;

public class ArraySearching {
    public static void main(String[] args) {


        int position = -1;
        int[] number = {10,20,4,6,8,40,50,60};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter User data value.");
        int value = sc.nextInt();

        for (int i = 0; i<number.length; i++){

            if (value == number[i]){
                position = i+1;
                break;
            }

        }

            if (position==-1){
                System.out.println("Item not found..");
            }else {
                System.out.println("The position of "+position+",  Value is: "+value);
            }


    }
}
