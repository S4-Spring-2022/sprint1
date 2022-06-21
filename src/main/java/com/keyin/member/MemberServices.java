package com.keyin.member;

import java.util.Scanner;

public class MemberServices {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(" Choose Service 1 = Add new member, 2 = View account, 3 = update account ");
        String memberName = input.nextLine();

        // closes the scanner
        input.close();


      int type = 2;
        String membershipTypeString;
        switch (type) {
            case 1:  membershipTypeString = "Create new Account";
                Scanner input2 = new Scanner(System.in);

                System.out.println(" Enter Member name ");
                String newMemberName = input.nextLine();

                System.out.println(" Member Address ");
                String memberAddress = input.nextLine();

                // closes the scanner
                input.close();
                System.out.println("Member Name is: " + memberName );  // Output user input
                System.out.println("Address: " + memberAddress);  // Out
                break;
            case 2:  membershipTypeString = "View Account";
                Scanner input3 = new Scanner(System.in);

                System.out.println("Enter Member Id ");
                String newMemberId = input.nextLine();
                String memberId = null;
                System.out.println("Member Name Id: " + memberId );  // Output user input
              
                // closes the scanner
                input.close();
                break;
            case 3:  membershipTypeString = "Update Account";

                break;

            default: membershipTypeString = "Invalid Membership Type";
                break;
        }
        System.out.println(membershipTypeString);
    }
}
