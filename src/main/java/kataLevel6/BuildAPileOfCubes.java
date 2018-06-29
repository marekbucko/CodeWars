package kataLevel6;


/*
* kata level 6
* link https://www.codewars.com/kata/build-a-pile-of-cubes/train/java
* */

public class BuildAPileOfCubes {

    public static long findNb(long m) {
        int i;
        for (i=1; m > 0; i++) {
            m = m - (long) Math.pow(i, 3);
        }
        return m == 0 ? i-1 : -1;
    }
}
