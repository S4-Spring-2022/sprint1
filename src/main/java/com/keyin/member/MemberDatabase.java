package com.keyin.member;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberDatabase extends Member {

    public ArrayList<Member> members = new ArrayList<>();

    public void allMembers(){

       Member m1 = new Member("Dave", "Temple", "5 Thomas Gardens",
               "dave@dave.com", "709-555-7777", LocalDate.of(2021, 6, 20));
       members.add(m1);

       Member m2 = new Member("Gerald", "Bartlett", "100 Out-Of-The Way",
               "gerald@gerald.com", "709-555-4444", LocalDate.of(1999, 12, 31));
        members.add(m2);

       Member m3 = new Member("Barry", "Poole", "5 Magical Place",
               "barry@barry.com", "709-555-3333", LocalDate.of(2011, 6, 12));
        members.add(m3);

       Member m4 = new Member("Jamie", "Cornick", "1 George Street",
               "jamie@jamie.com", "709-555-2222", LocalDate.of(2013, 8, 18));
        members.add(m4);

       Member m5 = new Member("Peter", "Rawsthorne", "10 High Way",
               "peter@peter.com", "709-555-1111", LocalDate.of(1999, 12, 21));
        members.add(m5);
       Member m6 = new Member("Maurice", "Babin", "5 In-Da Way",
               "maurice@maurice.com", "709-555-8888", LocalDate.of(1999, 12, 11));

       Member m7 = new Member("Mike", "Tyson", "3 Staying-Out-Of Court",
               "mike@mike.com", "709-555-9999", LocalDate.of(1999, 12, 4));

       Member m8 = new Member("Patrick", "Roy", "6 Hockey de Street",
               "patrick@patrick.com", "709-555-5555", LocalDate.of(1999, 12, 6));

       Member m9 = new Member("Adam", "Sandler", "23 Basketball Court",
               "adam@adam.com", "709-555-6666", LocalDate.of(1999, 12, 5));

    }

    public void setMembers(ArrayList members){
        this.members = members;
    }
    public ArrayList getMembers(){
        return members;
    }

    }

