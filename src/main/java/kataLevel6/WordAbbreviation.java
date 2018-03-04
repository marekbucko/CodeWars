package kataLevel6;

public class WordAbbreviation {

    /*
    * kata level 6
    * link https://www.codewars.com/kata/5375f921003bf62192000746
    * */
    public String abbreviate(String string) {

        char[] chars = string.trim().toCharArray();
        StringBuffer sb = new StringBuffer();
        StringBuffer sb2 = new StringBuffer();
        int wordLength = 0;
        int beginningOfWord = 0;

        String[] words = string.split("[^a-zA-Z]+");
        String[] separators = string.split("[a-zA-Z]+");

        for (int i = 0; i < Math.min(words.length, separators.length); i++) {
            if (words[i].length() < 4) {
                sb2.append(separators[i]);
                sb2.append(words[i]);
            } else {
                sb2.append(separators[i]);
                sb2.append(words[i].charAt(0));
                sb2.append(words[i].length() - 2);
                sb2.append(words[i].charAt(words[i].length() - 1));
            }
        }
        System.out.println(sb2.toString());

        for (int i = 0; i < chars.length; i++) {
            boolean endOfWord = false;
            if (Character.isLetter(chars[i]) == true) {
                wordLength++;
            } else {
                endOfWord = true;
            }
            if (i == chars.length - 1) {
                endOfWord = true;
            }
            if (endOfWord == true && wordLength <= 3 && i != chars.length - 1) {
                for (int j = beginningOfWord; j <= (beginningOfWord + wordLength); j++) {
                    sb.append(chars[j]);
                }
                beginningOfWord += wordLength + 1;
                wordLength = 0;
            } else if (endOfWord == true && wordLength <= 3 && i == chars.length - 1) {
                for (int j = beginningOfWord; j < (beginningOfWord + wordLength); j++) {
                    sb.append(chars[j]);
                }
            } else if (endOfWord == true && wordLength > 3 && (beginningOfWord + wordLength) < chars.length) {
                sb.append(chars[beginningOfWord]);
                sb.append(wordLength - 2);
                sb.append(chars[(beginningOfWord + wordLength) - 1]);
                sb.append(chars[(beginningOfWord + wordLength)]);
                beginningOfWord += wordLength + 1;
                wordLength = 0;
            } else if (endOfWord == true && wordLength > 3) {
                sb.append(chars[beginningOfWord]);
                sb.append(wordLength - 2);
                sb.append(chars[(beginningOfWord + wordLength) - 1]);
                beginningOfWord += wordLength + 1;
                wordLength = 0;
            }
        }
        return sb.toString().trim();
    }
}
