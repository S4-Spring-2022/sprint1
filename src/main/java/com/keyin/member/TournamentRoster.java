package com.keyin.member;

import java.util.List;
import java.util.ArrayList;

public class TournamentRoster {

    private List<Member> membersRegistered;

    public TournamentRoster() {
        this.membersRegistered = new ArrayList<Member>();
    }

    public void addMember(Member member) {
        this.membersRegistered.add(member);
    }

    public void removeMember(Member member) {
        this.membersRegistered.remove(member);
    }

    public List<Member> getMembersRegistered() {
        return this.membersRegistered;
    }

    public void setMembersRegistered(List<Member> membersRegistered) {
        this.membersRegistered = membersRegistered;
    }

    public int getNumberOfMembers() {
        return this.membersRegistered.size();
    }
    
}
