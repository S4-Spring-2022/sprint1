package com.keyin.member.CRUD;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import com.keyin.member.Member;


public class WriteObjectToFile {
    
    public static void main(String[] args) {
        
        String memberDataFolder = "/Users/michaeloreilly/Desktop/VSCode/SD4/SDAT/Sprint1/sprint1/src/main/java/com/keyin/member/data/";
        Scanner input = new Scanner(System.in);
        Member newMember = new Member();

        System.out.println("You have chosen to create a member.");
        System.out.println("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Enter your address: ");
        String address = input.nextLine();
        System.out.println("Enter your email: ");
        String email = input.nextLine();
        System.out.println("Enter your phone number: ");
        String phone = input.nextLine();


        try {
            FileWriter myWriter = new FileWriter(memberDataFolder + "memberData2.json");
            myWriter.write(
              "{" + "\n" + "\t" + 
              "\"Member\"" + ": " + "[" + "\t" + "\n" + 
             "\t" + "{" + "\n"+ 
             "\t" + "\t" + "\"Name\"" + ": " + "\"" + name + "\"" + "," + "\n" + 
             "\t" + "\t" + "\"Address\"" + ": " + "\"" + address + "\"" + "," + "\n" + "\t" + 
             "\t" + "\"Email\"" + ": " + "\"" + email + "\"" + "," + "\n" + "\t" + 
             "\t" + "\"Phone\"" + ": " + "\"" + phone + "\"" +
             "\n" + "\t" + "}" + 
             "\t" + "\n" + "]" + 
              "\n" + "}");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
    }
}
