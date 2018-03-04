package kataLevel8;

public class InvertValues {
    /*
    * kata level 8
    * link https://www.codewars.com/kata/5899dc03bc95b1bf1b0000ad
    * */
    public static int[] invert(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= -1;
        }
        return array;
    }
}
