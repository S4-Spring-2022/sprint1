package com.keyin.member.CRUD;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.keyin.member.MembersArray;

public class ReadDataJackson {
    
    public static void main(String[] args) {
        
        String memberDataFolder = "sprint1/src/main/java/com/keyin/member/data/memberData2.json";
        ObjectMapper mapper = new ObjectMapper();

        try {
            MembersArray membersObj = mapper.readValue(new File( memberDataFolder ), MembersArray.class);
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
