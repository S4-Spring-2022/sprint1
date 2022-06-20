package com.keyin.member;

import java.time.LocalDate;
import java.time.*;
import java.util.*;
public class Date {
  static void findDifference(LocalDate start_date, LocalDate end_date){
        Period diff = Period.between(start_date, end_date);
        System.out.print("Difference " + "between two dates is: ");

        // Print the result
        System.out.printf("%d years, %d months" + " and %d days ",
                diff.getYears(),
                diff.getMonths(),
                diff.getDays());
    }

    }
