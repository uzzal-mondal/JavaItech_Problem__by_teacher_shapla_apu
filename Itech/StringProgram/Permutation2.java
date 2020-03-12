package Itech.StringProgram;

public class Permutation2 {

    public static void main(String args[]){

        int[] arrayName = {1,2,3};
        int n = arrayName.length;
        int[] array2Name = arrayName;
        int temp;

        for (int i =0; i<n; i++){
            for (int j = 0; j<n; j++){

                temp = array2Name[i];
                array2Name[i] = array2Name[j];
                array2Name[j] = temp;

                for (int value: array2Name){
                    System.out.print(value);
                }

                array2Name = arrayName;
                System.out.println();

            }
        }

    }
}
