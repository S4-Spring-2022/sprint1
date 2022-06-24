package com.keyin;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// not currently using mocking. remember to cut if we don't bring it back to this test suite 
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.keyin.member.Member;

@ExtendWith(MockitoExtension.class)
public class MemberTest {

    // not currently using mocking. remember to cut if we don't bring it back to this test suite 
    @Mock
    private Member member1 = Mockito.mock(Member.class);


    @Test 
    public void testMember() {
        Member member = new Member();
        // this test must be updated to reflect the number of members created in the test suite
        // it will also fail if run alone when the expected value is set to match the number of tests
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

    @Test
    public void testMemberFullConstructor() {
        Member member = new Member("John", "123 Main St", "anemail.email.com", 1234567890, "Normal");
        System.out.println(member.toString());
        assertEquals("John", member.getName());
        assertEquals("123 Main St", member.getAddress());
        assertEquals("anemail.email.com", member.getEmail());
        assertEquals(1234567890, member.getPhone());
    }
   
}
