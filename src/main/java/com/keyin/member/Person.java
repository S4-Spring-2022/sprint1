package com.keyin.member;

public abstract class Person {

    String name;
    String address;
    String email;
    int phone;

    public Person() {
        this.name = "";
        this.address = "";
        this.email = "";
        this.phone = 0;
    }

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
