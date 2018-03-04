package kataLevel8;

public class RemoveFirstAndLastCharacter {

    /*
    * kata level 8
    * link https://www.codewars.com/kata/56bc28ad5bdaeb48760009b0
    * */
    public static String remove(String str) {
        return str.substring(1,str.length()-1);
    }
}
