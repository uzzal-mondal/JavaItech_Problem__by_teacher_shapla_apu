package Itech.PatternWord.PatternAlphabet;

import java.util.Scanner;

public class U {

    public static void main(String args[]){


        System.out.println("\n\n\n\n\n\n");
        for (int r = 0; r<6; r++){


            for (int c=0; c<8; c++){
                if ((c==0 || c==5) && (r>0 && r<5) || (r==5 && (c>0 && c<4))){
                    System.out.print(" ");
                    System.out.print(" ");
                    System.out.print("u");
                    System.out.print(" ");
                    System.out.print(" ");
                    System.out.print(" ");
                }else {
                    System.out.print(" ");

                }
            }


            System.out.println(  );
            //System.out.print("1 ");
        }

        System.out.println("\n\n\n\n\n\n");
    }
}
