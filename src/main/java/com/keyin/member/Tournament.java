package com.keyin.member;

import java.time.LocalDateTime;


// we need to be able to: parse a formatted date string into a LocalDateTime object, done

public class Tournament {

    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private String location;
    private double entryFee; // Money or long, not double?
    private double prizeAmount;
    //private String players; // String? "5" ... Should it be called from Member class using name?
    // Final standings?
    private TournamentRoster players;

    public Tournament() {
        this.startDate = LocalDateTime.now();
        this.endDate = null;
        this.location = "";
        this.entryFee = 0;
        this.prizeAmount = 0;
        this.players = null;
        // final standings?
    }

    public Tournament(String startDate, String endDate, String loc, double fee, double prize, TournamentRoster players) {
        this.startDate = LocalDateTime.parse(startDate);
        this.endDate = LocalDateTime.parse(endDate);
        this.location = loc;
        this.entryFee = fee;
        this.prizeAmount = prize;
        this.players = players;
        // final standings?
    }

    // GETTERS
    // added String getters for date fields

    public LocalDateTime getStartDate() {
        return this.startDate;
    }

    public String getStartDateString() {
        return this.startDate.toString();
    }

    public LocalDateTime getEndDate() {
        return this.endDate;
    }

    public String getEndDateString() {
        return this.endDate.toString();
    }

    public String getLocation() {
        return this.location;
    }

    public double getEntryFee() {
        return this.entryFee;
    }

    public double getPrizeAmount() {
        return this.prizeAmount;
    }

    public TournamentRoster getPlayers() {
        return this.players;
    }

    // final standings?

    // SETTERS

    public void setStartDate(String start) {
        // startFormatNeedsToBe = "2020-01-01T00:00:00"
        this.startDate = LocalDateTime.parse(start);
    }

    public void setEndDate(LocalDateTime end) {
        this.endDate = end;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setEntryFee(double fee) {
        this.entryFee = fee;
    }

    public void setPrizeAmount(double prize) {
        this.prizeAmount = prize;
    }

    public void setPlayers(TournamentRoster players) {
        this.players = players;
    }

    public void addMember(Member player) {
        this.players.addMember(player);
    }

    public String toString() {
        return "Tournament Information: " + "\n"
                + "Start Date:" + startDate + "\n"
                + ", End Date: " + endDate + "\n"
                + ", Location: " + location + "\n"
                + "Entry Fee: " + entryFee + "\n"
                + ", Prize Amount: " + prizeAmount + "\n"
                + ", Number of Players: " + players.getNumberOfMembers();
    }
}
