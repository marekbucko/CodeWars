package kataLevel6;

import java.math.BigInteger;

/*
* kata level 6
* link https://www.codewars.com/kata/563f0c54a22b9345bf000053
* */
public class ADisguisedSequence {

    public static BigInteger fcn(int n) {

        BigInteger[] bi = new BigInteger[n + 1];

        bi[0] = new BigInteger("1");
        bi[1] = new BigInteger("2");

        for (int i = 2; i < bi.length; i++) {
            bi[i] = (new BigInteger("6").multiply(bi[i - 2]).multiply(bi[i - 1])).divide(new BigInteger("5").multiply(bi[i - 2]).subtract(bi[i - 1]));
        }

        System.out.println(bi[n]);
        return null;
    }
}
