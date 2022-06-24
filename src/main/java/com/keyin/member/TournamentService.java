package com.keyin.member;

import java.util.ArrayList;
import java.util.Scanner;

public class TournamentService {

    // CLI to interact with tournaments
    // 1. Create a tournament
    // 2. Add a player to a tournament
    // 3. View all tournaments
    // ^^ View a tournament and other similar reports could live here too,
    // tournament Roster, tournament results, etc.
    // 4. Update a tournament
    // 5. Delete a tournament *** unlikely to be used, but could be implemented ***
    // we will use a similar file system to store tournament data as we do with
    // members
    // many of the considerations mentioned in the member service will apply here
    // even if not directly mentioned again

    public static void main(String[] args) {

        TournamentRoster tournamentRoster = new TournamentRoster();

        ArrayList<Tournament> tournaments = new ArrayList<Tournament>();

        tournaments.add(
                new Tournament("Tournament1", "2022-06-25T12:00:00", "2022-06-30T10:30:00", "St.John's", 20, 1000));
        tournaments.add(
                new Tournament("Tournament2", "2022-07-01T11:30:00", "2022-06-05T11:00:00", "Corner Brook", 20, 1000));
        tournaments.add(
                new Tournament("Tournament3", "2022-08-15T10:45:00", "2022-08-20T12:30:00", "Bonavista", 20, 1000));

        ArrayList<Member> membersRegistered = new ArrayList<Member>();

        membersRegistered.add(new Member("Ashley", "123 Main St", "ash@gmail.com", 5551234, "Normal"));
        membersRegistered.add(new Member("Joe", "456 Main St", "joe@gmail.com", 5557890, "Other"));
        membersRegistered.add(new Member("Jane", "789 Main St", "jane@gmail.com", 5554321, "Trial"));

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
                System.out.println("You have chosen to create a tournament!");
                // use the scanner to get the tournament details
                System.out.println("Please enter the tournament name: ");
                String tournamentName = input.next();

                System.out.println("Enter the start date of the tournament (format YYYY-MM-DDTHH:MM:SS)");
                String startDate = input.next();

                System.out.println("Enter the end date of the tournament (format YYYY-MM-DDTHH:MM:SS or 0 if unknown)");
                // need to revisit this validation logic, it's likely to cause issues
                String endDate = input.next();
                // if (endDate == "0") {
                // endDate = null;
                // }

                System.out.println("Enter the location of the tournament");
                String location = input.next();
                System.out.println("Enter the tournament entry fee");
                double entryFee = input.nextFloat();
                System.out.println("Enter the tournament cash prize amount");
                double prize = input.nextFloat();

                Tournament tournament1 = new Tournament(tournamentName, startDate, endDate, location, entryFee, prize);
                System.out.println("Tournament created successfully!");
                System.out.println();
                System.out.println(tournament1.toString()); // number of players = 0 ?

                tournaments.add(tournament1);
                System.out.println("Tournament added to list!");
                System.out.println(tournaments);

                // add the tournament to the tournament list
                // write the updated tournament list to the file
                break;
            case 2:
                System.out.println("You have chosen to add a player to a tournament!");
                System.out.println();
                // load the member list from the file - will be done at the start of the program
                System.out.println(membersRegistered.get(0));
                System.out.println(membersRegistered.get(1));
                System.out.println(membersRegistered.get(2));
                // tournament selection not implemented yet
                // methods hard coded for sample tournament data

                // use the scanner to get the player identifier and
                // System.out.println("Please enter the player identifier: ");
                // int playerId = input.nextInt();
                // ^^ not implement yet instead methods with hard coded data will be used

                System.out.println("Choose member 1, 2, or 3 to add to tournament: ");
                int memberChoice = input.nextInt();

                switch (memberChoice) {
                    case 1:
                        System.out.println("You have chosen member 1");
                        tournamentRoster.addMember(membersRegistered.get(0));
                        break;
                    case 2:
                        System.out.println("You have chosen member 2");
                        // tournamentOne.addPlayer(memberTwo);
                        break;
                    case 3:
                        System.out.println("You have chosen member 3");
                        // tournamentOne.addPlayer(memberThree);
                        break;
                    default:
                        System.out.println("Invalid member choice");
                        break;
                }

                // confirm the player was added to the tournament
                System.out.println("Player added to tournament successfully!");
                // write the updated tournament list to the file
                // ^^ not implemented yet
                break;
            case 3:
                System.out.println("You have chosen to view all tournaments!");

                Scanner scanner2 = new Scanner(System.in);

                System.out.println("To view all tournaments, enter 1");
                System.out.println("To view a specific tournament, enter 2");
                int choice2 = scanner2.nextInt();

                switch (choice2) {
                    case 01:
                        System.out.println("You have chosen to view all tournaments!");
                        for (Tournament tournament : tournaments) {
                            System.out.println(tournament);
                        }

                    case 02:
                        System.out.println("You have chosen to view a specific tournament!");
                        System.out.println("Enter tournament name: ");
                        String tournamentNames = scanner2.next();

                        switch (tournamentNames) {
                            case "Tournament1":
                                System.out.println(tournaments.get(0));

                            case "Tournament2":
                                System.out.println(tournaments.get(1));

                            case "Tournament3":
                                System.out.println(tournaments.get(2));

                                // LISTING ALL 3 TOURNAMENTS FOR SOME REASON NO MATTER WHICH CHOICE
                        }
                }
                // the same almost to the T
                // load the tournament list from the file ( ensure list is loaded?)
                // print the tournament list
                // for(Tournament eachTournament : tournamentList) {
                // System.out.println(tournament.toString());
                // } // would be the List method to display a list of tournaments

                // probably a sub menu of options to view specific information
                // ask if they want another option or to return to main menu on completion
                break;
            case 4:
                System.out.println("You have chosen to update a tournament.");
                // ** very much a stretch goal **
                // use scanner to get the tournament identifier (need to implement unique
                // identifier) ( could use name via validation against the tournament list)
                // confirm the tournament exists and is the correct tournament
                // step through the tournament options, user validating each step like updating
                // member details
                // ^^ use the tournament get and set methods to update the tournament
                // confirm the tournament was updated correctly
                // write the updated tournament list to the file
                break;
            case 5:
                System.out.println("You have chosen to delete a tournament.");
                // ** very much a stretch goal **
                // use the scanner to get the tournament identifier
                // confirm the tournament exists and is the correct tournament
                // confirm the user wants to delete the tournament
                // warning statement to confirm the user wants to delete the tournament (this is
                // a destructive action and permanent, likely)
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
