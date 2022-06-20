package com.keyin.member;

// abstracting the concept of a person
public abstract class Person {

    private String name;
    private String address;
    private String email;
    private int phone;

    public Person(String name, String address, String email, int phone) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.phone = phone;
    }

    public abstract String getName();

    public abstract String getAddress();

    public abstract String getEmail();

    public abstract int getPhone();
    
}
