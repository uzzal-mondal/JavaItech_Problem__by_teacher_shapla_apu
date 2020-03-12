package Itech.Task;



import java.util.Arrays;

public class ArraySorting {

    public static void main(String[] args) {

       /* int[] num = { 1,-5,4,8,9};
        Arrays.sort(num);

        System.out.println("Ascending num: ");
        for (int i = 0; i<4; i++){
            System.out.print(" "+num[i]);
        }

        System.out.println(" ");

        System.out.println("Descending num: ");
        for (int i=4; i>0; i-- ){
            System.out.print(" "+num[i]);
        }*/

        System.out.println("Ascending String  Name : - ");
        String[] names = {"s", "r", "a", "b", "c"};
        Arrays.sort(names);
        for (int i = 0; i < 5; i++) {
            String ascending = names[i];
            System.out.print(" " + ascending);
        }

        System.out.println(" ");

        System.out.println("Descending String name: - ");
        String[] name = {"D","A","E","F","G","H","C","B"};
        Arrays.sort(name);
        for (int i = 7; i>=0; i--){
            String descending = name[i];
            System.out.print(" "+descending);
        }



    }
}
