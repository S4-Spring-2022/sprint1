package com.keyin.member;

import java.util.Scanner;

public class MemberServices {



    public static void main(String[] args) {
        String option;
        {

            System.out.println("Option Menu");
            System.out.println("1. Add new member\n");
            System.out.println("2. View Account\n");
            System.out.println("3. Update Account\n");
            System.out.println("4. Delete Account\n");
            System.out.println();
            System.out.println("Insert your option:");
            Scanner input = new Scanner(System.in);
            option = input.nextLine();
            input.close();

            switch (option)
            {


                case "1":
                    System.out.println("Add new member" );
                    System.out.println("Name: ");
                    System.out.println("Address: ");
                    System.out.println("Email: ");
                    System.out.println("Phone: ");
                    System.out.println("Start Date: ");
                    break;

                case "2":
                        System.out.println("View Account");
                        System.out.println("Enter Membership Id: ");
                    break;

                case "3":
                    System.out.println("Update Account ");
                    System.out.println("Enter Account Number: " );
                    break;
                default:
                    System.out.println("Invalid Option ");
                    break;


            }
        }
    }
    }




