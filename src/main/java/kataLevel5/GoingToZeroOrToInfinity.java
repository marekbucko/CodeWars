package kataLevel5;

import java.math.BigDecimal;
import java.math.MathContext;

public class GoingToZeroOrToInfinity {
    public static double going(int n) {
        BigDecimal bd = sumOfFactorials(n).divide(getFactorial(n), MathContext.DECIMAL128);
        return bd.setScale(6, BigDecimal.ROUND_DOWN).doubleValue();
    }

    private static BigDecimal sumOfFactorials(int n) {
        BigDecimal factorialsToAdd = new BigDecimal(1);
        BigDecimal sumOfFactorials = new BigDecimal(0);
        for (int i = 1; i <= n; i++) {
            factorialsToAdd = sumOfFactorials(i, factorialsToAdd);
            sumOfFactorials=sumOfFactorials.add(factorialsToAdd);
        }

        return sumOfFactorials;

    }

    private static BigDecimal getFactorial(int n) {
        BigDecimal factorialOfN = new BigDecimal(1);
        for (int i = 1; i <= n; i++) {
            factorialOfN = factorialOfN.multiply(new BigDecimal(i));
        }
        return factorialOfN;
    }

    private static BigDecimal sumOfFactorials(int n, BigDecimal factorial) {
        factorial = factorial.multiply(new BigDecimal(n));
        return factorial;
    }
}
