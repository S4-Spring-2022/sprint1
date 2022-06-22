package com.keyin.member;

import java.util.List;
import java.util.Optional;

public interface MemberDal {
        default int insertMember(Member member){ return insertMember(member); }

        List<Member> selectAllMembers ();

        Optional<Member> selectMemberByName (String memberName);

        Optional<Member> selectMemberByEmail (String memberEmail);

        Optional<Member> selectMemberByPhone (String memberPhone);
    }


