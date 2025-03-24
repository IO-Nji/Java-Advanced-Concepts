package enumDemo;

import java.util.Scanner;

public class MyEnum {

    public static void main(String[] args) {
//          Get User Input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a day of the week: ");
        String response = input.nextLine().toUpperCase();

//          Instantiate an enum object
        WeekDays day = WeekDays.MONDAY;

        try {

//          Instantiate an enum object from user input
            WeekDays userDay = WeekDays.valueOf(response);

//        Cycle through weekdays to find user day
            switch (userDay) {
                case MONDAY,
                     TUESDAY,
                     WEDNESDAY,
                     THURSDAY,
                     FRIDAY -> System.out.println("Weekday");
                case SATURDAY, SUNDAY -> System.out.println("Weekend");

            }
        }
        catch (IllegalArgumentException e) {
            System.out.println("Please enter a valid day!y");
        }
//          Close scanner
        input.close();

//          Print out the day and day number
        System.out.println(day + " : " + day.getDayNumber());
    }
}
