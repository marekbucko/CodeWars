package kataLevel5;


/*
 * kata level 5
 * link: https://www.codewars.com/kata/simple-pig-latin
 * */

public class SimplePigLatin {
    public static String pigIt(String str) {
        return str.replaceAll("(\\w)(\\w*)", "$2$1ay");
    }
}
