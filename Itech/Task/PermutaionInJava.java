package Itech.Task;

public class PermutaionInJava {

    public static void main(String args[]) {

        char[] str = {'a', 'b', 'c'};
        int n = str.length;
        generatePermutations(str, 0, n);

    }

    public static void generatePermutations(char[] str, int start, int end) {

        char temp;

        for (int i = start; i <= end; i++) {
            for (int j = i + 1; j < end; ++j) {
                temp = str[i];
                str[i] = str[j];
                str[j] = temp;

                generatePermutations(str, i + 1, end);
                //backing and swaping the characters again..
                temp = str[i];
                str[i] = str[j];
                str[j] = temp;
            }
        }

        System.out.println(str);
    }


}
