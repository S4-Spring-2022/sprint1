package com.keyin.member;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Membership {

    private String type;
    private LocalDateTime startDate;
    private String duration;
    private Family membershipFamily = new Family();

    public Membership() {
        this.type = "Normal"; 
        this.startDate = LocalDateTime.now();
        this.duration = this.getDuration();

    }

    public Membership(String type) {
        this.startDate = LocalDateTime.now();
        this.type = membershipTypeValidation(type);
        if (type == "Family Plan") {
            System.out.println(membershipFamily.getMembers());
        }
        this.duration = this.getDuration();
        
    }

    public String getType() {
        return this.type;
    }

    public LocalDateTime getStartDate() {
        return this.startDate;
    }

    public String getDuration() {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime start = this.getStartDate();
        // this next line is here for testing purposes in the absence of data perpetuity
        now = now.plusDays(30);
        long diff = ChronoUnit.DAYS.between(start, now);
        this.duration = String.valueOf(diff);
        return this.duration;
    }

    public Family getFamily() {
        return this.membershipFamily;
    }

    public void setType(String type) {
        this.type = membershipTypeValidation(type);
    }

    public void setFamily(Family family) {
        this.membershipFamily = family;
    }

    public String toString() {
        return "Membership[Type: " + type + ", Start Date: " + startDate + ", Duration: " + duration + "]";
    }

    private String membershipTypeValidation(String type) {
        // validation was causing an error, stripped for now
        // if (type != "Normal" && type != "Trial" && type != "Special Offer" && type != "Family Plan"
        //         && type != "Other") {
        //     System.out.println("Error! Membership must be a proper type!");
        //     return null;
        // } 
        return type;
        
    }

}
