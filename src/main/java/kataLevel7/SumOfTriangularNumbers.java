package kataLevel7;

public class SumOfTriangularNumbers {

    /*
    * kata level 7
    * link https://www.codewars.com/kata/580878d5d27b84b64c000b51
    * */
    public static int sumTriangularNumbers(int n) {
        int sum = 0;
        if (n > 0) {
            int valueToAdd = 1;
            for (int i = 0; i < n; i++) {
                sum += valueToAdd;
                valueToAdd += i + 2;
                System.out.println(valueToAdd);
            }
        }
        return sum;
    }
}
