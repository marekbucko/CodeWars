package kataLevel6;

import java.util.ArrayList;
import java.util.Arrays;

/*
* kata level 6
* link: https://www.codewars.com/kata/5264d2b162488dc400000001*/

public class StopGninnipsMySdrow {

    public String spinWords(String sentence) {
        String[] words = sentence.split(" ");
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < words.length; i++) {
            if (words[i].length()<5){
                sb.append(words[i]).append(" ");
            } else{
                sb.append(new StringBuffer(words[i]).reverse().toString());
                sb.append(" ");
            }
        }
        return sb.toString().trim();
    }
}
