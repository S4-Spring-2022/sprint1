package com.keyin.member;

import java.time.LocalDateTime;
import java.util.ArrayList;
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

        // ** hard coded member array construction before starting the CLI **
        // ^^ create @ least three members and store them in a MemberArray

        ArrayList<Member> members = new ArrayList<Member>();

        members.add(new Member("Ashley", "123 Main St", "ash@gmail.com", 5551234, "Normal"));
        members.add(new Member("Joe", "456 Main St", "joe@gmail.com", 5557890, "Other"));
        members.add(new Member("Jane", "789 Main St", "jane@gmail.com", 5554321, "Trial"));

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

                Member newMember = new Member(name, address, email, phone, type);
                System.out.println("Member created!" + "\n" + newMember);
                System.out.println();

                // then we will use the member to add to the list of members
                members.add(newMember);
                System.out.println("Member added to list!");
                System.out.println(members);

                // then we will write the list to the file
                //
                break;
            case 2:
                // *** very much a stretch goal ***
                System.out.println("You have chosen to edit a member!");
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
                /// *** very much a stretch goal ***
                System.out.println("You have chosen to delete a member!");
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
                System.out.println("You have chosen to view all members!");

                Scanner scanner2 = new Scanner(System.in);

                System.out.println("To view all members, enter 1");
                System.out.println("To view all members by membership type, enter 2");
                System.out.println("To view all members by status, enter 3");
                System.out.println("To view a specific member, enter 4");
                int choice2 = scanner2.nextInt();

                switch (choice2) {
                    case 01:
                        System.out.println("You have chosen to view all members!");
                        // String all = scanner2.next();
                        for (Member member : members) {
                            System.out.println(member);
                        }

                        Scanner scanner3 = new Scanner(System.in);
                        System.out.println("Is another look up required? Enter 1 for YES, enter 2 for NO");
                        int choice3 = scanner3.nextInt();

                        switch (choice3) {
                            case 1:
                                // while loop
                        }

                    case 02:
                        System.out.println("You have chosen to view all members by membership type!");
                        System.out.println("Enter the membership type: ");
                        String type2 = scanner2.next();
                        // how to view all members by membership type?

                    case 03:
                        System.out.println("You have chosen to view all members by status!");
                        System.out.println("Enter status: ");
                        String status = scanner2.next();
                        // how to view all members by status?

                    case 04:
                        System.out.println("You have chosen to view a specific member!");
                        System.out.println("Enter member name: ");
                        String memberName = scanner2.next();

                        switch (memberName) {
                            case "Ashley":
                                System.out.println(members.get(0));
                            case "Joe":
                                System.out.println(members.get(1));
                            case "Jane":
                                System.out.println(members.get(2));
                        }

                }
                break;
            // this option will probably contain sub options for:
            // view all members
            // view all members by membership type
            // view all members by status
            // look up a specific member
            // this option will also ask if another lookup is required before returning to
            // the main menu

            default:
                System.out.println("You have chosen to exit.");
                break;
        }

        // close the scanner

    }

}
