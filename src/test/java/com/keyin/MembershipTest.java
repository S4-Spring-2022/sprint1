package com.keyin;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.keyin.member.Membership;


@ExtendWith(MockitoExtension.class)
public class MembershipTest {

    @Mock
    private Membership membership1 = Mockito.mock(Membership.class);

    // test needs to be fixed or removed
    @Test
    public void testMembershipStartDate() {
        Membership membership = new Membership();
        // this test cannot have any other operations between instantiation and assertion
        // in fact changing to a LocalDateTime.now() broke this test as it is more specific down to the millisecond than the previous method
        assertEquals(LocalDateTime.now(), membership.getStartDate());
    }

    @Test
    public void testMembershipDefaultType() {
        Membership membership = new Membership();
        membership.setType("Normal");
        assertEquals("Normal", membership.getType());
    }

    @Test
    public void testMembershipType() {
        Membership membership = new Membership();
        membership.setType("Premium");
        assertNull(membership.getType());
        membership.setType("Normal");
        assertEquals("Normal", membership.getType());
    }

    @Test
    public void testMembershipDuration() {
        Membership membershipTest = new Membership();
        // the duration of this test is set to a default value of 30 days inside the method in the class, not ideal, refactor later
        assertEquals("30", membershipTest.getDuration());
    }


    
}
