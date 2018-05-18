package kataLevel5;

public class HumanReadableTime {
    public static String makeReadable(int seconds) {
        int hours = seconds / 3600;
        int timeAfterRemovedHours = seconds - hours * 3600;
        int minutes = timeAfterRemovedHours / 60;
        int timeAfterRemovedMinutes = timeAfterRemovedHours - minutes * 60;

        String hoursAsString = String.format("%02d", hours);
        String minutesAsString = String.format("%02d", minutes);
        String secondsAsString = String.format("%02d", timeAfterRemovedMinutes);

        return hoursAsString + ":" + minutesAsString + ":" + secondsAsString;
    }
}
