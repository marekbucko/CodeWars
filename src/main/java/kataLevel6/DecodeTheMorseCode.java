package kataLevel6;

public class DecodeTheMorseCode {

    /*
    * kata level 6
    * link https://www.codewars.com/kata/54b724efac3d5402db00065e
    * !IMPORTANT! This kata only works on codewars.com since it needs a morseCode library to work.
    *
    * */
    public static String decode(String morseCode) {
        morseCode = morseCode.trim();
        morseCode = morseCode.replaceAll("   ", "  ");
        String[] morseCodeTab = morseCode.split(" ");
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < morseCodeTab.length; i++) {
            if (!morseCodeTab[i].isEmpty()) {
//                sb.append(MorseCode.get(morseCodeTab[i])); -----This line is commented to avoid getting error outside codewars.com-----
            } else {
                sb.append(morseCodeTab[i]);
            }
        }
        return sb.toString();
    }
}


