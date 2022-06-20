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

}
