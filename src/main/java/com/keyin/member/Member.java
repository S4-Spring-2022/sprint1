package com.keyin.member;

import java.time.LocalDate;
import java.util.Date;

public class Member {
    private String memberName;
    private String memberAddress;
    private String email;
    private String phoneNumber;
    private LocalDate startDate;
    private LocalDate duration;
    private LocalDate todaysDate;

    public Member(String memberName, String memberAddress, String email, String phoneNumber, LocalDate startDate, LocalDate duration){
        this.memberName = memberName;
        this.memberAddress = memberAddress;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.startDate = startDate;
        this.duration = duration;
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

    public LocalDate getStartDate(){
        return startDate;
    }

    public LocalDate getTodaysDate(){
        return  LocalDate today = LocalDate.now();

    }
}


