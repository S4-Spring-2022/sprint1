package com.keyin.member;

import java.util.List;
import java.util.ArrayList;

public class Family {

    private String familyName;
    private List<Member> familyMembers;

    public Family() {
        this.familyName = "";
        this.familyMembers = new ArrayList<Member>();
    }

    public Family(String name) {
        this.familyName = name;
        this.familyMembers = new ArrayList<Member>();
    }

    public Family(String name, Member member) {
        this.familyName = name;
        this.familyMembers = new ArrayList<Member>();
        this.familyMembers.add(member);
    }

    public void addMember(Member member) {
        this.familyMembers.add(member);
    }

    public void removeMember(Member member) {
        this.familyMembers.remove(member);
    }

    public String getName() {
        return this.familyName;
    }

    public List<Member> getMembers() {
        return this.familyMembers;
    }

    public void setMembers(List<Member> members) {
        this.familyMembers = members;
    }

    public void setName(String name) {
        this.familyName = name;
    }

    public String toString() {
        return "Family members: " + getMembers(); 
    }

}
