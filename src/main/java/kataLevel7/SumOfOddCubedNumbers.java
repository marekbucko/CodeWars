package kataLevel7;

public class SumOfOddCubedNumbers {

    /*
    * kata level 7
    * link https://www.codewars.com/kata/580dda86c40fa6c45f00028a
    * */
    public static int cubeOdd(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * arr[i] * arr[i];
        }
        int sum = 0;
        for (int i : arr) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        return sum;
    }
}
