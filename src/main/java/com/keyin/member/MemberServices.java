package com.keyin.member;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberServices extends MemberDatabase {


    public static void main(String[] args) {
        int option;
        {
            System.out.println("Option Menu");
            System.out.println("1. Add new member\n 2. View Account\n " +
                    "3. Update Account\n 4. Delete Account\n");
            System.out.println();
            System.out.println("Insert your option:");
            Scanner input = new Scanner(System.in);
            option = input.nextInt();
            input.close();

            if (option == 1){
                System.out.println("You've chose to create a new member");
            } else if (option == 2) {
                System.out.println("You've chosen to view an account");
                System.out.println();
                System.out.println("Please enter Last Name");
                // Non-Static to static data
                String answer;
                MemberDatabase memberInstance = new MemberDatabase();
                Scanner memberScan = new Scanner(System.in);
                System.out.println(memberInstance.allMembers());
                memberInstance.allMembers();
                memberScan.close();
            } else if (option == 3) {
                System.out.println("You've chose to update an existing account");
            } else if (option == 4) {
                System.out.println("You've chosen to delete an account");
            }else {
                System.out.println("Invalid Selection");
            }
        }
    }
    }

                // Non-Static to static data
                String answer;
                MemberDatabase memberInstance = new MemberDatabase();
                Scanner memberScan = new Scanner(System.in);
                System.out.println(memberInstance.allMembers());
                memberInstance.allMembers();
                memberScan.close();



