package Itech.Task;

public class PerMu {

    public static void main(String args[]) {

        char[] arayName = {'a', 'b', 'c'};
        int n = arayName.length;


        char temp;

        for (int i = 0; i <= n; i++) {
            for (int j = i + 1; j < n; j++) {
                temp = arayName[i];
                arayName[i] = arayName[j];
                arayName[j] = temp;

                System.out.println(arayName);
            }
        }


    }

}
