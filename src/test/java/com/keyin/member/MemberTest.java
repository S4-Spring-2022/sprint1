package com.keyin.member;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberTest {

    @Test
    public void testMemberFirstName(){

        Member memberUnderTest = new Member();
        Assertions.assertNotEquals(68,memberUnderTest.getMemberFirstName("Barry"));

        Assertions.assertEquals(memberUnderTest.getMemberFirstName("Barry"), memberUnderTest.getMemberFirstName("Barry"));
    }

    @Test
    public void testMemberLastName(){

        Member memberUnderTest = new Member();
        Assertions.assertNotEquals(100,memberUnderTest.getMemberLastName("Peter"));

        Assertions.assertEquals(memberUnderTest.getMemberLastName("Peter"), memberUnderTest.getMemberLastName("Peter"));
    }

    @Test
    public void testMemberAddress(){

        Member memberUnderTest = new Member();
        Assertions.assertNotEquals(25,memberUnderTest.getMemberAddress());

        Assertions.assertEquals(memberUnderTest.getMemberAddress(), memberUnderTest.getMemberAddress());
    }

    @Test
    public void testEmail(){

        Member memberUnderTest = new Member();
        Assertions.assertNotEquals(50,memberUnderTest.getEmail());

        Assertions.assertEquals(memberUnderTest.getEmail(), memberUnderTest.getEmail());
    }

    @Test
    public void testPhoneNumber(){

        Member memberUnderTest = new Member();
        Assertions.assertNotEquals(99,memberUnderTest.getPhoneNumber());

        Assertions.assertEquals(memberUnderTest.getPhoneNumber(), memberUnderTest.getPhoneNumber());
    }



}
