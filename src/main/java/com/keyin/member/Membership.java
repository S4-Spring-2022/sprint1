package com.keyin.member;

import java.util.Date;

public class Membership {

    private String type;
    private Date StartDate;
    private String duration;

    public Membership() {
        this.type = "";
        this.StartDate = new Date();
        this.duration = "";
    }

    public Membership(String type, String duration) {
        this.type = type;
        this.StartDate = new Date();
        this.duration = duration;
    }
}
