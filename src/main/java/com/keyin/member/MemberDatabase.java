package com.keyin.member;

import java.util.ArrayList;
import java.util.List;

public class MemberDatabase extends Member{

    public List<MembershipType> getMembershipTypes() {
        ArrayList<MembershipType> membershipTypes = new ArrayList<>();
        return membershipTypes;
    }
}

//        MembershipType normal = new MembershipType();
//        normal.setId(1);
//        normal.setMonthlyCost(61.75);
//        normal.add(normal);
//
//        MembershipType trial = new MembershipType();
//        membershipTypeOf.setId(2);
//        membershipTypeOf.setMonthlyCost(70);
//        membershipTypeOf.add(trial);
//
//        MembershipType specialOffer = new MembershipType();
//        membershipTypeOf.setId(3);
//        membershipTypeOf.setMonthlyCost(52.75);
//        membershipTypeOf.add(specialOffer);
//
//        MembershipType familyPlan = new MembershipType();
//        membershipTypeOf.setId(4);
//        membershipTypeOf.setMonthlyCost(52.75);
//        membershipTypeOf.addMember1("");
//        membershipTypeOf.add(familyPlan);
//
//
//
//        return membershipType;
//    }

//    public static void main(String[] args) {
//        System.out.println("Print Arraylist using for loop");
//        for(int i=0; i < MembershipType.length(); i++){
//            System.out.println( MembershipType.get(i) );
//    }




