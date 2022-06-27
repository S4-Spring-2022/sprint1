package com.keyin.member;

import net.bytebuddy.asm.Advice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
//test comment
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
    private ArrayList<String> currentTourArray = new ArrayList<String>();
    private ArrayList<String> pastTourArray = new ArrayList<String>();
    private ArrayList<String> upcomingTourArray = new ArrayList<String>();
    private Member familyMember = null;

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
    public Member(String n, String a, String e, String num, String sDate, String mem){ //find out how to have 'if' parameter
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
//                familyMember = fMember;
//                fMember.setMembership(sDate, "family", this);

//                Scanner input = new Scanner(System.in);
//                System.out.println("Enter Family Member Name");
//                String familyMemberName = input.nextLine();
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

    public Member(String n, String a, String e, String num, String sDate, String mem, Member fMember){ //find out how to have 'if' parameter
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
                familyMember = fMember;
                fMember.familyMember = this;
                fMember.setMembership(sDate, "family");

//                Scanner input = new Scanner(System.in);
//                System.out.println("Enter Family Member Name");
//                String familyMemberName = input.nextLine();
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


    //set membership type
    public void setMembership( String sDate, String type){
        this.memberDate = LocalDate.parse(sDate);
        this.memberType = type;
        switch (type) {
            case "standard" -> {
                this.memberDuration = this.memberDate.plusYears(1);
                this.memberMonthCost = 125;
            }
            case "trial" -> {
                this.memberDuration = this.memberDate.plusMonths(1);
                this.memberMonthCost = 300;
            }
            case "special" -> {
                this.memberDuration = this.memberDate.plusYears(1);
                this.memberMonthCost = 100;
            }
            case "family" -> {
                this.memberDuration = this.memberDate.plusYears(1);
                this.memberMonthCost = 217;

//                fMember.setMembership(sDate, "family", this);
//                Scanner input = new Scanner(System.in);
//                System.out.println("Enter Family Member Name");
//                String familyMemberName = input.nextLine();
                //for statement needed to look through data array and compare objs in data to familyMemberName and link them together
            }
            case "student" -> {
                this.memberDuration = this.memberDate.plusYears(1);
                this.memberMonthCost = 80;
            }
            case "early" -> {
                this.memberDuration = this.memberDate.plusYears(1);
                this.memberMonthCost = 63;
            }
        }
    }

    public void setMembership( String sDate, String type, Member fMember){
        this.memberDate = LocalDate.parse(sDate);
        this.memberType = type;
        switch (type) {
            case "standard" -> {
                this.memberDuration = this.memberDate.plusYears(1);
                this.memberMonthCost = 125;
            }
            case "trial" -> {
                this.memberDuration = this.memberDate.plusMonths(1);
                this.memberMonthCost = 300;
            }
            case "special" -> {
                this.memberDuration = this.memberDate.plusYears(1);
                this.memberMonthCost = 100;
            }
            case "family" -> {
                this.memberDuration = this.memberDate.plusYears(1);
                this.memberMonthCost = 217;
                familyMember = fMember;
                fMember.familyMember = this;
                fMember.setMembership(sDate, "family");

//                fMember.setMembership(sDate, "family", this);
//                Scanner input = new Scanner(System.in);
//                System.out.println("Enter Family Member Name");
//                String familyMemberName = input.nextLine();
                //for statement needed to look through data array and compare objs in data to familyMemberName and link them together
            }
            case "student" -> {
                this.memberDuration = this.memberDate.plusYears(1);
                this.memberMonthCost = 80;
            }
            case "early" -> {
                this.memberDuration = this.memberDate.plusYears(1);
                this.memberMonthCost = 63;
            }
        }
    }



    //use isAfter and isBefore
    //current tournaments //Past tournaments //upcoming tournaments
    public void enterTournament(Tournament t){
        t.addMember(this);
        tourArray.add(t);
    }

    //sets
    public String setName(String n){
        name = n;
        return name;
    }

    public String setAddress(String a){
        address = a;
        return address;
    }
    public String setEmail(String e){
        email = e;
        return email;
    }
    public String setPhone(String p){
        phoneNum = p;
        return phoneNum;
    }
    //gets
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public String getEmail(){
        return email;
    }
    public String getPhone(){
        return phoneNum;
    }

    public String getTourneysUpcoming(){
//        System.out.println("\n--- Upcoming Tournaments ---");
//        for(Tournament tournament : tourArray){
//            if(tournament.getStartDate().isAfter(LocalDate.now())){
//                System.out.println(tournament.getName());
//            }
//        }
        for(Tournament tournament : tourArray){
            if(tournament.getStartDate().isAfter(LocalDate.now())){
                upcomingTourArray.add( tournament.getName());
            }
        }
        return "\n--- Upcoming Tournaments ---\n" + upcomingTourArray;
    }
    public String getTourneysCurrent(){
//        System.out.println("\n--- Current Tournaments ---");
//        for(Tournament tournament : tourArray){
//            if(tournament.getStartDate().isBefore(LocalDate.now()) && tournament.getEndDate().isAfter(LocalDate.now())){
//                System.out.println(tournament.getName());
//            }
//        }
        for(Tournament tournament : tourArray){
            if(tournament.getEndDate().isAfter(LocalDate.now()) && tournament.getStartDate().isBefore(LocalDate.now())){
                currentTourArray.add( tournament.getName());
            }
        }
        return "\n--- Current Tournaments ---\n" + currentTourArray;
    }
    public String getTourneysPast(){
//        System.out.println("\n--- Past Tournaments ---");
//        for(Tournament tournament : tourArray){
//            if(tournament.getEndDate().isBefore(LocalDate.now())){
//                System.out.println(tournament.getName());
//            }
//        }
        for(Tournament tournament : tourArray){
            if(tournament.getEndDate().isBefore(LocalDate.now())){
                pastTourArray.add( tournament.getName());
            }
        }
        return "\n--- Past Tournaments ---\n" + pastTourArray;
    }

    public String infoToString(){
        return "\nMember Name: " + this.name
                + "\nMember Address: " + this.address
                + "\nMember Email: " + this.email
                + "\nMember Phone Number: " + this.phoneNum;
    }
    public String membershipToString(){
        String fMemberOutput;
        if (this.familyMember == null){
            fMemberOutput = "N/A";
        } else {
            fMemberOutput = this.familyMember.name;
        }
        return "\n--- Membership Info ---"
                + "\nMembership Type: " + this.memberType
                + "\nMembership Start Date: " + this.memberDate
                + "\nMembership End Date: " + this.memberDuration
                + "\nMembership Monthly Fee: " + this.memberMonthCost
                + "\nFamily Member: " + fMemberOutput;
    }

    public String allTournamentsToString(){
        return "\n--- All Tournaments ---"
                + this.tourArray;
    }


    public Member getFMember(){
        return familyMember;
    }

    public String getMemberType(){
        return memberType;
    }
}

// Hello
//Test one two
//three
//two
