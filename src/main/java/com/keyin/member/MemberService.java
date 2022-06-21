package com.keyin.member;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MemberService implements MemberDal {

    private static List<Member> DB = new ArrayList();

    public MemberService() {
    }

    public int insertMember(Member member) {
        DB.add(new Member(member.getMemberName(), member.getMemberAddress(), member.getMemberEmail(), member.getMemberPhone(), member.getMembershipStartDate(), member.getMembershipDuration(), member.getMembershipType(), member.getMembershipFamilyMembers(), member.getCurrentTournaments(), member.getPastTournaments(), member.getUpcomingTournaments()));
        return 1;
    }

    public List<Member> selectAllMembers() {
        return DB;
    }

    public Optional<Member> selectMemberByName(String memberName) {
        return DB.stream().filter((member) -> {
            return member.getMemberName().equals(memberName);
        }).findFirst();
    }

    public Optional<Member> selectMemberByEmail(String memberEmail) {
        return DB.stream().filter((member) -> {
            return member.getMemberEmail().equals(memberEmail);
        }).findFirst();
    }

    public Optional<Member> selectMemberByPhone(String memberPhone) {
        return DB.stream().filter((member) -> {
            return member.getMemberPhone().equals(memberPhone);
        }).findFirst();
    }
}