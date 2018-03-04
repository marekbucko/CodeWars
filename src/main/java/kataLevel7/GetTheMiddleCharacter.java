package kataLevel7;

public class GetTheMiddleCharacter {

    /*
    * kata level 7
    * link https://www.codewars.com/kata/56747fd5cb988479af000028
    * */

    public static String getMiddle(String word) {
        if (word.length() % 2 == 0) {
            return "" + word.charAt(word.length() / 2 - 1) + word.charAt(word.length() / 2);
        } else {
            return "" + word.charAt(word.length() / 2);
        }
    }
}
