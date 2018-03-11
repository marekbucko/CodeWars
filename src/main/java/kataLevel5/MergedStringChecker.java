package kataLevel5;

/*
* kata level 5
* link: https://www.codewars.com/kata/merged-string-checker/train/java
* */
public class MergedStringChecker {

    public static boolean isMerge(String s, String part1, String part2) {
        System.out.println(s);
        if (s.length() != part1.length() + part2.length()) return false;
        if (s.length() == 0) return true;
        return (part1.length() > 0 && part1.charAt(0) == s.charAt(0) && isMerge(s.substring(1), part1.substring(1), part2)) ||
                (part2.length() > 0 && part2.charAt(0) == s.charAt(0) && isMerge(s.substring(1), part1, part2.substring(1)));
    }
}