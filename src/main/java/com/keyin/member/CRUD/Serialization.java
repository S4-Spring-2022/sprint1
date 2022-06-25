package com.keyin.member.CRUD;
// writing the file

import java.io.File;
import java.io.IOException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keyin.member.Member;
import com.keyin.member.MembersArray;

//*** Not fully factored into the program ***
// Able to write simple objects as JSON from useful java objects
// However the project required the ability to write complex, aggregated objects, which has created a stall at this point in development

public class Serialization {
    
    public static void main(String[] args) throws IOException {
         
        String pathName = "src/main/java/com/keyin/member/data/memberData2.json";
        ObjectMapper mapper = new ObjectMapper();
    
        try {
            Member member = new Member("Sherlock Holmes","221B Baker Street","s.holmes@mysterysolvers.com",4207777, "Normal");

            Member member2 = new Member("Sherlock Holmes2","221B Baker Street","s.holmes@mysterysolvers.com",4207777, "Normal");

            Member member3 = new Member("Sherlock Holmes3","221B Baker Street","s.holmes@mysterysolvers.com",4207777, "Normal");

            MembersArray membersArray = new MembersArray();
            membersArray.addMember(member);
            membersArray.addMember(member2);
            membersArray.addMember(member3);

            mapper.writeValue( new File(pathName), membersArray );

        } catch (IOException e) {
            e.printStackTrace();
       }
    }
}