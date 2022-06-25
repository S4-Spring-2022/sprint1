package com.keyin;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import com.keyin.member.Tournament;

public class TournamentTest {

    @Test
    public void testSetStartDate() {
        Tournament tournament = new Tournament();
        tournament.setStartDate("2022-07-11T12:00:00");
        System.out.println(tournament.getStartDate());
        assertEquals(LocalDateTime.parse("2022-07-11T12:00:00"), tournament.getStartDate());
    }

}
