package com.keyin.member.CRUD.MayDelete;

import java.io.File;
import java.io.IOException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keyin.member.Member;

public class SerizlizeData {
    
    public static void main(String[] args) {
        
        String pathName = "/Users/michaeloreilly/Desktop/VSCode/SD4/SDAT/Sprint1/sprint1/src/main/java/com/keyin/member/data/memberData.json";

        try {
        ObjectMapper mapper = new ObjectMapper();

        Member member = new Member();
            member.setName("Sherlock Holmes");
            member.setAddress("221B Baker Street");
            member.setEmail("s.holems@mysterysolvers.com");
            member.setPhone(4207777);
        

        mapper.writeValue( new File(pathName), member );
        System.out.println("Serialized member to JSON file");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
