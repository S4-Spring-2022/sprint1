package com.keyin.member;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.Arrays;

public class Member {
    private String name;
    private String address;
    private String email;
    private String phoneNum;
    private LocalDate memberDate;
    private LocalDate memberDuration;
    private String memberType;
    private int memberMonthCost;
    private Tournament tourArray[];

    /*
    Member Types: if not specified memberships last 365 days
        Standard: $1500
        Trial: $300 -- 1 Month
        Special Offer (Buy before March 1st): $1200
        Family: $2600 -- 2 memberships
        Student: $950
        Early Birdie/Night Owl: $750 -- Only Play earlier than - 7:00am or later than - 6:00pm
     */

    //create new member w/ default membership
    public Member(String n, String a, String e, String num, LocalDate date){
        name = n;
        address = a;
        email = e;
        phoneNum = num;
        memberDate = date;
        memberType = "Standard";
        memberDuration = date.plusYears(1);
        memberMonthCost = 125;
    }
    //new member with set membership
    public Member(String n, String a, String e, String num, LocalDate sDate, String mem){
        name = n;
        address = a;
        email = e;
        phoneNum = num;
        memberDate = sDate;
        memberType = mem;
        switch (mem) {
            case "standard" -> {
                memberDuration = sDate.plusYears(1);
                memberMonthCost = 125;
            }
            case "trial" -> {
                memberDuration = sDate.plusMonths(1);
                memberMonthCost = 300;
            }
            case "special" -> {
                memberDuration = sDate.plusYears(1);
                memberMonthCost = 100;
            }
            case "family" -> {
                memberDuration = sDate.plusYears(1);
                memberMonthCost = 217;
                Scanner input = new Scanner(System.in);
                System.out.println("Enter Family Member Name");
                String familyMemberName = input.nextLine();
                //for statement needed to look through data array and compare objs in data to familyMemberName and link them together
            }
            case "student" -> {
                memberDuration = sDate.plusYears(1);
                memberMonthCost = 80;
            }
            case "early" -> {
                memberDuration = sDate.plusYears(1);
                memberMonthCost = 63;
            }
        }
    }
    //set membership type with already created member
    public Member(Member mem, LocalDate sDate, String type){
        mem.memberDate = sDate;
        mem.memberType = type;
        switch (type) {
            case "standard" -> {
                mem.memberDuration = sDate.plusYears(1);
                mem.memberMonthCost = 125;
            }
            case "trial" -> {
                mem.memberDuration = sDate.plusMonths(1);
                mem.memberMonthCost = 300;
            }
            case "special" -> {
                mem.memberDuration = sDate.plusYears(1);
                mem.memberMonthCost = 100;
            }
            case "family" -> {
                mem.memberDuration = sDate.plusYears(1);
                mem.memberMonthCost = 217;
                Scanner input = new Scanner(System.in);
                System.out.println("Enter Family Member Name");
                String familyMemberName = input.nextLine();
                //for statement needed to look through data array and compare objs in data to familyMemberName and link them together
            }
            case "student" -> {
                mem.memberDuration = sDate.plusYears(1);
                mem.memberMonthCost = 80;
            }
            case "early" -> {
                mem.memberDuration = sDate.plusYears(1);
                mem.memberMonthCost = 63;
            }
        }
    }

    //use isAfter and isBefore
    //current tournaments //Past tournaments //upcoming tournaments
    public Object enterTournament(Tournament t){
        t.addMember(this);
        int index = this.tourArray.length -1;
        tourArray[index] = t;
        return tourArray;
    }

    //sets

    //gets
}

// Hello
//Test one two
//three
