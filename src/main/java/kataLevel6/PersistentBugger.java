package kataLevel6;

public class PersistentBugger {
    /*
    * kata level 6
    * link https://www.codewars.com/kata/55bf01e5a717a0d57e0000ec
    * */
    public static int persistence(long n) {
        System.out.println(n);
        int counter = 0;
        while (n > 9) {
            String s = "" + n;
            n = 1;
            for (int i = 0; i < s.length(); i++) {
                n *= Integer.parseInt(s.substring(i, i + 1));
            }
            counter++;
        }
        return counter;
    }

}
