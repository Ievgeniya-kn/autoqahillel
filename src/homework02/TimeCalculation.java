package homework02;

import java.time.LocalDateTime;
import java.util.Date;

public class TimeCalculation {
    public static void main(String[] args) {

        int seconds = 45454374;
        int calculateDays;
        int calculateHours;
        int calculateMinutes;
        int divisionRest;


        calculateDays = seconds / (24 * 60 * 60);
        calculateHours = seconds % (24 * 60 * 60) / (60 *60);
        divisionRest = seconds - calculateDays * 24 * 60 * 60 - calculateHours * 60 * 60;
        calculateMinutes = divisionRest / 60;
        divisionRest = divisionRest % 60;

        System.out.println(seconds + " seconds are: " +
                calculateDays + " days " +
                calculateHours + " hour(s) " +
                calculateMinutes + " minute(s) " +
                divisionRest + " second(s)");
    }
}
