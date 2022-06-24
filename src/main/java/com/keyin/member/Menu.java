package com.keyin.member;

import java.util.Scanner;

public class Menu{

    public static void displayMenu(int[] opts, String items[]){
        //Display menu
//            System.out.println();
        System.out.println("\033[1m The Golf Club Data System \033[0m");
        System.out.println("\033[1m -------------------------\033[0m\n");

        //Loop through opts and items
        for (int i =0; i < opts.length -1; i++){
            System.out.printf("%d. %s\n", opts[i], items[i]);
        }

        //Print the Exit option
        System.out.printf("%d. %s\n", opts[opts.length -1], items[items.length -1]);
        System.out.println("\033[1m -------------------------\033[0m\n");
//            System.out.println();
        System.out.println("\033[1m          Enter choice: \033[0m");

    }

    public static void main(String[] args) {
        // User choice
        int choice;

        //Menu data
        int[] options = {1, 2, 3, 4};
        String[] menuItems = {"Member Info", "Membership Info", "Tournament Info", "Exit"};

        //Exit option
        int EXIT = options[options.length -1];

        //Display menu
        displayMenu(options, menuItems);

        //Setup Scanner
        Scanner in = new Scanner(System.in);

        //Get choice from user
        choice = in.nextInt();

        //Menu loop
        while (choice != EXIT){
            if(choice == options[0]){
                System.out.println(menuItems[0]);
            }
            else if (choice == options[1]){
                System.out.println(menuItems[1]);
            }
            else if (choice == options[2]){
                System.out.println(menuItems[2]);
            }

            //Display menu
            displayMenu(options, menuItems);

            //Get choice from user
            choice = in.nextInt();
        }
        System.out.println("Goodbye, call again!");

    }
}
