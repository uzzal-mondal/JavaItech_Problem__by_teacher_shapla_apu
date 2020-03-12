package Itech.Task;

public class Permutation {

    public static void main(String[] args) {

        String str = "123";
        int n = str.length();
        Permutation permutation = new Permutation();
        permutation.permute(str, 0, n - 1);

    }

    /*1. permute function.
      2. str - string to calculate permutation for..
      3. l - stating index.
      4. r -  ending index.
     */


    private void permute(String str, int l, int r) {

        if (l == r) {
            System.out.println(str);
        } else {
            for (int i = l; i <= r; i++) {
                Swap(str, l, i);
                permute(str, l + 1, i);
                str = Swap(str, l, i);
            }

        }

    }

    public String Swap(String a, int i, int j) {

        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[j] = charArray[i];
        charArray[j] = temp;

        return String.valueOf(charArray);

    }
}
