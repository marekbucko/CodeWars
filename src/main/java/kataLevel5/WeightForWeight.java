package kataLevel5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/*
* kata level 5
* link: https://www.codewars.com/kata/weight-for-weight
* */

public class WeightForWeight {

    public static String orderWeight(String strng) {
        strng = strng.trim().replaceAll("\\s+", " ");
        List<NumbersAndValues> numbersAndValues = new ArrayList<>();

        char[] numbers = strng.toCharArray();
        int numberSum = 0;
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != ' ') {
                numberSum += Character.getNumericValue(numbers[i]);
                sb.append(numbers[i]);
            } else {
                numbersAndValues.add(new NumbersAndValues(sb.toString(), numberSum));
                sb = new StringBuffer();
                numberSum = 0;
            }
            if (i == numbers.length - 1) {
                numbersAndValues.add(new NumbersAndValues(sb.toString(), numberSum));
                sb = new StringBuffer();
                numberSum = 0;
            }
        }
        Collections.sort(numbersAndValues, (o1, o2) -> {
            if (o1.getValue() > o2.getValue()) {
                return 1;
            } else if (o1.getValue() == o2.getValue()) {
                return o1.getNumber().compareToIgnoreCase(o2.getNumber());
            }
            return -1;
        });

        sb = new StringBuffer();
        for (int i = 0; i < numbersAndValues.size(); i++) {
            sb.append(numbersAndValues.get(i).getNumber());
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    private static class NumbersAndValues {
        private String number;
        private int value;

        public String getNumber() {
            return number;
        }

        public int getValue() {
            return value;
        }

        public NumbersAndValues(String number, int value) {
            this.number = number;
            this.value = value;
        }

    }
}
