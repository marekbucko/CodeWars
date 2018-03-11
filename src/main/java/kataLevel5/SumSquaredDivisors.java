package kataLevel5;

import java.util.ArrayList;

/*
* kata level: 5
* link: https://www.codewars.com/kata/integers-recreation-one/train/java
* */

public class SumSquaredDivisors {
    public static String listSquared(long m, long n) {
        if (m == n) {
            ArrayList<Long> listOfDivisors = new ArrayList<>();
            for (long i = 1; i <= m; i++) {
                if (m % i == 0) {
                    listOfDivisors.add(i);
                }
            }
            long sumOfSquaredDivisors = 0;
            for (int i = 0; i < listOfDivisors.size(); i++) {
                sumOfSquaredDivisors += Math.pow(listOfDivisors.get(i), 2);
            }
            double rootOfSum = Math.sqrt(sumOfSquaredDivisors);
            if (rootOfSum % 1 == 0) {
                return "[[" + m + ", " + sumOfSquaredDivisors + "]]";
            }
        }
        ArrayList<NumbersAndSquares> listOfFoundNumbers = new ArrayList<>();
        for (long i = m; i <= n; i++) {
            ArrayList<Long> listOfDivisors = new ArrayList<>();
            for (long j = 1; j <= i; j++) {
                if (i % j == 0) {
                    listOfDivisors.add(j);
                }
            }
            long sumOfSquaredDivisors = 0;
            for (int k = 0; k < listOfDivisors.size(); k++) {
                sumOfSquaredDivisors += Math.pow(listOfDivisors.get(k), 2);
            }
            double rootOfSum = Math.sqrt(sumOfSquaredDivisors);
            if (rootOfSum % 1 == 0) {
                listOfFoundNumbers.add(new NumbersAndSquares(i, sumOfSquaredDivisors));
            }
        }
        if (listOfFoundNumbers.size() == 0) {
            return null;
        }
        StringBuffer sb = new StringBuffer();
        sb.append("[");
        for (int i = 0; i < listOfFoundNumbers.size(); i++) {
            sb.append("[");
            sb.append(listOfFoundNumbers.get(i).number);
            sb.append(", ");
            sb.append(listOfFoundNumbers.get(i).square);
            sb.append("], ");
        }
        return sb.substring(0, sb.length() - 2).toString() + "]";
    }

    public static class NumbersAndSquares {
        private long number;
        private long square;

        public NumbersAndSquares(long number, long square) {
            this.number = number;
            this.square = square;
        }
    }
}
