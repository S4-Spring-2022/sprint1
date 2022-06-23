package com.keyin.member;

import org.mockito.internal.configuration.CaptorAnnotationProcessor;

import java.time.LocalDate;
import java.util.ArrayList;

public class MemberService {

    public static void main(String[] args){
        Member m1 = new Member("Bryson Dechambeau", "23 Random Avenue", "bdechambeau123@gmail.com", "(222)555-4474", "2022-06-22");
        Member m2 = new Member("Phil Mickelson", "24 New Street", "PM89@gmail.com", "(222)555-3213", "2022-06-22");
        Member m3 = new Member("Justin Thomas", "25 Birdie Crescent", "TheJT90@gmail.com", "(222)555-1112", "2022-06-22");
        Member m4 = new Member(m3,"2022-06-22", "Student");

        Tournament Masters = new Tournament("The Masters", "2022-04-15","2022-04-19", "Agusta National",500, 2700000);
        Tournament theOpen = new Tournament("The Open", "2023-07-15","2023-07-19", "St Georges",100, 1600000);
        Tournament CAOpen = new Tournament("Canadian Open", "2022-06-20","2022-06-25", "St. Andrews",100, 2000000);

        Member[] array = {m1, m2, m4};
        Tournament[] tourneys = {Masters,theOpen, CAOpen};

        m1.enterTournament(Masters);
        m2.enterTournament(Masters);
        m3.enterTournament(Masters);
        m1.enterTournament(theOpen);
        System.out.println(m1.enterTournament(CAOpen));

        ArrayList<Tournament> upcoming = new ArrayList<Tournament>();
        ArrayList<Tournament> past = new ArrayList<Tournament>();
        ArrayList<Tournament> current = new ArrayList<Tournament>();


        for (Member member : array) {
            System.out.println(member.toString());
        }
        for (Tournament tournament : tourneys){
//            System.out.println(tournament.toString());
            if(tournament.getEndDate().isBefore(LocalDate.now())){
                past.add(tournament);
            } else if (tournament.getStartDate().isAfter(LocalDate.now())) {
                upcoming.add(tournament);
            } else if (tournament.getStartDate().isBefore(LocalDate.now()) && tournament.getEndDate().isAfter(LocalDate.now())) {
                current.add(tournament);
            }
        }

        for (Tournament tournament : upcoming){
            System.out.println(tournament.toString());
        }
        for (Tournament tournament : current){
            System.out.println(tournament.toString());
        }
        for (Tournament tournament : past){
            System.out.println(tournament.toString());
        }

        Masters.getStandings();
        theOpen.getStandings();

        m1.getTourneys();
        m2.getTourneys();
        m3.getTourneys();

    }
    //enter tournament...

    //input 1: member name
    //input 2: Member info, membership info, tournament info

    /*
    to add:

    Add Members and Tournaments
    Call to and From JSON
    User Inputs
    call and print member string
     */
}
