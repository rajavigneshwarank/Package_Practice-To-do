package com.rajavigneswaran.DateTime;

import java.util.*;
import java.time.*;
import java.time.format.*;
public class DateTimeDemo
{
    public static void main(String[] args)
    {
        LocalDate d = LocalDate.now();
        System.out.println("Date: " + d);

        LocalTime t = LocalTime.now();
        System.out.println("Time: " + t);

        LocalDateTime dt = LocalDateTime.now();
        System.out.println("Date & Time: " + dt);

        LocalDate c = LocalDate.of(2025, 10, 17);
        System.out.println("Custom Date: " + c);

        LocalDate add = d.plusDays(10);
        System.out.println("After 10 days: " + add);

        LocalDate sub = d.minusMonths(2);
        System.out.println("Before 2 months: " + sub);

        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String s = dt.format(f);
        System.out.println("Formatted: " + s);


    }
}
