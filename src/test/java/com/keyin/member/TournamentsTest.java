package com.keyin.member;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TournamentsTest {


    @Test
    public void testTournamentName(){

        Tournaments tournamentsUnderTest = new Tournaments();
        Assertions.assertNotEquals(68,tournamentsUnderTest.getTournamentName());

        Assertions.assertEquals(tournamentsUnderTest.getTournamentName(), tournamentsUnderTest.getTournamentName());
    }

    @Test
    public void testLocation(){

        Tournaments tournamentsUnderTest = new Tournaments();
        Assertions.assertNotEquals(99,tournamentsUnderTest.getLocation());

        Assertions.assertEquals(tournamentsUnderTest.getLocation(), tournamentsUnderTest.getLocation());
    }

    @Test
    public void testEntryFee(){

        Tournaments tournamentsUnderTest = new Tournaments();
        Assertions.assertNotEquals(68,tournamentsUnderTest.getEntryFee());

        Assertions.assertEquals(0.0, tournamentsUnderTest.getEntryFee());
    }

    @Test
    public void testStartDate(){

        Tournaments tournamentsUnderTest = new Tournaments();
        Assertions.assertNotEquals(44,tournamentsUnderTest.getStartDate());

        Assertions.assertEquals(tournamentsUnderTest.getStartDate(), tournamentsUnderTest.getStartDate());
    }

    @Test
    public void testEndDate(){

        Tournaments tournamentsUnderTest = new Tournaments();
        Assertions.assertNotEquals(17,tournamentsUnderTest.getEndDate());

        Assertions.assertEquals(tournamentsUnderTest.getEndDate(), tournamentsUnderTest.getEndDate());
    }

    @Test
    public void testCashPrizeAmount(){

        Tournaments tournamentsUnderTest = new Tournaments();
        Assertions.assertNotEquals(2500.00,tournamentsUnderTest.getCashPrizeAmount());

        Assertions.assertEquals(0.0, tournamentsUnderTest.getCashPrizeAmount());
    }
}
