package com.keyin.member;

import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors
import java.util.Scanner;

public class CreateFile {

  public static void main(String[] args) {

    String memberFile = "/Users/michaeloreilly/Desktop/VSCode/SD4/SDAT/Sprint1/sprint1/src/main/java/com/keyin/member/";

    try {
        // user input for the file name
        System.out.println("Enter the name of the file: ");
        String fileName = new Scanner(System.in).nextLine();

      File myObj = new File(memberFile + fileName + ".json");
      if (myObj.createNewFile()) {
        System.out.println("File created: " + myObj.getName());
      } else {
        System.out.println("File already exists.");
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}

// /Users/michaeloreilly/Desktop/VSCode/SD4/SDAT/Sprint1/sprint1/src/main/java/com/keyin/member
