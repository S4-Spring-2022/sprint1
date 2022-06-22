package com.keyin.member;


import java.time.LocalDate;
import java.time.Period;

public class Member {
    private String memberFirstName;
    private String memberLastName;
    private String memberAddress;
    private String email;
    private String phoneNumber;
    private LocalDate startDate;
    private LocalDate duration;
//    private LocalDate todaysDate;

    public Member() {
    }
    public Member(String memberFirstName, String memberLastName, String memberAddress, String email, String phoneNumber, LocalDate startDate){
        this.memberFirstName = memberFirstName;
        this.memberLastName = memberLastName;
        this.memberAddress = memberAddress;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.startDate = startDate;

    }




    public String getMemberFirstName(){
        return memberFirstName;
    }

    public void setMemberFirstName(String memberFirstName) {
        this.memberFirstName = memberFirstName;
    }

    public String getMemberLastName(){
        return memberFirstName;
    }

    public void setMemberLastName(String memberLastName) {
        this.memberLastName = memberLastName;
    }

    public String getMemberAddress(){
        return memberAddress;
    }

    public void setMemberAddress(String memberAddress) {
        this.memberAddress = memberAddress;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void  setStartDate(LocalDate date) {
        this.startDate = date;
    }
    public LocalDate getStartDate(){
        return startDate;
    }

    public void setDuration(LocalDate duration) {
        this.duration = duration;
    }

    public LocalDate getDuration(){
//        LocalDate startDate = LocalDate.of(2020, Month.JUNE, 21);
        LocalDate today = LocalDate.now();
        Period time = Period.between(startDate, today);
        int years = time.getYears();
        int months = time.getMonths();
        int days = time.getDays();
        System.out.println("Membership Duration: " + years + " year(s)"  + "," + months  + " Month(s)" + ","+ days + " Day(s) " );
        return duration;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}



  