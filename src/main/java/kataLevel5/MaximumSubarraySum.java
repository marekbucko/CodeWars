package kataLevel5;

import java.util.Arrays;


/*
* kata level 5
* link: https://www.codewars.com/kata/maximum-subarray-sum
* */

public class MaximumSubarraySum {
    public static int sequence(int[] arr) {
        if (arr.length==0){
            return 0;
        }
        int[] sortedArray = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sortedArray);
        int arraySum = 0;

        if (sortedArray[0] > 0) {
            for (int i : arr) {
                arraySum += i;
            }
            return arraySum;
        } else if(sortedArray[arr.length - 1] < 0){
            return 0;
        }
        arraySum = sortedArray[sortedArray.length - 1];
        for (int i = 0; i < arr.length; i++) {
            int temporaryArraySum = 0;
            for (int j = i; j < arr.length; j++) {
                temporaryArraySum += arr[j];
                if (temporaryArraySum > arraySum) {
                    arraySum = temporaryArraySum;
                }
            }
        }
        return arraySum;
    }
}
