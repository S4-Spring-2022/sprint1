package com.keyin;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.keyin.member.Member;

@ExtendWith(MockitoExtension.class)
public class MemberTest {

    @Mock
    private Member member1 = Mockito.mock(Member.class);


    @Test
    public void testMember() {
        Member member = new Member();
        // will need to be updated with the number of members
 
        assertEquals(5, Member.memberCount);
    }

    @Test
    public void testMemberName() {
        Member member = new Member();
        member.setName("John");
        assertEquals("John", member.getName());
    }

    @Test
    public void testMemberAddress() {
        Member member = new Member();
        member.setAddress("123 Main St");
        assertEquals("123 Main St", member.getAddress());
    }

    @Test
    public void testMemberEmail() {
        Member member = new Member();
        member.setEmail("anemail@email.com");
        assertEquals("anemail@email.com", member.getEmail());
    }

    @Test
    public void testMemberPhone() {
        Member member = new Member();
        member.setPhone(1234567890);
        assertEquals(1234567890, member.getPhone());
    }

}

