package Itech.Task;

import java.util.Arrays;

public class ArrayBubleSort {
    public static void main(String args[]){

        int[] A = {10,5,8,20};

        int i, j, temp;

        for (i = 0; i<A.length-1; i++){
            for (j=0; j<A.length-1; j++){
                if (A[j]>A[j+1]){
                    temp = A[j+1];
                    A[j+1] = A[j];
                    A[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(A));
    }
}
