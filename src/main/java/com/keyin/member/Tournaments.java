package com.keyin.member;

import java.util.*;

public class Tournaments {
    private String tournamentName;
    private String location;
    private double entryFee;
    private String StartDate;
    private String endDate;
    private double cashPrizeAmount;

    private String tournamentName;
    private String location;
    private double entryFee;
    private String startDate;
    private String endDate;
    private double cashPrizeAmount;


    public Tournaments(String tournamentName, String location, double entryFee, String startDate, String endDate, double cashPrizeAmount) {
        this.tournamentName = tournamentName;
        this.location = location;
        this.entryFee = entryFee;
        this.startDate = startDate;
        this.endDate = endDate;
        this.cashPrizeAmount = cashPrizeAmount;

    }

    public String getTournamentName() {
        return tournamentName;
    }

    public void setTournamentName(String tournamentName) {
        this.tournamentName = tournamentName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getEntryFee() {
        return entryFee;
    }

    public void setEntryFee(double entryFee) {
        this.entryFee = entryFee;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public double getCashPrizeAmount() {
        return cashPrizeAmount;
    }

    public void setCashPrizeAmount(double cashPrizeAmount) {
        this.cashPrizeAmount = cashPrizeAmount;
    }

    public String toString() {
        System.out.println("Tournament " + this.tournamentName + " will be held at this location: " + this.location
                + " with an entry fee of " + this.entryFee + " and a payout prize money of this " + this.cashPrizeAmount
                + " and set for this starting date " + this.startDate + " and this finishing date " + this.endDate);
        return toString();

    }




}
