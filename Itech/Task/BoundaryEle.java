package Itech.Task;

public class BoundaryEle {

    public static void printBoundary(int a[][], int m, int n ){

        for (int r=0; r<m; r++){
            for (int c=0; c<m; c++){
                if (r==0 || r==m-1|| c==0  || c== n-1){
                    System.out.print(a[r][c]+"  ");
                }
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        //int a[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };
        int a[][] = new int[4][4];
       printBoundary(a,4,4);

    }
}
