package com.keyin.member;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberServices extends MemberDatabase {

    public static void main(String[] args) {


        int option;
        {
            System.out.println("Option Menu");
            System.out.println("1. Add new member\n 2. View Account\n " +
                    "3. Update Account\n 4. Delete Account\n 5. View Tournaments\n");
            System.out.println();
            System.out.println("Insert your option:");
            Scanner input = new Scanner(System.in);
            option = input.nextInt();
            input.close();

            if (option == 1) {
                System.out.println("You've chosen to create a new member");
            } else if (option == 2) {
                System.out.println("You've chosen to view an account");
                System.out.println();
                System.out.println("Please enter Membership ID");
                System.out.println();
                // Non-Static to static data
                MemberDatabase memberInstance = new MemberDatabase();
                memberInstance.allMembers();
                ArrayList<Member> members = memberInstance.getMembers();
                Member findMember = members.get(0);
                findMember.toString();
                System.out.println(findMember);

//                for (Member m : members) {
//                    System.out.format("First Name: " + m.getMemberFirstName() + " , " + "Last Name: " + m.getMemberLastName() + "\n" +
//                            "Address: " + m.getMemberAddress() + " , " + "Email: " + m.getEmail() + " , " + "Phone Number: " + m.getPhoneNumber() + "\n");
//                    System.out.println("Membership Duration: " + m.getDuration() + "\n\n");
   //         }
            } else if (option == 3) {
                System.out.println("You've chosen to update an existing account");
            } else if (option == 4) {
                System.out.println("You've chosen to delete an account");
            } else if (option == 5) {
                System.out.println("You have chosen to view Tournaments");
                System.out.println();
                TournamentsDatabase tournamentsInstance = new TournamentsDatabase();
                tournamentsInstance.allTournaments();
                ArrayList<Tournaments> tournaments = tournamentsInstance.getTournaments();
                for (Tournaments t : tournaments) {
                    System.out.format("Tournament Name: " + t.getTournamentName() + "\n" + "Location: " + t.getLocation() +
                            "\n" + "Entry Fee: $" + t.getEntryFee() + "\n" + "Start Date: " + t.getStartDate() + " - " + "End Date: " + t.getEndDate()
                            + "\n" + "Prize Payout : $" + t.getCashPrizeAmount() + "\n\n");
                }
            } else {
                System.out.println("Invalid Selection");
            }


        }
    }

}

    // Non-Static to static data
//                String answer;
//                MemberDatabase memberInstance = new MemberDatabase();
//                Scanner memberScan = new Scanner(System.in);
//                System.out.println(memberInstance.allMembers());
//                memberInstance.allMembers();
//                memberScan.close();




