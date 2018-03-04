package kataLevel7;

public class HighestAndLowest {
    /*
    * kata level 7
    * link https://www.codewars.com/kata/554b4ac871d6813a03000035
    * */
    public static String HighAndLow(String numbers) {
        String[] tableOfNumbers = numbers.split(" ");
        int highestNumber = Integer.parseInt(tableOfNumbers[0]);
        int lowestNumber = Integer.parseInt(tableOfNumbers[0]);
        for (int i = 1; i < tableOfNumbers.length; i++) {
            if (Integer.parseInt(tableOfNumbers[i]) > highestNumber) {
                highestNumber = Integer.parseInt(tableOfNumbers[i]);
            }
            if (Integer.parseInt(tableOfNumbers[i]) < lowestNumber) {
                lowestNumber = Integer.parseInt(tableOfNumbers[i]);
            }
        }
        return highestNumber + " " + lowestNumber;
    }
}
