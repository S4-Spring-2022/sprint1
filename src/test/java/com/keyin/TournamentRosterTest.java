package com.keyin;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.keyin.member.Member;
import com.keyin.member.TournamentRoster;


@ExtendWith(MockitoExtension.class)
public class TournamentRosterTest {


    @Mock
    private Member member1 = Mockito.mock(Member.class); 

    @Mock
    private Member member2 = Mockito.mock(Member.class);

    @Mock
    private Member member3 = Mockito.mock(Member.class);

    @Test
    public void testAddMember() {
        TournamentRoster roster = new TournamentRoster();
        roster.addMember(member1);
        roster.addMember(member2);
        roster.addMember(member3);
        assertEquals(3, roster.getNumberOfMembers());
    }

    @Test
    public void testRemoveMember() {
        TournamentRoster roster = new TournamentRoster();
        roster.addMember(member1);
        roster.addMember(member2);
        roster.addMember(member3);
        roster.removeMember(member2);
        assertEquals(2, roster.getNumberOfMembers());
    }

    @Test
    public void testGetMembersRegistered() {
        TournamentRoster roster = new TournamentRoster();
        roster.addMember(member1);
        roster.addMember(member2);
        roster.addMember(member3);
        List<Member> members = roster.getMembersRegistered();
        assertEquals(3, members.size());
    }

    @Test
    public void testSetMembersRegistered() {
        TournamentRoster roster = new TournamentRoster();
        roster.addMember(member1);
        roster.addMember(member2);
        roster.addMember(member3);
        List<Member> members = roster.getMembersRegistered();
        roster.setMembersRegistered(members);
        assertEquals(3, roster.getNumberOfMembers());
    }

    @Test
    public void testGetNumberOfMembers() {
        TournamentRoster roster = new TournamentRoster();
        roster.addMember(member1);
        roster.addMember(member2);
        roster.addMember(member3);
        assertEquals(3, roster.getNumberOfMembers());
    }

    
}
