package com.keyin.member;

import java.util.Date;

public class Membership {

    private String type;
    private Date startDate;
    private String duration;

    public Membership() {
        // this.type = "Family Plan";
        // if (this.type.equals("Family Plan")) {
        // System.out.println("Family members included are ???");
        // }
        this.type = "Normal"; // default
        this.startDate = new Date();
        this.duration = ""; // current date subtract start date?
    }

    public Membership(String type, String duration) {
        this.type = type; // if statement, throw error
        this.startDate = new Date();
        this.duration = duration;
    }

    // GETTERS

    public String getType() {
        return this.type;
    }

    public Date getStartDate() {
        return this.startDate;
    }

    public String getDuration() {
        return this.duration;
    }

    // SETTERS

    public void setType(String type) {
        this.type = type;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String toString() {
        return "Membership[Type: " + type + ", Start Date: " + startDate + ", Duration: " + duration + "]";
    }
}
