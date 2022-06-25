package com.keyin.member;//package com.keyin.member;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class MemberServices extends MemberDatabase {
    public static void main(String[] args) throws IOException {
        int option;
        {
            System.out.println("Option Menu");
            System.out.println("1. Add new member\n 2. View Account\n " +
                    "3. Update Account\n 4. Delete Account\n 5. View Tournaments\n ");
            System.out.println();
            System.out.println("Insert your option:");
            Scanner input = new Scanner(System.in);
            option = input.nextInt();
            if (option == 1) {
                System.out.println("You've chose to create a new member");
            } else if (option == 2) {
                System.out.println("You've chosen to view an account");
                System.out.println();
                MemberDatabase memberInstance = new MemberDatabase();
                memberInstance.allMembers();
                ArrayList<Member> members = memberInstance.getMembers();
                System.out.println("Please enter Members Id (m1-m9)");
                System.out.println();
                Member findMember = members.get(0);
                findMember.toString();
                System.out.println(findMember);

                // Non-Static to static data
                input.close();
                String answer;
                memberInstance = new MemberDatabase();
                Scanner memberScan = new Scanner(System.in);
                System.out.println(memberInstance.allMembers());
                memberInstance.allMembers();
                memberScan.close();

            } else if (option == 3) {
                System.out.println("You've chose to update an existing account");
            } else if (option == 4) {
                System.out.println("You've chosen to delete an account");
            } else if (option == 5) {
                System.out.println("You've chosen to View Tournaments");
                TournamentsDatabase tournamentsInstance = new TournamentsDatabase();
                tournamentsInstance.allTournaments();
                ArrayList<Tournaments> tournaments = tournamentsInstance.getTournaments();
                if (tournaments.size() <= 8) {
                    Tournaments findTournaments = tournaments.get(7);
                    findTournaments.toString();
                    System.out.println(findTournaments);
                } else {
                    System.out.println("exceeds selection");
                }
            } else {
            System.out.println("Invalid Selection");
        }
     }
    }

}





