package com.keyin;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.keyin.member.Membership;


@ExtendWith(MockitoExtension.class)
public class MembershipTest {

    @Mock
    private Membership membership1 = Mockito.mock(Membership.class);

    @Test
    public void testMembership() {
        Membership membership = new Membership();
        assertNotNull(membership);
    }

    @Test
    public void testMembershipDefaultType() {
        Membership membership = new Membership();
        membership.setType("Normal");
        assertEquals("Normal", membership.getType());
    }

    @Test
    public void testTypeConstructor() {
        Membership membership = new Membership("Normal");
        System.out.println(membership);
        assertEquals("Normal", membership.getType());
    }

    @Test
    public void testMembershipDuration() {
        Membership membershipTest = new Membership();
        // the duration of this test is set to a default value of 30 days inside the method in the class, not ideal, refactor later
        assertEquals("30", membershipTest.getDuration());
    }

    @Test
    public void testMembershipDurationConstructor() {
        Membership membership = new Membership("Normal");
        assertNotNull(membership.getDuration());
    }

    @Test
    public void testFamilyMembership() {
        Membership membership = new Membership("Family Plan");
        assertEquals("Family Plan", membership.getType());
    }

}
