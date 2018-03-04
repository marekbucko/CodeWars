package kataLevel7;

/*
* kata level 7
* link https://www.codewars.com/kata/mumbling/solutions/java
* */

public class Mumbling {

    public static String accum(String s) {
        StringBuffer sb = new StringBuffer();
        int i = 0;
        for (char c : s.toCharArray()) {
            if (i > 0) sb.append("-");
            sb.append(Character.toUpperCase(c));
            for (int j = 0; j < i; j++) {
                sb.append(Character.toLowerCase(c));
            }
            i++;
        }
        return sb.toString();
    }
}
