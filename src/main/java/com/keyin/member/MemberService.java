package com.keyin.member;

import java.util.Date;
import java.util.Scanner;

public class MemberService {

    // creating a cli 

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("Welcome to the Member Service!");
        System.out.println();
        System.out.println("To create a member enter 1,");
        System.out.println("To edit a member enter 2,");
        System.out.println("To delete a member enter 3,");
        System.out.println("To view all members enter 4,");
        System.out.println("To exit enter 0,");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You have chosen to create a member.");
                System.out.println("Enter a name: ");
                String name = scanner.next();
                System.out.println("Enter an address: ");
                String address = scanner.next();
                System.out.println("Enter an email: ");
                String email = scanner.next();
                System.out.println("Enter a phone number: ");
                int phone = scanner.nextInt();

                // this case is also incomplete
                // Member member = new Member(name, address, email, phone);
                break;
            default:
                System.out.println("You have chosen to exit.");
                break;
        }

        // close the scanner and call the method to save the new/edit member to the member file

    }

}
