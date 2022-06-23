package com.keyin.member.CRUD.MayDelete;

import java.io.File;
import java.io.IOException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keyin.member.Member;

public class DeserizlizeData {
    
    public static void main(String[] args) {
        
        String pathName = "/Users/michaeloreilly/Desktop/VSCode/SD4/SDAT/Sprint1/sprint1/src/main/java/com/keyin/member/data/memberData2.json";

        try {
        ObjectMapper mapper = new ObjectMapper();

        String memberJson = "{\"name\":\"Sherlock Holmes\",\"address\":\"221B Baker Street\",\"email\":\"s.holems@mysterysolvers.com\",\"phone\":4207777}";

        Member member = mapper.readValue(new File(pathName), Member.class);
        System.out.println();
        System.out.println(member.getName());
        System.out.println(member.getAddress());
        System.out.println(member.getEmail());
        System.out.println(member.getPhone());
        System.out.println();

        System.out.println(" ");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
