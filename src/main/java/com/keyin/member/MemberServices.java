package com.keyin.member;

import java.util.*;

public class MemberServices extends MemberDatabase {


    public static void main(String[] args) {
        MemberDatabase memberInstance = new MemberDatabase();
        memberInstance.allMembers();
        ArrayList<Member> members = memberInstance.getMembers();
        for(Member m: members){
            System.out.format("First Name: " + m.getMemberFirstName() + " , "+ "First Name: " + m.getMemberFirstName()+
                    " , "+ "Address: " + m.getMemberAddress()+" , "+ "Email" + m.getEmail()+" , "+ "Phone Number: " +m.getPhoneNumber()
                    + " , "+"Length of Membership: " + m.getDuration()+" , "+ "\n\n");
        }


//






//        int member;
//        System.out.println("Enter user ID");
//        MemberDatabase memberInstance = new MemberDatabase();
//        memberInstance.getMembers()
//        Scanner viewScan = new Scanner(System.in);
//        member = viewScan.nextInt();
//        if (member == 1) {
//            memberInstance.allMembers();
//            System.out.println("Im here");
//            System.out.println(memberInstance.getMemberFirstName());
//            viewScan.close();
//        }

//        int option;
//        int member;
//        {
//
//            System.out.println("Option Menu");
//            System.out.println("1. Add new member\n 2. View Account\n " +
//                    "3. Update Account\n 4. Delete Account\n");
//            System.out.println();
//
//            System.out.println("Insert your option:");
//            Scanner input = new Scanner(System.in);
//            option = input.nextInt();
//            input.close();
//            if (option == 1){
//                System.out.println("You've chose to create a new member");
//            } else if (option == 2) {
//                System.out.println("Enter user ID");
//                MemberDatabase memberInstance = new MemberDatabase();;
//                Scanner viewScan = new Scanner(System.in);
//                member = viewScan.nextInt();
//                if (member == 1) {
//                    memberInstance.allMembers();
//                    System.out.println("Im here");
//                    viewScan.close();
//                }
//
//            } else if (option == 3) {
//                System.out.println("You've chose to update an existing account");
//            } else if (option == 4) {
//                System.out.println("You've chosen to delete an account");
//            }else {
//                System.out.println("Invalid Selection");
//            }
//
//
//
//
//
//        }
    }

}




