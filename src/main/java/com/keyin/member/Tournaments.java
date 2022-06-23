package com.keyin.member;

public class Tournaments {
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

    public Tournaments() {

    }

    public String getTournamentName(String string) {
        return tournamentName;
    }

    public void setTournamentName(String tournamentName) {
        this.tournamentName = tournamentName;
    }

    public String getLocation(String place) {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getEntryFee(double v) {
        return entryFee;
    }

    public void setEntryFee(double entryFee) {
        this.entryFee = entryFee;
    }

    public String getStartDate(String name) {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate(String date) {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public double getCashPrizeAmount(double v) {
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
