package kataLevel7;

public class SumOfTheFirstNthTermOfSeries {
    /*
    * kata level 7
    * link https://www.codewars.com/kata/555eded1ad94b00403000071
    * */
    public static String seriesSum(int n) {
        double sum = 0;
        if (n == 0) {
            return "0.00";
        }
        for (int i = 1; i <= n; i++) {
            sum += 1 / (1. + 3 * (i - 1));
        }
        return String.format("%.2f", sum);
    }
}
