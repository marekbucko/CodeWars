package kataLevel6;

import java.util.Arrays;

/*
* kata level 6
* link https://www.codewars.com/kata/556deca17c58da83c00002db
* */

public class TribonacciSequence {

    public double[] tribonacci(double[] s, int n) {

        double[] newArray = Arrays.copyOf(s, n);

        for (int i = 3; i < n ; i++) {
            newArray[i]=newArray[i-3]+newArray[i-2]+newArray[i-1];
        }

        return newArray;
    }
}
