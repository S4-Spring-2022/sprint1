package com.keyin.member.CRUD;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.keyin.member.MembersArray;

public class JsonParsingJackson {
    
    public static void main(String[] args) {
        
        ObjectMapper mapper = new ObjectMapper();

        try {
            MembersArray membersObj = mapper.readValue(new File("/Users/michaeloreilly/Desktop/VSCode/SD4/SDAT/Sprint1/sprint1/src/main/java/com/keyin/member/data/memberData2.json"), MembersArray.class);
            System.out.println();
            System.out.println("Members;");
            System.out.println();
            for ( MembersArray members : membersObj.getMembers() ) {
                System.out.println(members.getName());
                System.out.println(members.getAddress());
                System.out.println(members.getEmail());
                System.out.println(members.getPhone());
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
