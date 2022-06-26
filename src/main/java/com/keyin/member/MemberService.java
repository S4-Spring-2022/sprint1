package com.keyin.member;

import org.mockito.internal.configuration.CaptorAnnotationProcessor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;


public class MemberService {

    public static void main(String[] args){
        //mock members
        Member m8 = new Member("James Thomas", "1 Stroke Street", "JTJ@pga.com", "12223324448", "2022-06-25");
        Member m1 = new Member("Scottie Scheffler", "1232 Birdie Blvd.", "theace1@hotmail.com", "12223334455", "2022-06-25", "trial");
        Member m2 = new Member("Sam Burns", "70 Eagle Avenue", "sideBurns77@msn.live.ca", "12223334375", "2022-06-25");
        Member m3 = new Member("Rory Mcilroy", "02302 Albatros Avenue", "TheIrishGolfer@gmail.com", "12223334455", "2022-06-25", "special");
        Member m4 = new Member("Justin Thomas", "1 Stroke Street", "JT1@pga.com", "12223330055", "2022-06-25", "family", m8);
        Member m5 = new Member("Hideki Matsuyama", "55 Chip Crescent", "HideNoMore@sympatico.jp", "12323336655", "2022-06-25", "Student");
        Member m6 = new Member("Cameron Smith", "99 Putting Pl.", "strayaNum1@gmail.aus", "12223337004", "2022-06-25", "early");
        Member m7 = new Member("Bryson Dechambeau", "4 BogieFree Blvd.", "BAD@thePGA.com", "12223357703", "2022-06-25");

        //mock tournaments
        Tournament t1 = new Tournament("The Masters", "2022-04-07", "2022-04-10", "Agusta National", 250, 2700000);
        Tournament t2 = new Tournament("The Open", "2022-06-20", "2022-07-01", "St. Andrews Links", 200, 2100000);
        Tournament t3 = new Tournament("The Canadian Open", "2022-09-01", "2022-09-04", "St. Georges", 100, 1500000);


        Member[] members = {m1, m2, m3, m4, m5, m6, m7, m8};
        Tournament[] tournaments = {t1, t2, t3};


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

        choice = in.nextInt();
        in.nextLine();

        //Menu loops -- mocked for just one member
        while (choice != EXIT2) {

            if (choice == options2[0]) {
                //System.out.println(Arrays.toString(members));
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
                        System.out.println(nameInput.getTourneysCurrent());
                        System.out.println(nameInput.getTourneysPast());
                        System.out.println(nameInput.getTourneysUpcoming());
                    }

                    //Display menu
                    displayMenu(options, menuItems);

                    //Get choice from user
                    choice = in.nextInt();
                    in.nextLine();
                }
                choice = EXIT2;


            } else if (choice == options2[1]) {
                System.out.println("\nEnter Tournament Name ('exit' to end program): ");
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
        System.out.println("\n");
        System.out.println("\033[1m The Golf Club Data System \033[0m");
        System.out.println("\033[1m -------------------------\033[0m\n");

        //Loop through opts and items
        for (int i =0; i < opts.length -1; i++){
            System.out.printf("%d. %s\n", opts[i], items[i]);
        }

        //Print the Exit option
        System.out.printf("%d. %s\n", opts[opts.length -1], items[items.length -1]);
        System.out.println("\033[1m \n-------------------------\033[0m");
//            System.out.println();
        System.out.println("\033[1m \n\tEnter Selection:  \033[0m ");
    }

    /*
    to add:

    Add Members and Tournaments
    Call to and From JSON
    User Inputs
    call and print member string
     */
}
