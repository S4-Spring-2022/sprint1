package com.keyin.member;

import net.bytebuddy.asm.Advice;

import java.time.LocalDate;
import java.util.ArrayList;
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
    private ArrayList<Tournament> tourArray = new ArrayList<Tournament>();

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
    public Member(String n, String a, String e, String num, String date){
        name = n;
        address = a;
        email = e;
        phoneNum = num;
        memberDate = LocalDate.parse(date);
        memberType = "Standard";
        memberDuration = memberDate.plusYears(1);
        memberMonthCost = 125;
    }
    //new member with set membership
    public Member(String n, String a, String e, String num, String sDate, String mem){
        name = n;
        address = a;
        email = e;
        phoneNum = num;
        memberDate = LocalDate.parse(sDate);
        memberType = mem;
        switch (mem) {
            case "standard" -> {
                memberDuration = memberDate.plusYears(1);
                memberMonthCost = 125;
            }
            case "trial" -> {
                memberDuration = memberDate.plusMonths(1);
                memberMonthCost = 300;
            }
            case "special" -> {
                memberDuration = memberDate.plusYears(1);
                memberMonthCost = 100;
            }
            case "family" -> {
                memberDuration = memberDate.plusYears(1);
                memberMonthCost = 217;
                Scanner input = new Scanner(System.in);
                System.out.println("Enter Family Member Name");
                String familyMemberName = input.nextLine();
                //for statement needed to look through data array and compare objs in data to familyMemberName and link them together
            }
            case "student" -> {
                memberDuration = memberDate.plusYears(1);
                memberMonthCost = 80;
            }
            case "early" -> {
                memberDuration = memberDate.plusYears(1);
                memberMonthCost = 63;
            }
        }
    }
    //set membership type with already created member
    public Member(Member mem, String sDate, String type){
        mem.memberDate = LocalDate.parse(sDate);
        mem.memberType = type;
        switch (type) {
            case "standard" -> {
                mem.memberDuration = mem.memberDate.plusYears(1);
                mem.memberMonthCost = 125;
            }
            case "trial" -> {
                mem.memberDuration = mem.memberDate.plusMonths(1);
                mem.memberMonthCost = 300;
            }
            case "special" -> {
                mem.memberDuration = mem.memberDate.plusYears(1);
                mem.memberMonthCost = 100;
            }
            case "family" -> {
                mem.memberDuration = mem.memberDate.plusYears(1);
                mem.memberMonthCost = 217;
                Scanner input = new Scanner(System.in);
                System.out.println("Enter Family Member Name");
                String familyMemberName = input.nextLine();
                //for statement needed to look through data array and compare objs in data to familyMemberName and link them together
            }
            case "student" -> {
                mem.memberDuration = mem.memberDate.plusYears(1);
                mem.memberMonthCost = 80;
            }
            case "early" -> {
                mem.memberDuration = mem.memberDate.plusYears(1);
                mem.memberMonthCost = 63;
            }
        }
    }

    //use isAfter and isBefore
    //current tournaments //Past tournaments //upcoming tournaments
    public Object enterTournament(Tournament t){
        t.addMember(this);
        tourArray.add(t);
        return tourArray;
    }

    //sets

    //gets
    public String getName(){
        return name;
    }
    public void getTourneys(){
        System.out.println("\n--- Tournaments ---");
        for(Tournament tournament : tourArray){
            System.out.println(tournament.getName());
        }
    }
    public String toString(){
        return "\nMember Name: " + this.name
                + "\nMember Address: " + this.address
                + "\nMember Email: " + this.email
                + "\nMember Phone Number: " + this.phoneNum
                + "\n"
                + "\n--- Membership Info ---"
                + "\nMembership Type: " + this.memberType
                + "\nMembership Start Date: " + this.memberDate
                + "\nMembership End Date: " + this.memberDuration
                + "\n"
                + "\n--- Members Tournaments ---"
                + "\n ****ERROR**** WORK IN PROGRESS ****ERROR****";
    }
}

// Hello
//Test one two
//three
