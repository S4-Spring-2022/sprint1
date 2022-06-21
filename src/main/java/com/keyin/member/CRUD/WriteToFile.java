package com.keyin.member.CRUD;

import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors

public class WriteToFile {
  public static void main(String[] args) {

    String memberDataFolder = "/Users/michaeloreilly/Desktop/VSCode/SD4/SDAT/Sprint1/sprint1/src/main/java/com/keyin/member/data/";

    try {
      FileWriter myWriter = new FileWriter(memberDataFolder + "memberData2.json");
      myWriter.write("// Member { name: Mike, age: 30,}");
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}
