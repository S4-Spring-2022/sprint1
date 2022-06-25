package com.keyin.member;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberService {

    public static void main(String[] args) {

        // Sample data instantiation

        ArrayList<Member> members = new ArrayList<Member>();

        members.add(new Member("Ashley", "123 Main St", "ash@gmail.com", 5551234, "Normal"));
        members.add(new Member("Joe", "456 Main St", "joe@gmail.com", 5557890, "Other"));
        members.add(new Member("Jane", "789 Main St", "jane@gmail.com", 5554321, "Trial"));

        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("Welcome to the Member Service!");
        System.out.println();
        System.out.println("To create a new member, enter 1");
        System.out.println("To edit a member, enter 2(not implemented)");
        System.out.println("To delete a member, enter 3(not implemented)");
        System.out.println("To view all members, enter 4");
        System.out.println("To exit, enter 0");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You have chosen to create a new member!");

                System.out.println("Please enter your name: ");
                String name = scanner.next();

                System.out.println("Enter your address: ");
                String address = scanner.next();

                System.out.println("Enter your email: ");
                String email = scanner.next();

                System.out.println("Enter your phone number: ");
                int phone = scanner.nextInt();

                System.out.println("Enter your membership type: ");
                String type = scanner.next();

                Member newMember = new Member(name, address, email, phone, type);
                System.out.println("Member created!" + "\n" + newMember + "\n");

                members.add(newMember);
                System.out.println("Member added to list!");
                System.out.println(members);
                break;
            case 2:
                // *** very much a stretch goal ***
                System.out.println("You have chosen to edit a member!");
                System.out.println("Not implemented yet!");
                break;

            case 3:
                /// *** very much a stretch goal ***
                System.out.println("You have chosen to delete a member!");
                System.out.println("Not implemented yet!");
                break;

            case 4:
                System.out.println("You have chosen to view all members!");

                Scanner scanner2 = new Scanner(System.in);

                System.out.println("To view all members, enter 1");
                System.out.println("To view all members by membership type, enter 2(not implemented)");
                System.out.println("To view all members by status, enter 3(not implemented)");
                System.out.println("To view a specific member, enter 4");
                int choice2 = scanner2.nextInt();

                switch (choice2) {
                    case 1:
                        System.out.println("You have chosen to view all members!");

                        for (Member member : members) {
                            System.out.println(member);
                        }

                        break;

                    case 2:
                        System.out.println("You have chosen to view all members by membership type!");
                        System.out.println("Not implemented yet!");
                        break;

                    case 3:
                        System.out.println("You have chosen to view all members by status!");
                        System.out.println("Not implemented yet!");
                        break;

                    case 4:
                        System.out.println("You have chosen to view a specific member!");
                        System.out.println("Enter member name: ");
                        String memberName = scanner2.next();

                        switch (memberName) {
                            case "Ashley":
                                System.out.println(members.get(0));
                                break;
                            case "Joe":
                                System.out.println(members.get(1));
                                break;
                            case "Jane":
                                System.out.println(members.get(2));
                                break;
                        }

                }
                break;

            default:
                System.out.println("You have chosen to exit.");
                break;
        }

    }

}
