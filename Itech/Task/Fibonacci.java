package Itech.Task;

public class Fibonacci {

    public static void main(String args[]){

        int first = 0, second = 1, n = 5, count = 0, fibo;

        while (count<n){
            if (count<=1){
                    fibo = count;
            }else {
                fibo = first+second;
                first = second;
                second = fibo;
            }
            System.out.println(fibo);

           count++;
        }




    }
}
