package com.keyin.member;

import lombok.EqualsAndHashCode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Objects;
import java.util.function.BooleanSupplier;

import static java.util.Arrays.asList;


class MemberDatabaseTest {
    private Object ArrayList;

    @Test
    public void testMemberLastName() {

        Member memberUnderTest = new Member();
        Assertions.assertNotEquals("Hello", memberUnderTest.getMemberLastName("Peter"));
        Assertions.assertEquals(memberUnderTest.getMemberLastName("Peter"), memberUnderTest.getMemberLastName("Peter"));
    }

    @Test
    public void testMemberFirstName() {

        Member memberUnderTest = new Member();
        Assertions.assertNotEquals("Rawsthorne", memberUnderTest.getMemberLastName("Peter"));
        Assertions.assertEquals(memberUnderTest.getMemberLastName("Peter"), memberUnderTest.getMemberLastName("Peter"));
    }

//    @Test
//
//    public void testMembersMatch() {
//
//       Member ArrayListMatch = new ArrayList<String>(MemberArrayList );
//        Assertions.assertTrue((BooleanSupplier) ArrayListMatch);
//
//    }
}



