package com.keyin.member;

import java.util.ArrayList;


public class Member {
    private String memberName;
    private String memberAddress;
    private String memberEmail;
    private String memberPhone;
    private String membershipStartDate;
    private int membershipDuration;
    private String membershipType;
    private ArrayList<String> membershipFamilyMembers;
    private ArrayList<String> currentTournaments;
    private ArrayList<String> pastTournaments;
    private ArrayList<String> upcomingTournaments;

    public Member(String memberName, String memberAddress, String memberEmail, String memberPhone, String membershipStartDate, int membershipDuration, String membershipType, ArrayList<String> membershipFamilyMembers, ArrayList<String> currentTournaments, ArrayList<String> pastTournaments, ArrayList<String> upcomingTournaments) {
        this.memberName = memberName;
        this.memberAddress = memberAddress;
        this.memberEmail = memberEmail;
        this.memberPhone = memberPhone;
        this.membershipStartDate = membershipStartDate;
        this.membershipDuration = membershipDuration;
        this.membershipType = membershipType;
        this.membershipFamilyMembers = membershipFamilyMembers;
        this.currentTournaments = currentTournaments;
        this.pastTournaments = pastTournaments;
        this.upcomingTournaments = upcomingTournaments;
    }

    public String getMemberName() {
        return this.memberName;
    }

    public String getMemberAddress() {
        return this.memberAddress;
    }

    public String getMemberEmail() {
        return this.memberEmail;
    }

    public String getMemberPhone() {
        return this.memberPhone;
    }

    public String getMembershipStartDate() {
        return this.membershipStartDate;
    }

    public int getMembershipDuration() {
        return this.membershipDuration;
    }

    public String getMembershipType() {
        return this.membershipType;
    }

    public ArrayList<String> getMembershipFamilyMembers() {
        return this.membershipFamilyMembers;
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
}
