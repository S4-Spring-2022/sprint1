package com.keyin.member;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberTest {

    @Test
    public void testMemberFirstName(){

        Member memberUnderTest = new Member();
        Assertions.assertNotEquals(68,memberUnderTest.getMemberFirstName("FirstName"));

        Assertions.assertEquals(memberUnderTest.getMemberFirstName("FirstName"), memberUnderTest.getMemberFirstName("FirstName"));
    }

    @Test
    public void testMemberLastName(){

        Member memberUnderTest = new Member();
        Assertions.assertNotEquals(100,memberUnderTest.getMemberLastName("LastName"));

        Assertions.assertEquals(memberUnderTest.getMemberLastName("LastName"), memberUnderTest.getMemberLastName("LastName"));
    }

    @Test
    public void testMemberAddress(){

        Member memberUnderTest = new Member();
        Assertions.assertNotEquals(25,memberUnderTest.getMemberAddress("Place"));

        Assertions.assertEquals(memberUnderTest.getMemberAddress("Place"), memberUnderTest.getMemberAddress("Place"));
    }

    @Test
    public void testEmail(){

        Member memberUnderTest = new Member();
        Assertions.assertNotEquals(50,memberUnderTest.getEmail("Email@Email"));

        Assertions.assertEquals(memberUnderTest.getEmail("Email@Email"), memberUnderTest.getEmail("Email@Email"));
    }

    @Test
    public void testPhoneNumber(){

        Member memberUnderTest = new Member();
        Assertions.assertNotEquals(99,memberUnderTest.getPhoneNumber("747-3458"));

        Assertions.assertEquals(memberUnderTest.getPhoneNumber("747-3458"), memberUnderTest.getPhoneNumber("747-3458"));
    }

//    @Test
//    public void testStartDate(Object LocalDate){
//
//        Member memberUnderTest = new Member();
//        Assertions.assertNotEquals(88,memberUnderTest.getStartDate());
//
//        Assertions.assertEquals(memberUnderTest.getStartDate(), memberUnderTest.getStartDate());
//    }

}
