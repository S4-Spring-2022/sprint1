package com.keyin.member;
// Team -1 Barry_David_Gerald
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

class Demo {
    public static void main(String[] args) {

    Member newMember = new Member("Barry", "101 new way", "barry@barry", "709-550-1102", LocalDate.of(2020, Month.JUNE, 21));

        System.out.println("Member Name: "+ newMember.getMemberName() );
        System.out.println("Member Address: "+ newMember.getMemberAddress() );
        System.out.println("Member Email: "+ newMember.getEmail());
        System.out.println("Member Phone: "+ newMember.getPhoneNumber());
        System.out.println("Member Start Date: "+ newMember.getStartDate());
        newMember.getDuration();

    Tournaments newTournaments = new Tournaments("Dave's Cash", "Piper's Hole",   1500, "2022/06/23", "2022/06/26",  25000);
    System.out.println("");
    System.out.println("Tournament Name: " + newTournaments.getTournamentName());
    System.out.println("Tournament Location " + newTournaments.getLocation());
    System.out.println("Tournament Entry Fee $" + newTournaments.getEntryFee());
    System.out.println("Tournament Start Date: " + newTournaments.getStartDate());
    System.out.println("Tournament End Date: " + newTournaments.getEndDate());
    System.out.println("Tournament Cash Prize Payout $" + newTournaments.getCashPrizeAmount());
    System.out.println("");


       ArrayList<String> Golf = new  ArrayList();
            Golf.add("Dave's Cash");
            Golf.add("Summer Smash");
            Golf.add("Swing Into Canada");
            Golf.add("Dog Days");
            Golf.add("August Affair");
            Golf.add("Provincials");
            Golf.add("Slide Quietly By September");
            Golf.add("October Harvest");

            System.out.println("");
            System.out.println(Golf);
            System.out.println("");

    }

}



