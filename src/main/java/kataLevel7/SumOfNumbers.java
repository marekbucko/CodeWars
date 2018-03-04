package kataLevel7;

public class SumOfNumbers {

    /*
    * kata level 7
    * link https://www.codewars.com/kata/55f2b110f61eb01779000053
    * */

    public int SumOfNumbers(int a, int b) {
        int sum = 0;
        int maxVaule = Math.max(a, b);
        int minValue = Math.min(a, b);

        if (maxVaule == minValue) {
            sum = maxVaule;
        } else
            for (int i = minValue; i <= maxVaule; i++) {
                sum += i;
            }
        return sum;
    }
}
