package kataLevel7;

public class OddOrEven {

    /*
    * kata level 7
    * link https://www.codewars.com/kata/5949481f86420f59480000e7
    * */
    public static String oddOrEven(int[] array) {
        int sum = 0;
        String oddOrEven = "odd";

        for (int i : array) {
            sum += i;
        }

        if (sum % 2 == 0) {
            oddOrEven = "even";
        }
        return oddOrEven;
    }
}
