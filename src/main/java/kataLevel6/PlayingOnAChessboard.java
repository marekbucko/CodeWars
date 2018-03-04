package kataLevel6;

import java.math.BigDecimal;

/*
* kata level 6
* link https://www.codewars.com/kata/55ab4f980f2d576c070000f4
* */
public class PlayingOnAChessboard {

    public static String game(long n) {
        BigDecimal sum3 = new BigDecimal(n * n / 2.0);
        String sumNumber = sum3.toString();
        String[] sTest = sumNumber.split("\\.");

        StringBuffer sb2 = new StringBuffer();
        if (sTest.length == 1) {
            sb2.append("[");
            sb2.append(sTest[0]);
            sb2.append("]");
        } else if (sTest.length == 2) {
            BigDecimal denominator = new BigDecimal(10 * sTest[1].length());
            BigDecimal numerator = sum3.multiply(denominator);
            int biggestDiv = 1;
            for (int i = 2; i <= Math.min(numerator.longValueExact(), denominator.longValueExact()); i++) {
                if (numerator.longValueExact() % i == 0 && denominator.longValueExact() % i == 0) {
                    biggestDiv = i;
                }
            }
            numerator = numerator.divide(new BigDecimal(biggestDiv));
            numerator = numerator.setScale(0);
            denominator = denominator.divide(new BigDecimal(biggestDiv));
            sb2.append("[");
            sb2.append(numerator);
            sb2.append(", ");
            sb2.append(denominator);
            sb2.append("]");
        }
        return sb2.toString();
    }
}

