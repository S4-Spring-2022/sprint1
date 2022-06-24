package com.keyin.member;

public class Member extends Person {

    private Membership membership;
    public static int memberCount = 0;

    public Member() {
        super("", "", "", 0);
        this.membership = new Membership();
        // this.memberDuration = "";
        // this.memberType = "";
        memberCount++;
    }

    public Member(String type) {
        super("", "", "", 0);
        this.membership = new Membership(type);
        // this.memberDuration = duration;
        // this.memberType = type;
        memberCount++;
    }

    public Member(String name, String address, String email, int phone, String type) {
        super(name, address, email, phone);
        this.membership = new Membership(type);
        // this.memberDuration = duration;
        // this.memberType = type;
        memberCount++;
    }

    // GETTERS

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public String getEmail() {
        return this.email;
    }

    public int getPhone() {
        return this.phone;
    }

    public Family getFamily() {
        return this.membership.getFamily();
    }

    // public Date getStartDate() {
    // return this.memberStartDate;
    // }

    // public String getDuration() {
    // return this.memberDuration;
    // }

    // public String getType() {
    // return this.memberType;
    // }

    // SETTERS
    // Do members have the authority to change their own information?
    // Do we need a setter for each field?
    // Would we enter the date or use a date method to set the start date?
    // Given that this is a CLI how will the CLI use these methods?
    // Will memberType be an object or a string?

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    // will membership types be defined as objects or strings?
    // public void setType(String type) {
    // this.memberType = type;
    // }
    public void setMembership(String type) {
        this.membership = new Membership(type);
    }

    public String toString() {
        return "Member name: " + name + "\n"
                + "Address: " + address + "\n"
                + "Email: " + email + "\n"
                + "Phone: " + phone + "\n"
                // + "Membership Start Date: " + memberStartDate + "\n"
                // + "Membership Duration: " + memberDuration + "\n"
                + "Member Type: " + membership + "\n";
    }

    // this method is probably unnecesary as the constructor will call a start date
    // creation from a current date object
    // public void setStartDate(Date startDate) {

    // this.memberStartDate = startDate;
    // }

    // this will be a calculated value based on start date and current date
    // public void setDuration(String duration) {
    // this.memberDuration = duration;
    // }

}
