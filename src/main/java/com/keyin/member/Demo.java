package com.keyin.member;
// Team -1 Barry_David_Gerald

import java.util.Scanner;  // Import the Scanner class

class Demo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" Enter Member name ");
        String memberName = input.nextLine();

        System.out.println(" Member Address ");
        String memberAddress = input.nextLine();

        // closes the scanner
        input.close();







        System.out.println("Member Name is: " + memberName );  // Output user input
        System.out.println("Address: " + memberAddress);  // Out

    }
}



