package com.keyin.member;
// Team -1 Barry_David_Gerald
import java.time.LocalDate;
import java.time.Month;


class Demo {
    public static void main(String[] args) {

    Member newMember = new Member("Barry", "101 new way", "barry@barry", "709-550-1102", LocalDate.of(2020, Month.JUNE, 21));

        System.out.println("Member Name: "+ newMember.getMemberName() );
        System.out.println("Member Address: "+ newMember.getMemberAddress() );
        System.out.println("Member Email: "+ newMember.getEmail());
        System.out.println("Member Phone: "+ newMember.getPhoneNumber());
        System.out.println("Member Start Date: "+ newMember.getStartDate());
        newMember.getDuration();

    }

}



