package kataLevel8;

import com.sun.tools.javac.util.ArrayUtils;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/*
* kata level 8
* link https://www.codewars.com/kata/57eae20f5500ad98e50002c5
* */
public class StringSpaces {

    public String spaces(String x) {
        return x.replaceAll("\\s", "");
    }
}
