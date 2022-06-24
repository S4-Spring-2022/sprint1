package com.keyin.member.CRUD;
// reading the file
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.keyin.member.MembersArray;

public class Deserialization {
    
    public static void main(String[] args) {
        
        String pathName = "sprint1/src/main/java/com/keyin/member/data/memberData.json";
        ObjectMapper mapper = new ObjectMapper();

        try {
        //   System.out.println(mapper.readValue(new File(pathName), MembresArray.class));
          File myObj = new File(pathName);
          Scanner myReader = new Scanner(myObj);
          myReader.close();
          
          
          
          
          
          
            // List<Member> membersObj = mapper.readValue(new File( pathName ), MembersArray.class);
            // System.out.println(membersObj);
            // System.out.println("Members;");
            // System.out.println();


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
