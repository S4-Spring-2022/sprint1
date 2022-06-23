package com.keyin.member;

// import java.time.*; // Import the LocalDateTime class
import java.util.Date;
import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.chrono.*;
import java.time.temporal.ChronoUnit;

public class Member{
    private String name;
    private String address;
    private String emailAddress;
    private String phoneNumber;
    private LocalDateTime startOfMembership;
    private String durationOfMembership;
    private String typeOfMembership;
    private ArrayList <Tournament> currentTournaments;
    private ArrayList <Tournament> pastTournaments;
    private ArrayList <Tournament> upcomingTournaments;




    public Member(String n, String add, String email, String phoneNum, LocalDateTime memberStart, String duration, String type, Tournament current[],Tournament past[],Tournament upcoming[])
    {
        this.name = n;
        this.address = add;
        this.emailAddress = email;
        this.phoneNumber = phoneNum;
        this.startOfMembership = memberStart;
        this.durationOfMembership = duration;
        this.typeOfMembership = type;
        this.currentTournaments = current;
        this.pastTournaments = past;
        this.upcomingTournaments = upcoming;

    }



//Getters

    public String getName(){
        return this.name;
    }

    public String getAddress(){
        return this.address;
    }

    public String getEmail(){
        return this.emailAddress;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public LocalDateTime getStartDate(){
        return this.startOfMembership;
    }

    public String getDuration(){
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime start = this.getStartDate();
        long diff = ChronoUnit.DAYS.between(start, now);
        this.durationOfMembership = String.valueOf(diff);
        return this.durationOfMembership;
    }

    public String getType(){
        return this.typeOfMembership;
    }

    public ArrayList<String> getCurrentTournaments() {
        return this.currentTournaments;
    }

    public ArrayList<String> getPastTournaments() {
        return this.pastTournaments;
    }

    public ArrayList<String> getUpcomingTournaments() {
        return this.upcomingTournaments;
    }


//Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress (String address){
        this.address = address;
    }

    public void setEmail(String emailAddress){
        this.emailAddress = emailAddress;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public void setStartOfMembership(LocalDateTime startOfMembership){
        this.startOfMembership = startOfMembership;
    }

    public void setTypeOfMembership(String typeOfMembership){
        this.typeOfMembership = typeOfMembership;


    }



    public String toString(){
        return "Member name: " + name + "\n"
                + "Address: " + address + "\n"
                +"Email Address: " + emailAddress + "\n"
                +"Phone Number: " + phoneNumber  + "\n"
                +"Start Date of Membership: " +startOfMembership + "\n"
                +"Duration of Membership: " + durationOfMembership + "\n"
                +"Membership Type: " +typeOfMembership + "\n"
                +"Current Tournaments in which member is registered: " +currentTournaments + "\n"
                +"Past Tournaments in which member is registered: " +pastTournaments + "\n"
                +"Upcoming Tournaments in which member is registered: " +upcomingTournaments + "\n";

    }

}
