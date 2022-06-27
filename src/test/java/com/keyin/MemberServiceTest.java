package com.keyin;

import com.keyin.member.Member;
import com.keyin.member.Tournament;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class MemberServiceTest {
    @Test
    public void MemberTest(){
        Member m1 = new Member("Scottie Scheffler", "1232 Birdie Blvd.", "theace1@hotmail.com", "12223334455", "2022-06-25", "standard");
        Member m2 = new Member("Bryson Dechambeau", "43 Eagle Street", "BombsOnly@hotmail.com", "12223312055", "2022-06-25", "early");

        //mock tournaments
        Tournament t1 = new Tournament("The Masters", "2022-04-07", "2022-04-10", "Agusta National", 250, 2700000);
        Tournament t2 = new Tournament("The Open", "2022-06-20", "2022-07-01", "St. Andrews Links", 200, 2100000);
        Tournament t3 = new Tournament("The Canadian Open", "2022-09-01", "2022-09-04", "St. Georges", 100, 1500000);


        Member[] members = {m1, m2};
        Tournament[] tournaments = {t1, t2, t3};


        for(Tournament tournament : tournaments){
            for(Member member : members){
                member.enterTournament(tournament);
            }
        }

        m1.setName("Rick Giles");
        assertEquals("Rick Giles",m1.getName());
        assertNotEquals(m2.getName(), m1.getName());

        m1.setAddress("307 Elderberry Ter.");
        assertEquals("307 Elderberry Ter.", m1.getAddress() );
        assertNotEquals("211 Harris Dr.", m1.getAddress());

        m1.setEmail("BF@HOTMAIL.COM");
        assertEquals("BF@HOTMAIL.COM", m1.getEmail() );
        assertNotEquals("ERIC.EDWARDS@OUTLOOK.COM", m1.getEmail());

        m1.setPhone("709-754-0783");
        assertEquals("709-754-0783", m1.getPhone());
        assertNotEquals("754-0783", m1.getPhone());

        m2.setMembership("2022-06-25", "student");
        assertNotEquals("trial", m2.getMemberType());
        assertNotEquals("early", m2.getMemberType());
        assertNotNull(m1.membershipToString());

        assertNull(m2.getFMember());
        m1.setMembership("2022-06-26", "family", m2);
        assertEquals(m1, m2.getFMember());

        assertNotNull(m2.getTourneysUpcoming());
        assertNotNull(m1.getTourneysPast());
        assertEquals("\n--- Current Tournaments ---\n[The Open]",  m1.getTourneysCurrent());



    }
    //Tournament t1 = new Tournament("The Masters", "2022-04-07", "2022-04-10", "Agusta National", 250, 2700000);

//    private String name;
//    private LocalDate startDate;
//    private LocalDate endDate;
//    private String location;
//    private int entryFee;
//    private int prizeAmount;

    @Test
    public void TournamentTest() {
        Tournament t1 = new Tournament("The Masters", "2022-04-07", "2022-04-10", "Agusta National", 250, 2700000);

        Member m1 = new Member("Scottie Scheffler", "1232 Birdie Blvd.", "theace1@hotmail.com", "12223334455", "2022-06-25", "standard");
        Member m2 = new Member("Bryson Dechambeau", "43 Eagle Street", "BombsOnly@hotmail.com", "12223312055", "2022-06-25", "early");

        m1.enterTournament(t1);
        m2.enterTournament(t1);


        assertEquals("The Masters", t1.getName());
        assertNotEquals("The Open", t1.getName());

        assertEquals(LocalDate.parse("2022-04-07"), t1.getStartDate());
        assertNotNull(t1.getStartDate());

        assertEquals(LocalDate.parse("2022-04-10"), t1.getEndDate());
        assertNotNull(t1.getEndDate());

        assertEquals("Agusta National", t1.getLocation());
        assertNotEquals("grand meadows", t1.getLocation());

        assertEquals(250, t1.getFee());
        assertNotNull( t1.getFee());

        assertEquals(2700000, t1.getPrizeAmount());
        assertNotEquals(2.700000, t1.getPrizeAmount());

        assertNotNull(t1.getMembers());

        assertTrue(t1.getStandings());


    }

}
