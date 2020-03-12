package Itech.Task;

import java.util.Scanner;

public class SubStringProblem {

    public static void main(String[] args) {

        String first, second;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter first String: ");
        first = sc.next();
        System.out.println("Please Enter second String: ");
        second = sc.next();


       if (isSubString(first,second)){
           System.out.println("The first String is a substring of the second.");
       }else {
           System.out.println("The first String is Not a substring of the second.");
       }


    }

    public static boolean isSubString(String first, String second) {
        char c;
        char d;
        boolean match = true;

        for (int i = 0; i < first.length(); i++) {
            c = first.charAt(i);
            for (int j = 0; j < second.length(); j++) {
                d = second.charAt(i);

                if (c==d){
                    match = true;
                }else {
                    match = false;
                }
            }
        }

        System.out.println();

        return match;
    }

}
