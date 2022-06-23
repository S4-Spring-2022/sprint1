package com.keyin;

import com.keyin.member.Member;
import com.keyin.member.MembersList;
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
public class MemberTest {

    @Mock
    private Member memberUnderTest = Mockito.mock(Member.class);

    @Test
    public void testGetNames(){
        Member memberUnderTest = new Member();
        memberUnderTest.setName("Obi-Wan Kenobi");
        assertEquals("Obi-Wan Kenobi", memberUnderTest.getName());

    }

    @Test
    public void testGetAddress(){
        Member memberUnderTest = new Member();
        memberUnderTest.setAddress("Tatooine");
        assertEquals("Tatooine", memberUnderTest.getAddress());

    }

    @Test
    public void testGetEmail(){
        Member memberUnderTest = new Member();
        memberUnderTest.setEmail("Hello_There!@gmail.com");
        assertEquals("Hello_There!@gmail.com",memberUnderTest.getEmail());
    }

    @Test
    public void TestGetPhoneNumber(){
        Member memberUnderTest = new Member();
        memberUnderTest.setPhoneNumber("666-0003");
        assertEquals("666-0003",memberUnderTest.getPhoneNumber());

    }

//    @Test
//    public void TestGetStartDate(){
//        Member memberUnderTest = new Member();
//    //come back to this later, not sure how to assert date times
//    }

    @Test
    public void TestGetType(){
        Member memberUnderTest = new Member();
        memberUnderTest.setTypeOfMembership("Trial");
        assertEquals("Trial",memberUnderTest.getType());


    }



    @Mock
    private Tournament tournamentUnderTest = Mockito.mock(Tournament.class);

    @Test
    public void testGetCurrentTournaments(){
        Tournament tournamentUnderTest = new Member;
        memberUnderTest.setCurrentTournaments("Tournament 3");
        assertEquals("Tournament 3",memberUnderTest.getCurrentTournaments());
    }

    @Test
    public void testGetUpcomingTournaments(){
         memberUnderTest = new Member();
        memberUnderTest.setPastTournaments("Tournament 1");
        assertEquals("Tournament 1",memberUnderTest.getUpcomingTournaments());
    }


    @Test
    public void testGetUpcomingTournaments(){
        memberUnderTest = new Member();
        memberUnderTest.setUpcomingTournaments("Tournament 2");
        assertEquals("Tournament 2",memberUnderTest.getPastTournaments());
    }

}
