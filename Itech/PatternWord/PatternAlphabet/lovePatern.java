package Itech.PatternWord.PatternAlphabet;

import java.util.Scanner;

public class lovePatern {

    public static void main(String args[]){
        int r, c;
        for (r=0; r<=5; r++){
            for (c=0; c<=6; c++){
                if ((r==0 && c%3!=0) || (r==1 && c%3==0) || (r-c == 2) || (r+c==8)) {
                    System.out.print(" "+"*");
                }else {
                    System.out.print(" "+" ");
                }
            }

            System.out.println();
        }
    }
}
