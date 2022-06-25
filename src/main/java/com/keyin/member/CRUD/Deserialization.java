package com.keyin.member.CRUD;
// reading the file
import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.keyin.member.MembersArray;

//*** Not fully factored into the program ***
// Able to read simple objects as JSON and convert them into useful java objects
// However the project required the ability to read complex, aggregated objects, which has created a stall at this point in development

public class Deserialization {
    
    public static void main(String[] args) {
        
        String pathName = "src/main/java/com/keyin/member/data/memberData.json";
        ObjectMapper mapper = new ObjectMapper();

        try {
            MembersArray membersObj = new MembersArray();
            membersObj = mapper.readValue(new File( pathName ), MembersArray.class);
            System.out.println(membersObj);
            System.out.println("Members;");
            System.out.println();

            // the following loop prints the simple members
            // for ( MembersArray members : membersObj.getMembers() ) {
            //     System.out.println(members.getName());
            //     System.out.println(members.getAddress());
            //     System.out.println(members.getEmail());
            //     System.out.println(members.getPhone());
            //     System.out.println();
            // }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
