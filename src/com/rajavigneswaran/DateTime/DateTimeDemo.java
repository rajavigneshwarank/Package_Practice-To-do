package com.rajavigneswaran.DateTime;
import java.time.*;
import java.time.format.DateTimeFormatter;


public class DateTimeDemo {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Current Date: " + today);

        LocalTime time = LocalTime.now();
        System.out.println("Current Time: " + time);

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Current Date and Time: " + dateTime);

        LocalDate customDate = LocalDate.of(2025, Month.OCTOBER, 17);
        System.out.println("Custom Date: " + customDate);

        LocalDate futureDate = today.plusDays(10);
        System.out.println("Date after 10 days: " + futureDate);

        LocalDate pastDate = today.minusMonths(2);
        System.out.println("Date before 2 months: " + pastDate);

        Period period = Period.between(pastDate, futureDate);
        System.out.println("Period between dates: " + period);

        LocalDateTime formattedExample = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedDate = formattedExample.format(formatter);
        System.out.println("Formatted DateTime: " + formattedDate);

        ZonedDateTime zoneDateTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("DateTime with Time Zone: " + zoneDateTime);

        Duration duration = Duration.ofHours(5);
        System.out.println("Duration of 5 hours in seconds: " + duration.getSeconds());
    }
}
