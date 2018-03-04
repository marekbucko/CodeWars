package kataLevel6;

public class FindTheParityOutlier {

    /*
    * kata level 6
    * link https://www.codewars.com/kata/5526fc09a1bbd946250002dc
    * */

    static int find(int[] integers) {

        if (integers[0] % 2 == 0) {
            if (integers[1] % 2 == 0) {
                for (int i = 0; i < integers.length; i++) {
                    if (integers[i] % 2 != 0) {
                        return integers[i];
                    }
                }
            } else if (integers[2] % 2 == 0) {
                return integers[1];
            } else {
                return integers[0];
            }
        } else {
            if (integers[1] % 2 == 1) {
                for (int i = 0; i < integers.length; i++) {
                    if (integers[i] % 2 == 0) {
                        return integers[i];
                    }
                }
            } else if (integers[2] % 2 == 1) {
                return integers[1];
            } else {
                return integers[0];
            }
        }
        return 0;
    }
}
