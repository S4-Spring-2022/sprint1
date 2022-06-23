package com.keyin.member.CRUD;
// writing the file

import java.io.File;
import java.io.IOException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keyin.member.Member;

public class Serialization {
    
    public static void main(String[] args) throws IOException {
         
        String pathName = "sprint1/src/main/java/com/keyin/member/data/memberData.json";
        
        ObjectMapper mapper = new ObjectMapper();
        
        try {
            Member member = new Member();

               member.setName("Sherlock Holmes");
               member.setAddress("221B Baker Street");
               member.setEmail("s.holmes@mysterysolvers.com");
               member.setPhone(4207777);

            String memberInfo = mapper.writeValueAsString(member);
            
            mapper.writeValue( new File(pathName), member );

            System.out.println();
            System.out.println("Serialized member to JSON file");
            System.out.println(memberInfo);
            System.out.println();
            

        } catch (IOException e) {
            e.printStackTrace();
       }
    }
}