package com.keyin.member;

import java.time.LocalDateTime;
import java.util.Scanner;

public class MemberService {

    // creating a cli
    // using a file system to store member data we will need to be able to:
    // read the file,
    // convert the data to a list of members,
    // add a new member and write the updated list over the old one in out file
    // store
    // to update a member:
    // find member by a unique identifier (we need to add this to the member class)
    // modify that member in the list
    // write the updated list back to the file
    // to delete a member:
    // find member by a unique identifier
    // remove that member from the list
    // write the updated list back to the file
    // to view a member:
    // find member by a unique identifier
    // print that member
    // to view all members:
    // print all members
    // to view all members by a specific membership type:
    // print all members by a specific membership type
    // more edges cases exist like view by family, view by expired/active(not
    // included in membership class)

    public static void main(String[] args) {
        // ** validation and error handling **
        // ^^ need to be considered and implemented
        // ** member list file versioning? will we save previous versions of the member
        // list for data integrity purposes? **

        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("Welcome to the Member Service!");
        System.out.println();
        System.out.println("To create a new member, enter 1");
        System.out.println("To edit a member, enter 2");
        System.out.println("To delete a member, enter 3");
        System.out.println("To view all members, enter 4");
        System.out.println("To exit, enter 0");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You have chosen to create a new member!");

                System.out.println("Please enter your name: ");
                String name = scanner.next();

                System.out.println("Enter your address: ");
                String address = scanner.next();

                System.out.println("Enter your email: ");
                String email = scanner.next();

                System.out.println("Enter your phone number: ");
                int phone = scanner.nextInt();

                System.out.println("Enter your membership type: ");
                String type = scanner.next();

                Member member = new Member(name, address, email, phone, type);
                System.out.println("Member created!" + "\n" + member);
                System.out.println();

                // we will use the provided information to create a member1
                // then we will use the member to add to the list of members
                // then we will write the list to the file
                break;
            case 2:
                System.out.println("You have chosen to edit a member.");
                // the logic for this step will be much trickier than the create step
                // Look up member by unique identifier
                // Prompt for new information
                // ^^ would you like to change name from {member.getName()}? y or n (if yes,
                // enter new name) for each field
                // ^^^^ we can use the set and get methods here because the member objects exist
                // then we revalidate the changes to member by user validation
                // finally we will write the list to the file
                break;
            case 3:
                System.out.println("You have chosen to delete a member.");
                // Deletion is tricky because we don't like data destruction.
                // several validation steps will be required
                // Do you instead want to deactivate a member?
                // are you sure you want to delete {member.getName()}? y or n
                // this will permanently delete the member from the club? confirm y or n
                // ^^^ we will also have to scrub any other files ( tournament, registration,
                // etc) for references to this member
                // ^^^ otherwise unwanted errors could occur
                // if we decide to implement this we will remove the member from the list at
                // this point and then write the list to the file
                break;
            case 4:
                System.out.println("You have chosen to view all members.");
                // this option will probably contain sub options for:
                // view all members
                // view all members by membership type
                // view all members by status
                // look up a specific member
                // this option will also ask if another lookup is required before returning to
                // the main menu
                break;

            default:
                System.out.println("You have chosen to exit.");
                break;
        }

        // close the scanner

    }

}
