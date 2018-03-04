package kataLevel8;

/*
* kata level 8
* link https://www.codewars.com/kata/5583090cbe83f4fd8c000051/solutions/java
* */
public class ConvertNumberToReversedArrayOfDigits {
    public static int[] digitize(long n) {
        String reversedNumber = new StringBuffer().append(n).reverse().toString();
        int[] tableOfdigits = new int[reversedNumber.length()];
        for (int i = 0; i < tableOfdigits.length; i++) {
            tableOfdigits[i] = Integer.parseInt(String.valueOf(reversedNumber.charAt(i)));
        }
        return tableOfdigits;
    }
}
