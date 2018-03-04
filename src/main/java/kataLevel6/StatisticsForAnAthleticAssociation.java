package kataLevel6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/*
* kata level 6
* link https://www.codewars.com/kata/55b3425df71c1201a800009c
* */

public class StatisticsForAnAthleticAssociation {

    public static String stat(String strg) {
        strg = strg.replaceAll("\\s+", "");
        String[] times = strg.split(",");
        List<Integer> listOfTimesInSeconds = new ArrayList<>();

        convertTimesToSeconds(times, listOfTimesInSeconds);
        String range = calculateRange(listOfTimesInSeconds);
        String average = calculateAverage(listOfTimesInSeconds);
        String median = calculateMedian(listOfTimesInSeconds);

        return "Range: " + range + " Average: " + average + " Median: " + median;
    }

    private static void convertTimesToSeconds(String[] times, List<Integer> listOfTimesInSeconds) {
        for (int i = 0; i < times.length; i++) {
            String[] timeToSeconds = times[i].split("\\|");
            int timesInSeconds = 0;
            timesInSeconds += Integer.parseInt(timeToSeconds[0]) * 3600;
            timesInSeconds += Integer.parseInt(timeToSeconds[1]) * 60;
            timesInSeconds += Integer.parseInt(timeToSeconds[2]);
            listOfTimesInSeconds.add(timesInSeconds);
        }
    }

    private static String calculateMedian(List<Integer> listOfTimesInSeconds) {
        listOfTimesInSeconds.sort(Comparator.naturalOrder());

        if (listOfTimesInSeconds.size() % 2 == 1) {
            int median = listOfTimesInSeconds.get(listOfTimesInSeconds.size() / 2);
            int hour = median / 3600;
            median -= 3600 * hour;
            int minutes = median / 60;
            median -= 60 * minutes;
            int seconds = median;
            StringBuffer sb = new StringBuffer();
            sb.append(String.format("%02d", hour)).append("|");
            sb.append(String.format("%02d", minutes)).append("|");
            sb.append(String.format("%02d", seconds));
            return sb.toString();
        } else {
            int median = (listOfTimesInSeconds.get(listOfTimesInSeconds.size() / 2 - 1) + listOfTimesInSeconds.get(listOfTimesInSeconds.size() / 2)) / 2;
            int hour = median / 3600;
            median -= 3600 * hour;
            int minutes = median / 60;
            median -= 60 * minutes;
            int seconds = median;
            StringBuffer sb = new StringBuffer();
            sb.append(String.format("%02d", hour)).append("|");
            sb.append(String.format("%02d", minutes)).append("|");
            sb.append(String.format("%02d", seconds));
            return sb.toString();
        }
    }

    private static String calculateAverage(List<Integer> listOfTimesInSeconds) {
        int sumOfTimesInSeconds = 0;

        for (int i = 0; i < listOfTimesInSeconds.size(); i++) {
            sumOfTimesInSeconds += listOfTimesInSeconds.get(i);
        }
        sumOfTimesInSeconds = sumOfTimesInSeconds / listOfTimesInSeconds.size();
        int hour = sumOfTimesInSeconds / 3600;
        sumOfTimesInSeconds -= 3600 * hour;
        int minutes = sumOfTimesInSeconds / 60;
        sumOfTimesInSeconds -= 60 * minutes;
        int seconds = sumOfTimesInSeconds;
        StringBuffer sb = new StringBuffer();
        sb.append(String.format("%02d", hour)).append("|");
        sb.append(String.format("%02d", minutes)).append("|");
        sb.append(String.format("%02d", seconds));
        return sb.toString();
    }

    private static String calculateRange(List<Integer> listOfTimesInSeconds) {
        listOfTimesInSeconds.sort(Comparator.reverseOrder());
        int range = listOfTimesInSeconds.get(0) - listOfTimesInSeconds.get(listOfTimesInSeconds.size() - 1);
        int hour = range / 3600;
        range -= 3600 * hour;
        int minutes = range / 60;
        range -= 60 * minutes;
        int seconds = range;
        StringBuffer sb = new StringBuffer();
        sb.append(String.format("%02d", hour)).append("|");
        sb.append(String.format("%02d", minutes)).append("|");
        sb.append(String.format("%02d", seconds));
        return sb.toString();
    }
}
