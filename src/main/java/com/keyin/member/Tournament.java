package com.keyin.member;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.time.LocalDate;
import java.util.Date;

public class Tournament {
    private LocalDate startDate;
    private LocalDate endDate;
    private String location;
    private int entryFee;
    private int prizeAmount;
    private Object members[];
    private String standings;
    private int count;

    public Tournament(String start, String end, String loc, int fee, int prize){
        startDate = LocalDate.parse(start);
        endDate = LocalDate.parse(end);
        location = loc;
        entryFee = fee;
        prizeAmount = prize;
        count = 0;
    }

    public Object addMember(Member member){
        this.members[this.count] = member;
        this.count ++;
        return this.members;
    }

    public String getStandings(){
        LocalDate today = LocalDate.now();
        //if the end date has passed then standings are final and can be published
        if(today.isAfter(this.endDate)){
            this.standings = "Standings: " + Arrays.toString(this.members);
            System.out.println(this.standings);
            return this.standings;
        } else {
            System.out.println("Event not ended.");
            return "Event not ended.";
        }
    }

//    public String getTournamentInfo(){
//        //work in progress
//        //print string of all the tournament information
//    }

    //more sets

    //more gets
}
