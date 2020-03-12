package Itech.StringProgram;

import java.util.Arrays;

public class Permutation {

    public static void main(String[] args) {
        int [] arrayNum = {1,2,3};
        int n = arrayNum.length;
        int [] array2 = arrayNum;
        int temp;
        System.out.println();
        for (int i = 0; i<n; i++){
            for (int j = 0; j<n; j++){
                temp = array2[i];
                array2[i] = array2[j];
                array2[j] = temp;

                for (int value : array2) {
                    System.out.print(value);
                }

                System.out.println();
                array2 = arrayNum;

               // System.out.println(temp);


            }

        }


    }
}
