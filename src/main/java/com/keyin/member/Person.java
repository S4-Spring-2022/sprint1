package com.keyin.member;

// abstracting the concept of a person
public abstract class Person {

    String name;
    String address;
    String email;
    int phone;

    // Empty constructor
    public Person() {
        this.name = "";
        this.address = "";
        this.email = "";
        this.phone = 0;
    }

    // Constructor with all fields
    public Person(String name, String address, String email, int phone) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.phone = phone;
    }

    // Abstract methods
    public abstract String getName();

    public abstract String getAddress();

    public abstract String getEmail();

    public abstract int getPhone();

}
