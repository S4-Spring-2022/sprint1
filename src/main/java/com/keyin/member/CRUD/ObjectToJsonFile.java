package com.keyin.member.CRUD;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.keyin.member.Member;

// import org.kodejava.jackson.support.Artist;

import java.io.File;
import java.io.IOException;

public class ObjectToJsonFile {
    public static void main(String[] args) {

        // String memberDataFolder = "./src/main/java/com/keyin/member/data/";
        String memberDataFolder = "/Users/michaeloreilly/Desktop/VSCode/SD4/SDAT/Sprint1/sprint1/src/main/java/com/keyin/member/data/";


        Member member = new Member();
        member.setName("Sherlock Holmes");
        member.setAddress("221B Baker Street");
        member.setEmail("s.holmes@mysterysolvers.com");
        member.setPhone(4207777);

        ObjectMapper mapper = new ObjectMapper();

        File file = new File(memberDataFolder + "memberData3.json");
        try {
            // Serialize Java object info JSON file.
            mapper.writeValue(file, member);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            // Deserialize JSON file into Java object.
            Member newMember = mapper.readValue(file, Member.class);
            System.out.println("=== New member added sussfully ===");
            System.out.println();
            System.out.println("Name: " + newMember.getName());
            System.out.println("Address: " + newMember.getAddress());
            System.out.println("Email: " + newMember.getEmail());
            System.out.println("Phone: " + newMember.getPhone());
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

