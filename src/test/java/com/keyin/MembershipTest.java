package com.keyin;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

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
        // this test cannot have any other operations between instantiation and assertion
        assertEquals(new Date(), membership.getStartDate());
    }

    @Test
    public void testMembershipType() {
        Membership membership = new Membership();
        membership.setType("Normal");
        assertEquals("Normal", membership.getType());
    }

    @Test
    public void testMembershipStartDate() {
        // we need to determine how to set a start date in the past
        //Mockito.when(membership1.getStartDate()).thenReturn(new Date());
        // we need to write the function that will determine the duration of the membership
        Mockito.when(membership1.getDuration()).thenReturn("30");

        assertEquals("30", membership1.getDuration());


    
    }
    
}
