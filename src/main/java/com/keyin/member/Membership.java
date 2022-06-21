package com.keyin.member;

import java.time.LocalDateTime;
import java.time.chrono.*;
import java.time.temporal.ChronoUnit;

import static java.time.temporal.ChronoUnit.DAYS;

public class Membership {

    private String type;
    private LocalDateTime startDate;
    private String duration;

    public Membership() {
        this.type = "Normal";
        this.startDate = LocalDateTime.now();
        // this.duration = ""; //

    }

    public Membership(String type) {
        this.type = type; // if statement, throw error
        this.startDate = LocalDateTime.now();
        // this.duration = duration;
    }

    // GETTERS

    public String getType() {
        return this.type;
    }

    public LocalDateTime getStartDate() {
        return this.startDate;
    }

    public String getDuration() {
        // to find the difference as a CHRONO_UNIT we need to subtract the current date
        // from the start date
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime start = this.getStartDate();
        // this next line is here for testing purposes in the absence of data purpituity
        now = now.plusDays(30);
        long diff = ChronoUnit.DAYS.between(start, now);
        this.duration = String.valueOf(diff);
        return this.duration;
    }

    // SETTERS

    public void setType(String type) {
        this.type = type;
    }

    // public void setDuration(String duration) {
    // this.duration = duration;
    // }

    public String toString() {
        return "Membership[Type: " + type + ", Start Date: " + startDate + ", Duration: " + duration + "]";
    }
}
