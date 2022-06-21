package com.keyin.member;

import java.time.LocalDateTime;

public class Tournament {

    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private String location;
    private double entryFee; // Money or long, not double?
    private double prizeAmount;
    private String players; // String? "5" ... Should it be called from Member class using name?
    // Final standings?
    // private TournamentRoster players;

    public Tournament() {
        this.startDate = LocalDateTime.now();
        this.endDate = LocalDateTime.now();
        this.location = "";
        this.entryFee = 0;
        this.prizeAmount = 0;
        this.players = "";
        // final standings?
    }

    public Tournament(LocalDateTime start, LocalDateTime end, String loc, double fee, double prize, String players) {
        this.startDate = start;
        this.endDate = end;
        this.location = loc;
        this.entryFee = fee;
        this.prizeAmount = prize;
        this.players = players;
        // final standings?
    }

    // GETTERS

    public LocalDateTime getStartDate() {
        return this.startDate;
    }

    public LocalDateTime getEndDate() {
        return this.endDate;
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

    public String getPlayers() {
        return this.players;
    }

    // final standings?

    // SETTERS

    public void setStartDate(LocalDateTime start) {
        this.startDate = start;
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

    public void setPlayers(String players) {
        this.players = players;
    }

    public String toString() {
        return "Tournament Information: " + "\n"
                + "Start Date:" + startDate + "\n"
                + ", End Date: " + endDate + "\n"
                + ", Location: " + location + "\n"
                + "Entry Fee: " + entryFee + "\n"
                + ", Prize Amount: " + prizeAmount + "\n"
                + ", Number of Players: " + players;
    }
}
