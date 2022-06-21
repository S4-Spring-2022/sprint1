package CLI;

import com.keyin.member.MemberService;


import java.util.Scanner;



public class CLI {
    public CLI() {}


    public static void main(String[] args) {
        Boolean exit = false;
        Scanner scanner = new Scanner(System.in);


            System.out.println("1. Search Members");
            System.out.println("2. Search Tournaments");
            System.out.println("3. Exit");
            int choiceInt = scanner.nextInt();
            if (choiceInt == 1) {
                    System.out.println("------------------");
                    System.out.println("1. Search Member by Name");
                    System.out.println("2. Display all Members");
                int memberSearchChoice;
                memberSearchChoice = scanner.nextInt();
                if (memberSearchChoice == 1) {
                    System.out.print("  Enter member first name: ");
                    String memberFirstName = scanner.next();
                    System.out.print("  Enter member last name: ");
                    String memberLastName = scanner.next();
                    String memberName = memberFirstName + " " + memberLastName;
                    System.out.println("Show member by name"); // enter search for member by name when array is made
                }
                if (memberSearchChoice == 2){
                    System.out.print("show all members"); // enter search for all members when array is made
                }

                }
            if (choiceInt == 2) {
                System.out.println("------------------");
                System.out.println("1. Search Tournaments by Location");
                System.out.println("2. Display all Tournaments");
                int tournamentSearchChoice;
                tournamentSearchChoice = scanner.nextInt();
                if (tournamentSearchChoice == 1) {
                    System.out.println(" Enter Location of tournament");
                    String TournyLocation = scanner.next();
                    System.out.println("show tourny details"); // enter search for exact tourny when array is made
                }
                if (tournamentSearchChoice == 2) {
                    System.out.println("display all tournaments"); // enter search for all tournys when array is made
                }


            }

            if (choiceInt == 3){
                exit = true;
            }
            }
}
