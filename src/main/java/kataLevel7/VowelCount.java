package kataLevel7;

public class VowelCount {

    /*
    * kata level 7
    * link https://www.codewars.com/kata/54ff3102c1bad923760001f3
    * */
    public static int getCount(String str) {
        int vowelsCount = 0;
        System.out.println(str);
        for (int i = 0; i < str.length(); i++) {
            if ("a, e, i, o, u".contains("" + str.charAt(i))) {
                vowelsCount++;
            }
        }
        return vowelsCount;
    }
}
