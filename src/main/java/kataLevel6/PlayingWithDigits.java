package kataLevel6;

import java.util.ArrayList;
import java.util.List;

/*
* kata level 6
* link https://www.codewars.com/kata/5552101f47fc5178b1000050
* */

public class PlayingWithDigits {

    public static long digPow(int n, int p) {
        String number = String.valueOf(n);
        int resultOfMultiplication = 0;
        List<Integer> listOfDigits = new ArrayList<>();

        for (int i = 0; i < number.length(); i++) {
            listOfDigits.add(Integer.parseInt(number.substring(i, (i + 1))));
        }
        for (int i = 0; i < listOfDigits.size(); i++) {
            resultOfMultiplication += Math.pow(listOfDigits.get(i), p + i);
        }
        StringBuffer stringBuffer = new StringBuffer("jdsajd");


        stringBuffer.append("s");
        return (double) resultOfMultiplication / n % 1 == 0 ? resultOfMultiplication / n : -1;
    }
}
