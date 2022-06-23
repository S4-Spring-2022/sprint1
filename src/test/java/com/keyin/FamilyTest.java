package com.keyin;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.keyin.member.Member;
import com.keyin.member.Family;

@ExtendWith(MockitoExtension.class)
public class FamilyTest {

    @Mock
    private Member memberDad = Mockito.mock(Member.class);

    @Mock
    private Member memberMom = Mockito.mock(Member.class);

    @Mock
    private Member memberSon = Mockito.mock(Member.class);

    @Mock
    private Member memberGrandDaughter = Mockito.mock(Member.class);

    Family familyUnderTest = new Family();

    @Test
    public void testFamilyAddMember() {
        familyUnderTest.addMember(memberDad);
        familyUnderTest.addMember(memberMom);
        familyUnderTest.addMember(memberSon);
        familyUnderTest.addMember(memberGrandDaughter);
        assertEquals(4, familyUnderTest.getMembers().size());
    }

    // this method does not exist yet, but it should
    @Test
    public void testFamilyRemoveMember() {
        familyUnderTest.addMember(memberDad);
        familyUnderTest.addMember(memberMom);
        familyUnderTest.addMember(memberSon);
        familyUnderTest.addMember(memberGrandDaughter);
        familyUnderTest.removeMember(memberDad);
        assertEquals(3, familyUnderTest.getMembers().size());
    }

    @Test
    public void testFamilyName() {
        familyUnderTest.setName("Keyin");
        assertEquals("Keyin", familyUnderTest.getName());
    }

    @Test
    public void testFamilyGetMembers() {
        familyUnderTest.addMember(memberDad);
        familyUnderTest.addMember(memberMom);
        familyUnderTest.addMember(memberSon);
        familyUnderTest.addMember(memberGrandDaughter);
        System.out.println(familyUnderTest.getMembers());

        assertEquals(4, familyUnderTest.getMembers().size());
    }

}
