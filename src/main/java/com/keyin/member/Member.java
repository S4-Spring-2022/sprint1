package com.keyin.member;

import java.util.Date;

public class Member {

    private String memberName;
    private String memberAddress;
    private String memberEmail;
    private int memberPhone;
    private Date memberStartDate;
    private String memberDuration;
    private String memberType;

    public Member(String name, String address, String email, int phone, Date start, String duration, String type) {
        this.memberName = name;
        this.memberAddress = address;
        this.memberPhone = phone;
        this.memberType = type;
        this.memberStartDate = start;
        this.memberDuration = duration;
        this.memberType = type;
    }

    // GETTERS

    public String getName() {
        return memberName;
    }

    public String getAddress() {
        return memberAddress;
    }

    public String getEmail() {
        return memberEmail;
    }

    public int getPhone() {
        return memberPhone;
    }

    public Date getStartDate() {
        return memberStartDate;
    }

    public String getDuration() {
        return memberDuration;
    }

    public String getType() {
        return memberType;
    }

    // SETTERS
    // Do members have the authority to change their own information?
    // Do we need a setter for each field?
    // Would we enter the date or use a date method to set the start date?
    // Given that this is a CLI how will the CLI use these methods?
    // Will memberType be an object or a string?


    public void setName(String name) {
        this.memberName = name;
    }

    public void setAddress(String address) {
        this.memberAddress = address;
    }

    public void setEmail(String email) {
        this.memberEmail = email;
    }

    public void setPhone(int phone) {
        this.memberPhone = phone;
    }

    public void setStartDate(Date startDate) {
        this.memberStartDate = startDate;
    }

    public void setDuration(String duration) {
        this.memberDuration = duration;
    }

    public void setType(String type) {
        this.memberType = type;
    }

}

// testing comment to Team2_MikeBranchFromGroup.
// Here's another comment to Team2_MikeBranchFromGroup.
// here's a comment after our Git error occured.
