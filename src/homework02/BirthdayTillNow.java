package homework02;

import java.util.Date;
import java.util.Calendar;


public class BirthdayTillNow {

    public static void main(String[] args) {
        long calculateYears;
        long calculateWeeks;
        long calculateDays;
        long calculateHours;
        long calculateMinutes;
        long divisionRest;
        long temporary;

        Calendar Birthday = Calendar.getInstance();
        Birthday.set(Calendar.MONTH, 0);
        Birthday.set(Calendar.DATE, 9);
        Birthday.set(Calendar.YEAR, 1982);
        Birthday.set(Calendar.HOUR, 0);
        Birthday.set(Calendar.MINUTE, 30);
        Date dateBirthday = Birthday.getTime();
        System.out.println("Birthday is: " + dateBirthday);

        Date now = new Date();
        System.out.println("Today is: " + now);

        long birthdayTillNowMS = (now.getTime() - dateBirthday.getTime()) / 1000;

        calculateYears = birthdayTillNowMS / (365 * 24 * 60 * 60);
        divisionRest = birthdayTillNowMS % (365 * 24 * 60 * 60);

        calculateWeeks = divisionRest / (7 * 24 * 60 * 60);

        temporary = divisionRest % (7 * 24 * 60 * 60);
        calculateDays = temporary / (24 * 60 * 60);

        calculateHours = temporary % (24 * 60 * 60) / (60 * 60);
        divisionRest = temporary - calculateDays * 24 * 60 * 60 - calculateHours * 60 * 60;

        calculateMinutes = divisionRest / 60;
        divisionRest = divisionRest % 60;

        System.out.println("Years: " + calculateYears);
        System.out.println("Weeks: " + calculateWeeks);
        System.out.println("Days: " + calculateDays);
        System.out.println("Hours:" + calculateHours);
        System.out.println("Minutes: " + calculateMinutes);
        System.out.println("Seconds:" + divisionRest);

    }

}
