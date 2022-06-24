package com.keyin;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDateTime;

import com.keyin.member.Tournament;
import com.keyin.member.TournamentRoster;
import com.keyin.member.Member;

@ExtendWith(MockitoExtension.class)
public class TournamentTest {

    @Mock
    private TournamentRoster players = Mockito.mock(TournamentRoster.class);
    private Member member1 = Mockito.mock(Member.class);
    private Member member2 = Mockito.mock(Member.class);
    private Member member3 = Mockito.mock(Member.class);

    @Test
    public void testSetStartDate() {
        Tournament tournament = new Tournament();
        tournament.setStartDate("2022-07-11T12:00:00");
        System.out.println(tournament.getStartDate());
        assertEquals(LocalDateTime.parse("2022-07-11T12:00:00"), tournament.getStartDate());
    }
    // startFormatNeedsToBe = "2020-01-01T00:00:00"

    @Test
    public void testWinners() {
        // not sure now to mock these relations correctly
        // Mockito.when(players.getNumberOfMembers()).thenReturn(3);

        Tournament tournament = new Tournament();
        players.addMember(member1);
        players.addMember(member2);
        players.addMember(member3);

        tournament.setWinners(member1, member2, member3);
        System.out.println("message test");
        System.out.println(tournament);

    }

}
