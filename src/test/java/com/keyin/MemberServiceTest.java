package com.keyin;


import Tournament.Tournament;
import Tournament.TournamentArray;
import com.keyin.member.Member;
import com.keyin.member.MemberArray;

import java.util.ArrayList;
import java.util.Arrays;

public class MemberServiceTest {
    Member m1 = new Member("Nicholas Dobbin", "somewhereStreet Whitbourne", "dobbszerker@gmail.com", "7091231234", "2020-02-21",5, "family", new ArrayList(Arrays.asList("Nicholas Dobbin", "da missus")), new ArrayList(Arrays.asList("Golf 2022")), new ArrayList(Arrays.asList("Golf 2021")), new ArrayList(Arrays.asList("Golf 2023")));
    Tournament t1 = new Tournament("2022-02-02", "2022-05-04", "NL St.johns", 50.00, 300.00, new ArrayList(Arrays.asList("Nicholas Dobbin", "Johnathon Dunne")), new ArrayList(Arrays.asList("Nicholas Dobbin", "Johnathon Dunne")));
    MemberArray memberArray = new MemberArray();
    TournamentArray tournamentArray = new TournamentArray();


    public void setTournamentArray(TournamentArray tournamentArray) {
        this.tournamentArray = tournamentArray;
        tournamentArray.insertTournament(t1);

    }

    public void setMemberArray(MemberArray memberArray) {
        this.memberArray = memberArray;
        memberArray.insertMember(m1);
    }
}
