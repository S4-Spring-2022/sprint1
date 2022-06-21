package com.keyin.member;

import java.util.Date;

public class Member extends Person {

    private String memberName;
    private String memberAddress;
    private String memberEmail;
    private int memberPhone;
    private Date memberStartDate;
    private String memberDuration;
    private String memberType;
    public static int memberCount = 0;

    public Member() {
        super("", "", "", 0);
        // this.memberStartDate = new Date();
        // this.memberDuration = "";
        // this.memberType = "";
        memberCount++;
    }

    public Member(String duration, String type) {
        super("", "", "", 0);
        // this.memberStartDate = new Date();
        // this.memberDuration = duration;
        // this.memberType = type;
        memberCount++;
    }

    public Member(String name, String address, String email, int phone, String duration, String type) {
        super(name, address, email, phone);
        // this.memberStartDate = new Date();
        // this.memberDuration = duration;
        // this.memberType = type;
        memberCount++;
    }

    // GETTERS

    public String getName() {
        return this.memberName;
    }

    public String getAddress() {
        return this.memberAddress;
    }

    public String getEmail() {
        return this.memberEmail;
    }

    public int getPhone() {
        return this.memberPhone;
    }

    // public Date getStartDate() {
    // return this.memberStartDate;
    // }

    // public String getDuration() {
    // return this.memberDuration;
    // }

    // public String getType() {
    // return this.memberType;
    // }

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

    // will membership types be defined as objects or strings?
    // public void setType(String type) {
    // this.memberType = type;
    // }

    public String toString() {
        return "Member name: " + memberName + "\n"
                + "Address: " + memberAddress + "\n"
                + "Email: " + memberEmail + "\n"
                + "Phone: " + memberPhone + "\n";
        // + "Membership Start Date: " + memberStartDate + "\n"
        // + "Membership Duration: " + memberDuration + "\n"
        // + "Member Type: " + memberType + "\n";
    }

    // this method is probably unnecesary as the constructor will call a start date
    // creation from a current date object
    // public void setStartDate(Date startDate) {

    // this.memberStartDate = startDate;
    // }

    // this will be a calculated value based on start date and current date
    // public void setDuration(String duration) {
    // this.memberDuration = duration;
    // }

}
