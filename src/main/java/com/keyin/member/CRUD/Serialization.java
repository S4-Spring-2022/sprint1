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
            Member member = new Member("Sherlock Holmes","221B Baker Street","s.holmes@mysterysolvers.com",4207777, "Normal");
            // member.setName("Sherlock Holmes");
            // member.setAddress("221B Baker Street");
            // member.setEmail("s.holmes@mysterysolvers.com");
            // member.setPhone(4207777);

            Member member2 = new Member("Sherlock Holmes2","221B Baker Street","s.holmes@mysterysolvers.com",4207777, "Normal");
            // member2.setName("John Watson");
            // member2.setAddress("221B Baker Street");
            // member2.setEmail("j.watson@mysterysolvers.com");
            // member2.setPhone(4208888);

            Member member3 = new Member("Sherlock Holmes3","221B Baker Street","s.holmes@mysterysolvers.com",4207777, "Normal");
            // member3.setName("Inspector Lestrade");
            // member3.setAddress("221B Baker Street");
            // member3.setEmail("mycroftholmes@mysterysolvers.com");
            // member3.setPhone(4209999);

            MembersArray membersArray = new MembersArray();
            membersArray.addMember(member);
            membersArray.addMember(member2);
            membersArray.addMember(member3);

            mapper.writeValue( new File(pathName), membersArray );

            System.out.println(membersArray);

            

        } catch (IOException e) {
            e.printStackTrace();
       }
    }
}