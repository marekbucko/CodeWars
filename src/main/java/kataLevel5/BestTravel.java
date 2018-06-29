package kataLevel5;

import java.util.*;

/*
* kata level 5
* link https://www.codewars.com/kata/best-travel
* */
public class BestTravel {

    public static Integer chooseBestSum(int t, int k, List<Integer> ls) {
        if (k > ls.size()){
            return null;
        }
        int index[] = new int[k];
        for (int i = 0; i < k; i++){
            index[i] = i;
        }
        int best = 0;
        while (true) {
            int next = value(index, ls);
            if (next > best && next <= t){
                best = next;
            }
            if (increment(index, ls.size())) break;
        }
        return best == 0 ? null : best;
    }

    private static int value(int[] index, List<Integer> vals) {
        int sum = 0;
        for (int i = 0; i < index.length; i++) {
            sum += vals.get(index[i]);
        }
        return sum;
    }

    private static boolean increment(int[] index, int range) {
        for (int i = index.length - 1; i >= 0; i--) {
            index[i]++;
            if (index[i] <= range - index.length + i) {
                for (int j = i + 1; j < index.length; j++) index[j] = index[j-1] + 1;
                return false;
            }
        }
        return true;
    }
}

