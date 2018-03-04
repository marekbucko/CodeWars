package kataLevel5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/*
* kata level 5
* link https://www.codewars.com/kata/550f22f4d758534c1100025a
* */
public class DirectionsReduction {
    public static String[] dirReduc(String[] arr) {
        List<String> listOfDirections = new ArrayList<>(Arrays.asList(arr));

        for (int i = 0; (i + 1) < listOfDirections.size(); i++) {
            if ("NORTHSOUTH,SOUTHNORTH,EASTWEST,WESTEAST".contains(listOfDirections.get(i) + listOfDirections.get(i + 1))) {
                listOfDirections.remove(i + 1);
                listOfDirections.remove(i);
                i = -1;
            }
        }
        System.out.println(listOfDirections);
        return listOfDirections.toArray(new String[listOfDirections.size()]);
    }
}
