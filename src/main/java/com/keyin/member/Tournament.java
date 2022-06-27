package com.keyin.member;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.LocalDate;
import java.util.Date;

public class Tournament {
    private String name;
    private LocalDate startDate;
    private LocalDate endDate;
    private String location;
    private int entryFee;
    private int prizeAmount;
    private ArrayList<Member> members = new ArrayList<Member>();

    public Tournament(String n, String start, String end, String loc, int fee, int prize){
        name = n;
        startDate = LocalDate.parse(start);
        endDate = LocalDate.parse(end);
        location = loc;
        entryFee = fee;
        prizeAmount = prize;
    }


    public Object addMember(Member member){
        members.add(member);
        return members;
    }

    public boolean getStandings(){
        LocalDate today = LocalDate.now();
        //if the end date has passed then standings are final and can be published

        if(today.isAfter(this.endDate)){
            System.out.println("\n--- Standings ---");
            for(int i = 0; i < members.size(); i ++){
                System.out.println(i+1 + ". " + members.get(i).getName());
            }
            return true;

        } else {
            System.out.println("\nEvent not ended.");
            return false;
        }
    }

    public String toString(){
        //work in progress
        //print string of all the tournament information
        return "\n--- Tournament Info ---"
                + "\nTournament Name: " + this.name
                + "\nTournament Start Date: " + this.startDate
                + "\nTournament End Date: " + this.endDate
                + "\nTournament Location: " + this.location
                + "\nTournament Fee: $" + this.entryFee
                + "\nTournament Prize: $" + this.prizeAmount;
    }

    //more sets

    //more gets
    public LocalDate getStartDate(){
        return startDate;
    }
    public LocalDate getEndDate(){
        return endDate;
    }
    public ArrayList<Member> getMembers(){
        return members;
    }
    public String getName(){
        return this.name;
    }

    public String getLocation() {return this.location;}

    public int getFee(){return this.entryFee;}

    public int getPrizeAmount() {return this.prizeAmount;}
}
