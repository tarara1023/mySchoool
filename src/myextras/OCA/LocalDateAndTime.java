package myextras.OCA;

import javafx.scene.input.DataFormat;
import sun.util.calendar.BaseCalendar;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

public class LocalDateAndTime {

    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2020, 6, 11);
        LocalTime time = LocalTime.of(2, 50);
        LocalDateTime dateAndTime = LocalDateTime.of(date, time);
        System.out.println(dateAndTime);
        LocalDate date2 = LocalDate.now();










        //zookeeper has decided to switch the toys for animals every month

        LocalDate start = LocalDate.now();
        LocalDate end = start.plusMonths(12);
        Period period = Period.ofMonths(2);
        Period annually = Period.ofYears(1);
        Period everyThreeWeeks = Period.ofWeeks(3);
        Period everyYearAndWeek = Period.of(1, 0, 7);

        while ((start.isBefore(end))) {
            System.out.println("give new toy: " + start);
            start = start.plus(period);
        }

        LocalTime time3 = LocalTime.now();
        System.out.println(time3);

        DateTimeFormatter shortTime = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        DateTimeFormatter mediumTime = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        DateTimeFormatter myTime = DateTimeFormatter.ofPattern("dd/MM/yyyy, hh:mm");


        System.out.println(dateAndTime.format(shortTime));
        System.out.println(dateAndTime.format(mediumTime));
        System.out.println(dateAndTime.format(myTime));

        //Joda DateTime



    }
}
