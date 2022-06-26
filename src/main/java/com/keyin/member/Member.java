package com.keyin.member;
// Team -1 Barry_David_Gerald

// testing branches
// Testing again for the 3rd time
// import java.time.*; // Import the LocalDateTime class
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Member{
    private String name;
    private String address;
    private String emailAddress;
    private String phoneNumber;
    private LocalDateTime startOfMembership;
    private String durationOfMembership;
    private String typeOfMembership;
    private String currentTournaments;
    private String pastTournaments;
    private String upcomingTournaments;

//    private boolean active;
//    public Member(){this.active = true};


//    public Member(String n, String add, String email, String phoneNum, LocalDateTime memberStart, String duration, String type, Tournament current[],Tournament past[],Tournament upcoming[])
//    {
//        this.name = n;
//        this.address = add;
//        this.emailAddress = email;
//        this.phoneNumber = phoneNum;
//        this.startOfMembership = memberStart;
//        this.durationOfMembership = duration;
//        this.typeOfMembership = type;
//        this.currentTournaments = current;
//        this.pastTournaments = past;
//        this.upcomingTournaments = upcoming;
//
//    }

    public Member(String name, String address, String emailAddress, String phoneNumber, LocalDateTime startOfMembership, String durationOfMembership, String typeOfMembership, String currentTournaments, String pastTournaments, String upcomingTournaments)
    {
        this.name = name;
        this.address = address;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.startOfMembership = startOfMembership;
        this.durationOfMembership = durationOfMembership;
        this.typeOfMembership = typeOfMembership;
        this.currentTournaments = currentTournaments;
        this.pastTournaments = pastTournaments;
        this.upcomingTournaments = upcomingTournaments;

    }

    public Member(){

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

    public String getCurrentTournaments() {
        return this.currentTournaments;
    }

    public String getPastTournaments() {
        return this.pastTournaments;
    }

    public String getUpcomingTournaments() {
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

    public void setCurrentTournaments(String currentTournaments){
        this.currentTournaments = currentTournaments;
    }

    public void setPastTournaments(String pastTournaments){
        this.pastTournaments = pastTournaments;
    }

    public void setUpcomingTournaments(String upcomingTournaments){
        this.upcomingTournaments = upcomingTournaments;
    }



    public String toString(){
        return "Member name: " + name + "\n" + "Address: " + address + "\n"
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
