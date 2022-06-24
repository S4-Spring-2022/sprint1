package com.keyin.member;

import org.mockito.internal.configuration.CaptorAnnotationProcessor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class MemberService {

    public static void main(String[] args){
        Member m1 = new Member("Bryson Dechambeau", "23 Random Avenue", "bdechambeau123@gmail.com", "(222)555-4474", "2022-06-22");
        Member m2 = new Member("Phil Mickelson", "24 New Street", "PM89@gmail.com", "(222)555-3213", "2022-06-22");
        Member m3 = new Member("Justin Thomas", "25 Birdie Crescent", "TheJT90@gmail.com", "(222)555-1112", "2022-06-22");
        m3.setMembership("2022-06-23", "student", m2);

        Tournament Masters = new Tournament("The Masters", "2022-04-15","2022-04-19", "Agusta National",500, 2700000);
        Tournament theOpen = new Tournament("The Open", "2023-07-15","2023-07-19", "St Georges",100, 1600000);
        Tournament CAOpen = new Tournament("Canadian Open", "2022-06-20","2022-06-25", "St. Andrews",100, 2000000);

        Member[] members = {m1, m2, m3};
        Tournament[] tournaments = {Masters, theOpen, CAOpen};

        m1.enterTournament(Masters);
        m1.enterTournament(theOpen);
        m1.enterTournament(CAOpen);

        // User choices
        int choice;
        String memberChoice = null;
        Member nameInput = null;

        //Menus data
        int[] options2 = {1, 2, 3};
        String[] menuItems2 = {"Members", "Tournaments", "Exit"};

        int[] options = {1, 2, 3, 4};
        String[] menuItems = {"Member Info", "Membership Info", "Tournament Info", "Exit"};

        //Exit option
        int EXIT = options[options.length -1];
        int EXIT2 = options2[options2.length - 1];

        //Display menu
        displayMenu(options2, menuItems2);

        //Setup Scanner
        Scanner in = new Scanner(System.in);

        //Get choices from user
//        memberChoice = "Bryson Dechambeau";


        choice = in.nextInt();
        in.nextLine();

        //Menu loops -- mocked for just one member
        while (choice != EXIT2) {
            if (choice == options2[0]) {
                System.out.println("Enter Member Name: ");
                memberChoice = in.nextLine();
                displayMenu(options, menuItems);
                for(Member member : members){
                    if(Objects.equals(member.getName(), memberChoice)){
                        nameInput = member;
                    }
                }
                while (choice != EXIT){
                    if(choice == options[0]){
                        assert nameInput != null;
                        System.out.println(nameInput.infoToString());
                    }
                    else if (choice == options[1]){
                        assert nameInput != null;
                        System.out.println(nameInput.membershipToString());
                    }
                    else if (choice == options[2]){
                        assert nameInput != null;
                        nameInput.getTourneysCurrent();
                        nameInput.getTourneysPast();
                        nameInput.getTourneysUpcoming();
                    } else if (choice == 4){
                        choice = EXIT2;
                        break;
                    }

                    //Display menu
                    displayMenu(options, menuItems);

                    //Get choice from user
                    choice = in.nextInt();
                    in.nextLine();
                }
            } else if (choice == options2[1]) {
                System.out.println("\nEnter Tournament: ('exit' to end program)");
                String tourNameInput = in.nextLine();
                for(Tournament tournament : tournaments){
                    if(Objects.equals(tournament.getName(), tourNameInput)){
                        System.out.println(tournament);
                    } else if(Objects.equals(tourNameInput, "exit")){
                        choice = EXIT2;
                    }

                }
            }
        }


//        System.out.println("Goodbye, call again!");


    }

    /*
    initial input
    Choose menu
    1. Members - options 1,2,3 Members, Tournaments, Exit
        Enter Member Name
            1.member info
            2.membership info
            3.tournament info
            4. exit
    2. Tournaments
        Enter Tournament name
        -prints all tournament information
    3. Exit
     */

    public static void displayMenu(int[] opts, String[] items){
        //Display menu
//            System.out.println();
        System.out.println("\nThe Golf Club Data System");
        System.out.println("------------------");

        //Loop through opts and items
        for (int i =0; i < opts.length -1; i++){
            System.out.printf("%d. %s\n", opts[i], items[i]);
        }

        //Print the Exit option
        System.out.printf("%d. %s\n", opts[opts.length -1], items[items.length -1]);
        System.out.println("------------------");
//            System.out.println();
        System.out.println("Enter choice: ");
    }

    /*
    to add:

    Add Members and Tournaments
    Call to and From JSON
    User Inputs
    call and print member string
     */
}
