package Itech.Task;

public class ArrayBubble {

    public static void main(String[] args) {

        ArrayBubble ob = new ArrayBubble();
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        ob.bubbleShort(arr);



    }

    void bubbleShort(int[] a) {

        int n = a.length;

        int i, j, temp;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

    }

    void printArray(int[] a){
        int n = a.length;
        for (int i=0; i<n; ++i){

        }

    }
}
