package com.keyin.member;

import java.util.Scanner;

public class MemberServices {


    public static void main(String[] args) {
        String option;
        {

            System.out.println("Option Menu");
            System.out.println("1. Add new member\n 2. View Account\n " +
                    "3. Update Account\n 4. Delete Account\n");
            System.out.println();

            Scanner input = new Scanner(System.in);
            System.out.println("Insert your option:");
            option = input.nextLine();
            input.close();

            String userOption;
            switch (option) {

                case "1":
                    userOption = "You would like to add a new member";
                case "2":
                    userOption = "You would like to view account";

                case "3":
                    userOption = "You would like to update account";

                default:
                    userOption = "You would like to Delete an account";
                    break;


            }
            System.out.println(userOption);
        }
    }
    }




