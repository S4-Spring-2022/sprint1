package com.keyin.member;

public class MembersArray extends Member {


    private MembersArray[] members;

    public MembersArray() {
        members = new MembersArray[10];
    }

    public MembersArray[] getMembers() {
        return members;
    }

    public void setMembers(MembersArray[] members) {
        this.members = members;
    }

    
    
}
