package alarmClock;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class MyAlarm {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        LocalTime alarmTime = null;
        System.out.println("Enter your alarm time: ");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        while (alarmTime == null) {
            try {
                alarmTime = LocalTime.parse(input.nextLine(), formatter);
                System.out.println("Alarm set for " + alarmTime);
            } catch (DateTimeParseException e) {
                System.out.println("Invalid time format. Please try again.");
            }
        }

        AlarmClock alarmClock = new AlarmClock(alarmTime);
        Thread alarmThread = new Thread(alarmClock);
        alarmThread.start();

        input.close();
    }

}
