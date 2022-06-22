package com.keyin.member;

import java.util.Scanner;

public class TournamentService {

    // CLI to interact with tournaments
    // 1. Create a tournament
    // 2. Add a player to a tournament
    // 3. View all tournaments
    // ^^ View a tournament and other similar reports could live here too, tournament Roster, tournament results, etc.
    // 4. Update a tournament
    // 5. Delete a tournament *** unlikely to be used, but could be implemented ***
    // we will use a similar file system to store tournament data as we do with members
    // many of the considerations mentioned in the member service will apply here even if not directly mentioned again
    

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Tournament Service!");
        System.out.println("To create a tournament enter 1,");
        System.out.println("To add a player to a tournament enter 2,");
        System.out.println("To view all tournaments enter 3,");
        System.out.println("To update a tournament enter 4,");
        System.out.println("To delete a tournament enter 5,");
        System.out.println("To exit enter 0,");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                System.out.println("You have chosen to create a tournament.");
                // use the sccanner to get the tournament details
                // call the tournament constructor to create an instance of the tournament
                // confirm the tournament was created correctly
                // add the tournament to the tournament list
                // write the updated tournament list to the file
                break;
            case 2:
                System.out.println("You have chosen to add a player to a tournament.");
                // load the member list from the file
                // use the scanner to get the player identifier and 
                // search the member list for the player
                // use the tournament method to add the player to the tournamentRoster
                // confirm the player was added to the tournament
                // write the updated tournament list to the file
                break;
            case 3:
                System.out.println("You have chosen to view all tournaments.");
                // load the tournament list from the file ( ensure list is loaded?)
                // probably a sub menu of options to view specific information
                // ask if they want another option or to return to main menu on completion
                break;
            case 4:
                System.out.println("You have chosen to update a tournament.");
                // use scanner to get the tournament identifier (need to implement unique identifier) ( could use name via validation against the tournament list)
                // confirm the tournament exists and is the correct tournament
                // step through the tournament options, user validating each step like updating member details
                // ^^ use the tournament get and set methods to update the tournament
                // confirm the tournament was updated correctly
                // write the updated tournament list to the file
                break;
            case 5:
                System.out.println("You have chosen to delete a tournament.");
                // use the scanner to get the tournament identifier 
                // confirm the tournament exists and is the correct tournament
                // confirm the user wants to delete the tournament
                // warning statement to confirm the user wants to delete the tournament (this is a destructive action and permanent, likely)
                // delete the tournament from the tournament list
                // write the updated tournament list to the file
                break;
            case 0:
                System.out.println("You have chosen to exit the Tournament Service.");
                break;
            default:
                System.out.println("You have entered an invalid option.");
                break;
                
       }
    }
    
}
