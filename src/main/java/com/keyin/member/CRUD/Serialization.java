package com.keyin.member.CRUD;
// writing the file

import java.io.File;
import java.io.IOException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keyin.member.Member;
import com.keyin.member.MembersArray;

public class Serialization {
    
    public static void main(String[] args) throws IOException {
        
        String pathName = "sprint1/src/main/java/com/keyin/member/data/memberData.json";
        ObjectMapper mapper = new ObjectMapper();
        
        try {
            Member member = new Member();
            Member member2 = new Member();
            Member member3= new Member();

               member.setName("Sherlock Holmes");
               member.setAddress("221B Baker Street");
               member.setEmail("s.holmes@mysterysolvers.com");
               member.setPhone(4207777);

               member2.setName("John H. Watson");
               member2.setAddress("221B Baker Street");
               member2.setEmail("j.watson@mysterysolvers.com");
               member2.setPhone(4208888);

               member3.setName("Mycroft Holmes");
               member3.setAddress("221B Baker Street");
               member3.setEmail("mycroftholmes@mysterysolvers.com");
               member3.setPhone(4209999);

            MembersArray members = new MembersArray();
            members.add(member);
            members.add(member2);
            members.add(member3);
            

            members.addMember(member);
            members.addMember(member2);
            members.addMember(member3);

            String memberInfo = mapper.writeValueAsString(members);
            // String memberInfo2 = mapper.writeValueAsString(member2);
            // String memberInfo3 = mapper.writeValueAsString(member3);
            
            mapper.writeValue( new File(pathName), member );
            mapper.writeValue( new File(pathName), member2 );
            mapper.writeValue( new File(pathName), member3 );

            System.out.println();
            System.out.println("Serialized member to JSON file");
            System.out.println(memberInfo);
            System.out.println(memberInfo2);
            System.out.println(memberInfo3);
            System.out.println();
            

        } catch (IOException e) {
            e.printStackTrace();
       }
    }
}