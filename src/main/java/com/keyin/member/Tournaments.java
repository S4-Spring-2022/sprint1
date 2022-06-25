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
        return  ("Tournament " + getTournamentName() + " will be held at this location: " + getLocation() + "\n"
                + " with an entry fee of " + getEntryFee()+ " and a payout prize money of this " + getCashPrizeAmount() + "\n"
                + " and set for this starting date " + getStartDate() + " and this finishing date " + getEndDate());

    }


}
