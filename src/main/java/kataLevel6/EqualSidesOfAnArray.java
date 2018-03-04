package kataLevel6;

import java.util.Arrays;

/*
* kata level 6
* link https://www.codewars.com/kata/5679aa472b8f57fb8c000047
* */
public class EqualSidesOfAnArray {

    public static int findEvenIndex(int[] arr) {
        int rightSum = 0;
        int leftSum = 0;
        for (int i : arr) {
            rightSum += i;
        }

        for (int i = 0; i < arr.length; i++) {
            rightSum -= arr[i];
            if (leftSum == rightSum) {
                return i;
            }
            leftSum += arr[i];
        }
        return -1;
    }
}
