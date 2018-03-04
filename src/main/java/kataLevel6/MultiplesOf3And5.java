package kataLevel6;

public class MultiplesOf3And5 {

    /*
    * kata level 6
    * link https://www.codewars.com/kata/514b92a657cdc65150000006
    * */
    public int solution(int number) {
        int sum = 0;

        for (int i = 1; i < number; i++) {
            if (i % 15 == 0) {
                sum += i;
            } else if (i % 5 == 0) {
                sum += i;
            } else if (i % 3 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
