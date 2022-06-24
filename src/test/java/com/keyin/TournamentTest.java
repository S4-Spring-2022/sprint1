package com.keyin;


import com.keyin.member.Member;
import com.keyin.member.Tournament;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)

public class TournamentTest {


    @Mock
    private Tournament TournamentUnderTest = Mockito.mock(Tournament.class);

    @Test
    public void testGetStartDate(){
        Tournament TournamentUnderTest = new Tournament();
        TournamentUnderTest.setStartDate("01/01/2019");
        assertEquals("01/01/2019", TournamentUnderTest.getStartDate());

    }

    @Test
    public void testGetEndDate(){
        Tournament TournamentUnderTest = new Tournament();
        TournamentUnderTest.setEndDate("02/01/2019");
        assertEquals("02/01/2019", TournamentUnderTest.getEndDate());

    }

    @Test
    public void testGetLocation(){
        Tournament TournamentUnderTest = new Tournament();
        TournamentUnderTest.setLocation("123 Main St");
        assertEquals("123 Main St", TournamentUnderTest.getLocation());
    }


    @Test
    public void TestGetEntryFee(){
        Tournament TournamentUnderTest = new Tournament();
        TournamentUnderTest.setEntryFee("$100");
        assertEquals("$100",TournamentUnderTest.getEntryFee());

    }

    @Test
    public void TestGetCashPrize(){
        Tournament TournamentUnderTest = new Tournament();
        TournamentUnderTest.setCashPrize("$1000");
        assertEquals("$1000",TournamentUnderTest.getCashPrize());


    }

    @Test
    public void TestPartMembers(){
        Tournament TournamentUnderTest = new Tournament();
        TournamentUnderTest.setPartMembers("John, Fran, Jimmy");
        assertEquals("John, Fran, Jimmy",TournamentUnderTest.getPartMembers());


    }

    @Test
    public void TestGetFinalStandings() {
        Tournament TournamentUnderTest = new Tournament();
        TournamentUnderTest.setFinalStandings("John");
        assertEquals("John", TournamentUnderTest.getFinalStandings());
    }

}
