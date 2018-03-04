package kataLevel6;

/*
* kata level 6
* link https://www.codewars.com/kata/541c8630095125aba6000c00*/

public class SumOfDigitsDigitalRoot {

    public static int digital_root(int n) {
        while (n > 9) {
            String number = String.valueOf(n);
            n = 0;
            for (int i = 0; i < number.length(); i++) {
                n += Integer.parseInt(number.substring(i, (i + 1)));
            }
        }
        return n;
    }
}
