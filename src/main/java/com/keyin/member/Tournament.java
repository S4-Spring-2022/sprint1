package com.keyin.member;

// import java.time.*; // Import the String class

import java.time.LocalDateTime;



public class Tournament {
    public String startDate;
    public String endDate;
    public String location;
    public String entryFee;
    public String cashPrize;
    public String partMembers;
    public String finalStandings;


    public Tournament(String start, String end, String loc, String fee, String cash, String part, String standings)
    {
        this.startDate = start;
        this.endDate = end;
        this.location = loc;
        this.entryFee = fee;
        this.cashPrize = cash;
        this.partMembers = part;
        this.finalStandings = standings;
    }
    public Tournament(){

    }
    //Getters
    public String getStartDate(){ return this.startDate; }
    public String getEndDate(){ return this.endDate; }
    public String getLocation(){ return this.location; }
    public String getPartMembers(){ return this.partMembers; }
    public String getFinalStandings(){ return this.finalStandings; }
    public String getEntryFee(){ return this.entryFee;}
    public String getCashPrize(){ return this.cashPrize;}

    //Setters
    public void setStartDate(String startDate) {this.startDate = startDate;}
    public void setEndDate(String endDate) {this.endDate = endDate;}
    public void setLocation(String location) {
        this.location = location;
    }
    public void setPartMembers(String partMembers) {
        this.partMembers = partMembers;
    }
    public void setFinalStandings(String finalStandings) {
        this.finalStandings = finalStandings;
    }
    public void setEntryFee(String entryFee) {
        this.entryFee = entryFee;
    }
    public void setCashPrize(String cashPrize) {
        this.cashPrize = cashPrize;
    }

    public String toString(){
        return "Start Date: " + startDate + "\n"
                + "End Date: " + endDate + "\n"
                + "Location: " + location + "\n"
                + "Entry Fee: " + entryFee + "\n"
                + "Cash Prize: " + cashPrize + "\n"
                + "Participating Members: " + partMembers + "\n"
                + "finalStandings: " + finalStandings + "\n";

    }
}
