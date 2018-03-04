package kataLevel7;

public class ShortesWord {


    /*
    * kata level 7
    * link https://www.codewars.com/kata/57cebe1dc6fdc20c57000ac9
    * */
    public int shortestWord(String s) {
        String shortestWord = "";
        int newCount = 0;
        int wordLength = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                shortestWord = s.substring(newCount, i);
                newCount = i + 1;
                if (wordLength == 0) {
                    wordLength = shortestWord.length();
                } else {
                    wordLength = Math.min(shortestWord.length(), wordLength);
                }
            }
            if (i == s.length() - 1) {
                shortestWord = s.substring(newCount, i + 1);
                wordLength = Math.min(shortestWord.length(), wordLength);
            }
        }
        return wordLength;
    }
}
