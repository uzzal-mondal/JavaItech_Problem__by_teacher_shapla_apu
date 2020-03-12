package Itech.Task;

public class PrimeNumFor {

    public static void main(String[] args) {

        int n = 11;
        boolean flag = false;

        for (int i = 2; i<=n/2; ++i){

            if (n%i == 0){
                flag = true;
                break;
            }
        }
        if (!flag){
            System.out.println("is prime num  "+n);
        }else if (flag){
            System.out.println(" not prime num "+n);
        }
    }
}
