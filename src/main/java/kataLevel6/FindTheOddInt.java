package kataLevel6;

import java.util.Arrays;

/*
* kata level 6
* link https://www.codewars.com/kata/54da5a58ea159efa38000836
* */
public class FindTheOddInt {

    public static int findIt(int[] A) {
        Arrays.sort(A);
        int k = 1;
        if (A.length == 1) {
            return A[0];
        }
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] == A[i + 1]) {
                k++;
            } else {
                if (k % 2 != 0) {
                    return A[i];
                } else {
                    k = 1;
                }
            }
        }
        return A[A.length - 1];
    }
}
