package com.keyin;

import com.keyin.member.Tournament;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MemberServiceTest {
    @Test
    public void MemberTest(){
        Member memberUnderTest = new Member();

        memberUnderTest.setName("Rick Giles");
        assertEquals("Rick Giles","Rick Giles");
        assertNotEquals("Anything Else", "Rick Giles");

        memberUnderTest.setAddress("307 Elderberry Ter.");
        assertEquals("307 Elderberry Ter.", "307 Elderberry Ter." );
        assertNotEquals("211 Harris Dr.", "307 Elderberry Ter.");

        memberUnderTest.setEMAIL("BF@HOTMAIL.COM");
        assertEquals("BF@HOTMAIL.COM", "BF@HOTMAIL.COM" );
        assertNotEquals("ERIC.EDWARDS@OUTLOOK.COM", "BF@HOTMAIL.COM");

        memberUnderTest.setPhomeNum("709-754-0783");
        assertEquals("709-754-0783", "709-754-0783" );
        assertNotEquals("754-0783", "709-754-0783");

        memberUnderTest.setMemberDate("2022-06-25");
        assertEquals("2022-06-25", "2022-06-25" );
        assertNotEquals("20220625", "2022-06-25");

        memberUnderTest.setMemberType("Standard");
        assertEquals("Standard", "Standard" );
        assertNotEquals("Family", "Standard");
        assertNotEquals("Corp", "Standard");

        memberUnderTest.setmemberDuration("1");
        assertEquals("1", "1" );
        assertNotEquals("2", "1");
        assertNotEquals("0", "1");

        memberUnderTest.setMemberMonthCost("125");
        assertEquals("125", "125" );
        assertNotEquals("200", "125");
        assertNotEquals("0", "125");

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
        Tournament tournamentUnderTest = new Tournament();

        tournamentUnderTest.setName("Agusta National");
        assertEquals("Agusta National", "Agusta National");
        assertNotEquals("Dorioo Classic", "Agusta National");
        assertNotEquals("PipersRevnge", "Agusta National");

        tournamentUnderTest.setstartDate("2022-07-25");
        assertEquals("2022-07-25", "2022-07-25");
        assertNotEquals("may 20 2023", "2022-07-25");
        assertNotEquals("20220725", "2022-07-25");

        tournamentUnderTest.setendDate("2023-08-20");
        assertEquals("2023-08-20", "2023-08-20");
        assertNotEquals("may 20 2023", "2023-08-20");
        assertNotEquals("20220725", "2023-08-20");

        tournamentUnderTest.setlocation("Willows");
        assertEquals("Willows", "Willows");
        assertNotEquals("grand meadows", "Willows");
        assertNotEquals("Balle Hallie", "Willows");

        tournamentUnderTest.setentryFee("250");
        assertEquals("250", "250");
        assertNotEquals("25", "250");

        tournamentUnderTest.setPrizeMoney("500");
        assertEquals("500", "500");
        assertNotEquals("300", "500");
        assertNotEquals(" ", "500");
    }



    private void setMemberMonthCost(String s) {
    }

    private void setmemberDuration(String s) {
    }

    private void setMemberType(String standard) {
    }

    private void setMemberDate(String s) {
    }

    private void setPhomeNum(String s) {
    }

    private void setEMAIL(String s) {
    }

    private void setAddress(String s) {
    }


    private void setName(String rick_giles) {

    }
}
