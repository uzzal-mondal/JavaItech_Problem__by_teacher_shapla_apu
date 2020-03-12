package Itech.PatternWord.PatternAlphabet;

public class B {
    public static void main(String args[]){

        int r, c;

        for (r = 0; r <= 5; r++) {

            for (c = 0; c <= 4; c++) {
                if ((c == 0 || c == 4) && (r != 0) || (r == 0 || r == 3) && (c > 0 && c < 4)) {

                    System.out.print(" "+"*");
                } else {
                    System.out.print(" "+" ");
                }
            }

            System.out.println();
        }


        System.out.println("\n");


        for (int row = 0; row<=6; row++){
            for (int col = 0; col<=4; col++){

                if ((col==0) || (col==4) && (row!=0 && row!=3 && row!=6) ||
                        (row==0 || row==3 || row==6) && (col>0 && col<4)){
                    System.out.print(" "+"*");
                }else {
                    System.out.print(" "+" ");
                }
            }

            System.out.println();
        }






    }
}
