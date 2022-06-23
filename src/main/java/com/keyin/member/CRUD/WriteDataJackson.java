package com.keyin.member.CRUD;

import java.io.IOException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keyin.member.Member;

public class WriteDataJackson {
    
    public static void main(String[] args) {
        
        String pathName = "/Users/michaeloreilly/Desktop/VSCode/SD4/SDAT/Sprint1/sprint1/src/main/java/com/keyin/member/data/memberData.json";
        
        try {
        ObjectMapper mapper = new ObjectMapper();
        
        Member member = new Member();
            member.setName("Sherlock Holmes");
            member.setAddress("221B Baker Street");
            member.setEmail("s.holmes@mysterysolvers.com");
            member.setPhone(4207777);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}