package com.keyin.member;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TournamentsTest {


    @Test
    public void testTournamentName(){

        Tournaments tournamentsUnderTest = new Tournaments();
        Assertions.assertNotEquals(68,tournamentsUnderTest.getTournamentName("Name"));

        Assertions.assertEquals(tournamentsUnderTest.getTournamentName("Name"), tournamentsUnderTest.getTournamentName("Name"));
    }

    @Test
    public void testLocation(){

        Tournaments tournamentsUnderTest = new Tournaments();
        Assertions.assertNotEquals(99,tournamentsUnderTest.getLocation("Place"));

        Assertions.assertEquals(tournamentsUnderTest.getLocation("Place"), tournamentsUnderTest.getLocation("Place"));
    }

    @Test
    public void testEntryFee(){

        Tournaments tournamentsUnderTest = new Tournaments();
        Assertions.assertNotEquals(68,tournamentsUnderTest.getEntryFee(1500.00));

        Assertions.assertEquals(0.0, tournamentsUnderTest.getEntryFee(0.0));
    }

    @Test
    public void testStartDate(){

        Tournaments tournamentsUnderTest = new Tournaments();
        Assertions.assertNotEquals(44,tournamentsUnderTest.getStartDate("Date"));

        Assertions.assertEquals(tournamentsUnderTest.getStartDate("Date"), tournamentsUnderTest.getStartDate("Date"));
    }

    @Test
    public void testEndDate(){

        Tournaments tournamentsUnderTest = new Tournaments();
        Assertions.assertNotEquals(17,tournamentsUnderTest.getEndDate("Date"));

        Assertions.assertEquals(tournamentsUnderTest.getEndDate("Date"), tournamentsUnderTest.getEndDate("Date"));
    }

    @Test
    public void testCashPrizeAmount(){

        Tournaments tournamentsUnderTest = new Tournaments();
        Assertions.assertNotEquals(2500.00,tournamentsUnderTest.getCashPrizeAmount(25000.00));

        Assertions.assertEquals(0.0, tournamentsUnderTest.getCashPrizeAmount(0.0));
    }
}
