package com.keyin.member;

import java.time.*;
import java.util.Date;
import java.util.Locale;
import java.time.LocalDate;
import java.time.Month;

import java.time.Period;

public class Member {
    private String memberName;
    private String memberAddress;
    private String email;
    private String phoneNumber;
    private LocalDate startDate;
    private LocalDate duration;
//    private LocalDate todaysDate;

    public Member() {
    }
    public Member(String memberName, String memberAddress, String email, String phoneNumber, LocalDate startDate){
        this.memberName = memberName;
        this.memberAddress = memberAddress;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.startDate = startDate;

    }




    public String getMemberName(){
        return memberName;
    }

    public String getMemberAddress(){
        return memberAddress;
    }

    public String getEmail(){
        return email;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }
    public void  setStartDate(LocalDate date) {
        this.startDate = date;
    }
    public LocalDate getStartDate(){
        return startDate;
    }

    public LocalDate getDuration(){
//        LocalDate startDate = LocalDate.of(2020, Month.JUNE, 21);
        LocalDate today = LocalDate.now();
        Period time = Period.between(startDate, today);
        int years = time.getYears();
        int months = time.getMonths();
        int days = time.getDays();
        System.out.println("Membership Duration: " + years + " year(s)"  + "," + months  + " Month(s)" + ","+ days + " Day(s) " );
        return duration;
    }

}

