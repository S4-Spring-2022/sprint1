package com.keyin;


import Tournament.Tournament;
import Tournament.TournamentArray;
import com.keyin.member.Member;
import com.keyin.member.MemberArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;
import java.util.ArrayList;
import java.util.Arrays;

public class MemberServiceTest {
    Member m1 = new Member("Nicholas Dobbin", "somewhereStreet Whitbourne", "dobbszerker@gmail.com", "7091231234", "2020-02-21",5, "family", new ArrayList(Arrays.asList("da missus")), new ArrayList(Arrays.asList("Golf 2022")), new ArrayList(Arrays.asList("Golf 2021")), new ArrayList(Arrays.asList("Golf 2023")));
    Tournament t1 = new Tournament("Golf 1test","2022-02-02", "2022-05-04", "NL St.johns", 50.00, 300.00, new ArrayList(Arrays.asList("Nicholas Dobbin", "Johnathon Dunne")), new ArrayList(Arrays.asList("Nicholas Dobbin", "Johnathon Dunne")));
    MemberArray memberArray = new MemberArray();
    TournamentArray tournamentArray = new TournamentArray();


    public void setTournamentArray(TournamentArray tournamentArray) {
        this.tournamentArray = tournamentArray;
        tournamentArray.insertTournament(t1);
    }

    public void setMemberArray(MemberArray memberArray) {
        this.memberArray = memberArray;
        memberArray.insertMember(m1);
    }


    @Test
    public void testGettersForMember(){
        Assertions.assertEquals("Nicholas Dobbin", m1.getMemberName());
        Assertions.assertEquals("somewhereStreet Whitbourne", m1.getMemberAddress());
        Assertions.assertEquals("dobbszerker@gmail.com", m1.getMemberEmail());
        Assertions.assertEquals("7091231234", m1.getMemberPhone());
        Assertions.assertEquals(5, m1.getMembershipDuration());
        Assertions.assertEquals("family", m1.getMembershipType());
        Assertions.assertEquals("da missus", m1.getMembershipFamilyMembers().get(0));
        Assertions.assertEquals("Golf 2022", m1.getCurrentTournaments().get(0));
        Assertions.assertEquals("Golf 2021", m1.getPastTournaments().get(0));
        Assertions.assertEquals("Golf 2023", m1.getUpcomingTournaments().get(0));

    }
@Test
    public void testMemberArray(){
        MemberArray memArray = new MemberArray();
        memArray.insertMember(m1);
        List<Member> memberList = memberArray.selectAllMembers();
        Assertions.assertFalse(memberList.isEmpty());
    }
@Test
    public void testMemberArraySelectByName() {
        MemberArray memArray = new MemberArray();
        memArray.insertMember(m1);
        Optional<Member> mem = memArray.selectMemberByName("Nicholas Dobbin");
        Assertions.assertEquals("Nicholas Dobbin", mem.get().getMemberName());
    }

}
