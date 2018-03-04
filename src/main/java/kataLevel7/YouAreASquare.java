package kataLevel7;

public class YouAreASquare {
    /*
    * kata level 7
    * link https://www.codewars.com/kata/54c27a33fb7da0db0100040e
    * */
    public static boolean isSquare(int n) {
        return Math.sqrt(n) % 1 == 0 ? true : false;
    }
}
