package kataLevel6;

public class SimpleEncryptionAlternatingSplit {

    /*
    * kata level 6
    * link https://www.codewars.com/kata/57814d79a56c88e3e0000786*/

    public static String encrypt(final String text, final int n) {
        if (text == null) {
            return null;
        }
        if (text.equals("")) {
            return text;
        }
        String encryptedText = text;
        int counter = n;

        while (counter > 0) {
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < encryptedText.length(); i++) {
                if (i % 2 == 1) {
                    sb.append(encryptedText.charAt(i));
                }
            }
            for (int i = 0; i < encryptedText.length(); i++) {
                if (i % 2 == 0) {
                    sb.append(encryptedText.charAt(i));
                }
            }
            encryptedText = sb.toString();
            counter--;
        }
        return encryptedText;
    }

    public static String decrypt(final String encryptedText, final int n) {
        if (encryptedText == null) {
            return null;
        }
        if (encryptedText.equals("")) {
            return encryptedText;
        }
        int counter = n;
        String decryptedText = encryptedText;
        while (counter > 0) {
            StringBuffer sb = new StringBuffer();
            String leftPartOfEncryptedText = decryptedText.substring(0, decryptedText.length() / 2);
            String rightPartOfEncryptedText = decryptedText.substring(decryptedText.length() / 2, decryptedText.length());
            int leftCounter = 0;
            int rightCounter = 0;

            for (int i = 0; i < encryptedText.length(); i++) {
                if (i % 2 == 0) {
                    sb.append(rightPartOfEncryptedText.charAt(rightCounter));
                    rightCounter++;
                } else {
                    sb.append(leftPartOfEncryptedText.charAt(leftCounter));
                    leftCounter++;
                }
            }
            decryptedText = sb.toString();
            counter--;
        }
        return decryptedText;
    }
}
