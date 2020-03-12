package Itech.Task;

import java.util.Scanner;

public class MaxAndMin {

    public static void main(String[] args) {

        double sum = 0; // sum initialize.
        Scanner sc = new Scanner(System.in); // input section..

        double[] number = new double[5]; // array initialize , declare.
        System.out.print("please Enter Five numbers "); //


       /*number[0] = sc.nextDouble();
       number[1] = sc.nextDouble();
       number[2] = sc.nextDouble();
       number[3] = sc.nextDouble();
       number[4] = sc.nextDouble();
       number[5] = sc.nextDouble();*/

        for (int i = 0; i < number.length; i++) {

            number[i] = sc.nextDouble();
        }

        for (int i = 0; i < number.length; i++) {
            sum = sum + number[i];
        }

        double avg = sum / number.length;

        System.out.println("Sum : " + sum);
        System.out.println("Average " + avg);

        double max = number[0];

        for (int i = 1; i<number.length; i++){
           if (max<number[i]){
               max = number[i];
           }
        }

        System.out.println("Maximum num  "+max);

        double min = number[0];
        for (int i = 1; i<number.length; i++){
            if (min>number[i]){
                min = number[i];
            }
        }

        System.out.println("Minimum num "+min);


    }
}
