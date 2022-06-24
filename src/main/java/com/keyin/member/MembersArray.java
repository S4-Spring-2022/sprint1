package com.keyin.member;

import java.util.ArrayList;
import java.util.List;

public class MembersArray {

    private List<Member> members;

    public MembersArray() {
        this.members = new ArrayList();
    }

    public MembersArray(List<Member> members) {
        this.members = members;
    }

    public List<Member> getMembers() {
        return members;
    }

    // public void setMembers(List<Member> members) {
    //     this.members = members;
    // }

    public void addMember(Member member) {
        this.members.add(member);
    }
}
    
     











    // private MembersArray[] members;

    // public MembersArray() {
    //     members = new MembersArray[10];
    // }

    // public MembersArray[] getMembers() {
    //     return members;
    // }

    // public void setMembers(MembersArray[] members) {
    //     this.members = members;
    // }

    // public void addMember(Member member) {
    //     this.members[0] = member;
    // }

