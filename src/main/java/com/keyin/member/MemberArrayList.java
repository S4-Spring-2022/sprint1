package com.keyin.member;
import java.util.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MemberArrayList {
    public static void main(String[] args) {
        ArrayList<String> firstName = new ArrayList<String>();
        ArrayList<String> lastName = new ArrayList<String>();
        ArrayList<Integer> memberId = new ArrayList<Integer>();;
        ArrayList<String> email = new ArrayList<String>();
        ArrayList<String> phone = new ArrayList<String>();


        Scanner scanner = new Scanner(System.in);
        String answer = " ";

        {
            do {
                System.out.println("Please enter Member First Name: ");
                firstName.add(scanner.next());
                System.out.println("Please enter Member Last Name: ");
                lastName.add(scanner.next());
                System.out.println("Please enter Member Id number: ");
                memberId.add(scanner.nextInt());
                System.out.println("Please enter Member Email: ");
                email.add(scanner.next());
                System.out.println("Please enter Member phone: ");
                phone.add(scanner.next());
                System.out.println("Do you want to add a Member yes/no?");
                answer = scanner.next();
            } while (answer.equals("yes"));
            if (answer.equals("yes")) ; //want it to go back to start another directory here
            else {
                System.out.println("Thanks for adding to the Members directory");

                System.out.println("");
                for (int i = 0; i < firstName.size(); i++) {

                    System.out.print("First Name " + firstName.get(i) + "\t");
                    System.out.print("Last Name " + lastName.get(i) + "\t");
                    System.out.print("Member Id " + memberId.get(i) + "\t");
                    System.out.print("Email " + email.get(i) + "\t");
                    System.out.print("Phone " + phone.get(i) );
                    System.out.println("");
                }
                Path output = Paths.get("/Users/MXZ User/Desktop/ArrayOutput.txt");
                try {
                    Files.write(output,(firstName));
                    System.out.println(output.toFile().getAbsolutePath());


//                    Files.write( output,(memberId));
                    Files.write(output,(email));

                    Files.write(output,(phone));
                    Files.write(output,(lastName));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
