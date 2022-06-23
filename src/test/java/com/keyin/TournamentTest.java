package com.keyin;

import Tournament.Tournament;
import Tournament.TournamentArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@ExtendWith(MockitoExtension.class)
public class TournamentTest {

    @InjectMocks
    private TournamentArray arrayUnderTest;
    //    Mock Tournament Data
    Tournament t1 = new Tournament("2021-06-01", "2021-06-05", "St. John's", 100.00, 5000.00,
            new ArrayList<String>(Arrays.asList("Jon Dunne", "Nick Dobbin", "Shane Dwyer", "Jamie Cornick")),
            new ArrayList<String>(Arrays.asList("Jamie Cornick", "Nick Dobbin", "Jon Dunne", "Shane Dwyer"))
    );
    Tournament t2 = new Tournament("2022-06-01", "2022-06-05", "Mount Pearl", 100.00, 10000.00,
            new ArrayList<String>(Arrays.asList("Jamie Cornick", "Jon Dunne", "Nick Dobbin", "Shane Dwyer")),
            new ArrayList<String>(Arrays.asList("Jon Dunne", "Nick Dobbin", "Shane Dwyer", "Jamie Cornick"))
    );


    // Test TournamentArray
    @Test
    public void testTournamentArray() {
        arrayUnderTest.insertTournament(t2);
        List<Tournament> tournamentList = arrayUnderTest.selectAllTournaments();
        Assertions.assertFalse(tournamentList.isEmpty());
    }


    //    testing select by start date
    @Test
    public void testSelectTournamentByStartDate() {
        arrayUnderTest.insertTournament(t1);
        arrayUnderTest.insertTournament(t2);
        Optional<Tournament> tournament1 = arrayUnderTest.selectTournamentByStartDate("2021-06-01");
        Optional<Tournament> tournament2 = arrayUnderTest.selectTournamentByStartDate("2022-06-01");
        Assertions.assertEquals("St. John's", tournament1.get().getLocation());
        Assertions.assertEquals("Mount Pearl", tournament2.get().getLocation());
    }


    // testing select by end date
    @Test
    public void testSelectTournamentByEndDate() {
        arrayUnderTest.insertTournament(t2);
        arrayUnderTest.insertTournament(t1);

        Optional<Tournament> tournament1 = arrayUnderTest.selectTournamentByEndDate("2021-06-05");
        Optional<Tournament> tournament2 = arrayUnderTest.selectTournamentByEndDate("2022-06-05");

        Assertions.assertEquals("St. John's", tournament1.get().getLocation());
        Assertions.assertEquals("Mount Pearl", tournament2.get().getLocation());
    }


    //    testing select by location
    @Test
    public void testSelectTournamentByLocation() {
        arrayUnderTest.insertTournament(t1);
        arrayUnderTest.insertTournament(t2);

        Optional<Tournament> tournament1 = arrayUnderTest.selectTournamentByLocation("St. John's");
        Optional<Tournament> tournament2 = arrayUnderTest.selectTournamentByLocation("Mount Pearl");

        Assertions.assertEquals("2021-06-01", tournament1.get().getStartDate());
        Assertions.assertEquals("2022-06-01", tournament2.get().getStartDate());
    }


    //testing getters
    @Test
    public void testTournamentGetMethods() {
        Assertions.assertEquals("2021-06-01", t1.getStartDate());
        Assertions.assertEquals("2022-06-01", t2.getStartDate());
        Assertions.assertEquals("2021-06-05", t1.getEndDate());
        Assertions.assertEquals("2022-06-05", t2.getEndDate());
        Assertions.assertEquals("St. John's", t1.getLocation());
        Assertions.assertEquals(100.00, t1.getEntryFee());
        Assertions.assertEquals(5000.00, t1.getCashPrizeAmount());
        Assertions.assertEquals(10000.00, t2.getCashPrizeAmount());
        Assertions.assertEquals("Jon Dunne", t1.getParticipatingMembers().get(0));
        Assertions.assertEquals("Shane Dwyer", t2.getParticipatingMembers().get(3));
        Assertions.assertEquals("Nick Dobbin", t1.getFinalStandings().get(1));
    }


}
