package com.keyin.member.CRUD.MayDelete;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keyin.member.Member;

// import org.kodejava.jackson.support.Artist;


import java.io.File;
import java.io.IOException;

public class ObjectToJsonFile {
    public static void main(String[] args) {

        // String memberDataFolder = "./src/main/java/com/keyin/member/data/";
        String memberDataFolder = "/Users/michaeloreilly/Desktop/VSCode/SD4/SDAT/Sprint1/sprint1/src/main/java/com/keyin/member/data/";
        // String file = "/Users/michaeloreilly/Desktop/VSCode/SD4/SDAT/Sprint1/sprint1/src/main/java/com/keyin/member/data/memberData3/";

        // hardcoded member data
        Member member = new Member(); // need to figure out how to include the member class
        // Member[] members = new Member[3];
        // members[0] = new Member("Normal");
        // members[1] = new Member("Normal");
        // members[2] = new Member("Normal");

        // // write to json file
        // for (int i = 0; i < members.length; i++) {
        //     String file = memberDataFolder + "memberData" + (i + 1) + "/";
        //     String fileName = file + "member" + (i + 1) + ".json";
        //     try {
        //         ObjectMapper mapper = new ObjectMapper();
        //         mapper.writeValue(new File(fileName), members[i]);
        //     } catch (IOException e) {
        //         e.printStackTrace();
        //     }
        // }

        // // read from json file
        // for (int i = 0; i < members.length; i++) {
        //     String file = memberDataFolder + "memberData" + (i + 1) + "/";
        //     String fileName = file + "member" + (i + 1) + ".json";
        //     try {
        //         ObjectMapper mapper = new ObjectMapper();
        //         Member member1 = mapper.readValue(new File(fileName), Member.class);
        //         System.out.println(member1.getName());
        //     } catch (IOException e) {
        //         e.printStackTrace();
        //     }
        // }



        member.setName("Sherlock Holmes");
        member.setAddress("221B Baker Street");
        member.setEmail("s.holmes@mysterysolvers.com");
        member.setPhone(4207777);

        ObjectMapper mapper = new ObjectMapper();

        File file = new File(memberDataFolder + "memberData2.json"); // is creating new file
        try {
            // Serialize Java object info JSON file.
            mapper.writeValue(file, member);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            // Deserialize JSON file into Java object.
            Member newMember = mapper.readValue(file, Member.class);
            System.out.println();
            System.out.println("=== Add New Member ( Successful ) ===");
            System.out.println();
            // System.out.println("Class: " + newMember.getClass());
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

