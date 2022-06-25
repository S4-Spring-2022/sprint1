package com.keyin.member;

import java.util.ArrayList;
import java.util.Scanner;

public class TournamentService {

    public static void main(String[] args) {

        // instantiate our sample data
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
        System.out.println("To update a tournament enter 4,(Not Implemented)");
        System.out.println("To delete a tournament enter 5,(Not Implemented)");
        System.out.println("To exit enter 0,");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You have chosen to create a tournament!");

                System.out.println("Please enter the tournament name: ");
                String tournamentName = input.next();

                System.out.println("Enter the start date of the tournament (format YYYY-MM-DDTHH:MM:SS)");
                String startDate = input.next();

                System.out.println("Enter the end date of the tournament (format YYYY-MM-DDTHH:MM:SS or 0 if unknown)");
                String endDate = input.next();

                System.out.println("Enter the location of the tournament");
                String location = input.next();

                System.out.println("Enter the tournament entry fee");
                double entryFee = input.nextFloat();

                System.out.println("Enter the tournament cash prize amount");
                double prize = input.nextFloat();

                Tournament tournament1 = new Tournament(tournamentName, startDate, endDate, location, entryFee, prize);
                System.out.println("Tournament created successfully!" + "\n");
                System.out.println(tournament1.toString()); 

                tournaments.add(tournament1);
                System.out.println("Tournament added to list!");
                System.out.println(tournaments);

                break;
            case 2:
                System.out.println("You have chosen to add a player to a tournament!" + "\n");

                System.out.println("Choose member 1, 2, or 3 to add to tournament: ");
                int memberChoice = input.nextInt();

                switch (memberChoice) {
                    case 1:
                        System.out.println("You have chosen member 1");
                        tournamentRoster.addMember(membersRegistered.get(0));
                        break;
                    case 2:
                        System.out.println("You have chosen member 2");
                        tournamentRoster.addMember(membersRegistered.get(1));
                        break;
                    case 3:
                        System.out.println("You have chosen member 3");
                        tournamentRoster.addMember(membersRegistered.get(2));
                        break;
                    default:
                        System.out.println("Invalid member choice");
                        break;
                }

                System.out.println("Player added to tournament successfully!");
                break;
            case 3:
                System.out.println("You have chosen to view all tournaments!");

                Scanner scanner2 = new Scanner(System.in);

                System.out.println("To view all tournaments, enter 1");
                System.out.println("To view a specific tournament, enter 2");
                int choice2 = scanner2.nextInt();

                switch (choice2) {
                    case 1:
                        System.out.println("You have chosen to view all tournaments!");
                        for (Tournament tournament : tournaments) {
                            System.out.println(tournament);
                        }
                        break;

                    case 02:
                        System.out.println("You have chosen to view a specific tournament!");
                        System.out.println("Enter tournament name: ");
                        String tournamentNames = scanner2.next();

                        switch (tournamentNames) {
                            case "Tournament1":
                                System.out.println(tournaments.get(0));
                                break;

                            case "Tournament2":
                                System.out.println(tournaments.get(1));
                                break;

                            case "Tournament3":
                                System.out.println(tournaments.get(2));
                                break;

                        }
                        break;
                }

                break;
            case 4:
                System.out.println("You have chosen to update a tournament.");
                System.out.println("Not Implemented");
                // ** very much a stretch goal **

                break;
            case 5:
                System.out.println("You have chosen to delete a tournament.");
                System.out.println("Not Implemented");
                // ** very much a stretch goal **
                
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
