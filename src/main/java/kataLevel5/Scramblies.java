package kataLevel5;

import java.util.HashMap;

/*
 * kata level 5
 * link: https://www.codewars.com/kata/simple-pig-latin
 * */
public class Scramblies {

    public static boolean scramble(String str1, String str2) {
        if (str2.length() > str1.length()) {
            return false;
        }

        for (String s: str2.split("")) {
            if (!str1.contains(s)){
                return false;
            }
            str1.replaceFirst(s,"");
        }
        return true;
    }
}
