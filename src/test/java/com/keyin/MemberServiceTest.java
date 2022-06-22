package com.keyin;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.keyin.member.MemberServiceTest;

@ExtendWith(MockitoExtension.class)
public class MemberServiceTest {

    @Mock
    private Member member1 = Mockito.mock(Member.class);


    @Test
    public void testMember() {
        Member member = new Member();

        assertEquals(5, Member.memberCount);
    }

    @Test
    public void testMemberName() {
        Member member = new Member();
        member.setName("Billy");
        assertEquals("Billy", member.getName());
    }

    @Test
    public void testMemberAddress() {
        Member member = new Member();
        member.setAddress("123 My Street");
        assertEquals("123 My Street", member.getAddress());
    }

    @Test
    public void testMemberEmail() {
        Member member = new Member();
        member.setEmail("Billy@gmail.com");
        assertEquals("Billy@gmail.com", member.getEmail());
    }

    @Test
    public void testMemberPhone() {
        Member member = new Member();
        member.setPhone(7095551212);
        assertEquals(7095551212, member.getPhone());
    }

}

