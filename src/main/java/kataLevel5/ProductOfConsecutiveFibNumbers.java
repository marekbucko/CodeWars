package kataLevel5;

    /*
    * kata level 5
    * link: https://www.codewars.com/kata/product-of-consecutive-fib-numbers/java
    * */

public class ProductOfConsecutiveFibNumbers {

    public static long[] productFib(long prod) {
        long n1 = 0, n2 = 1, n3;

        while (n1 * n2 < prod) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        if (n1 * n2 == prod) {
            return new long[]{n1, n2, 1};
        }
        return new long[]{n1, n2, 0};
    }
}
