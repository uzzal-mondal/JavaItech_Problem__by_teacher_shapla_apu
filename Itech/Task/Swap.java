package Itech.Task;

public class Swap {

    public static void main(String args[]){

        int a = 5, b = 7, res;

        System.out.println("Before swaping");
        System.out.println(a+ " "+ b);

      /*  res = a; // 5
        a = b; // 7
        b = res;  // 5*/

      a = a+b;
      b = a-b;
      System.out.println(b);
      a = a-b;

        System.out.println("After swaping ");
        System.out.println(a+" "+b);
    }
}
