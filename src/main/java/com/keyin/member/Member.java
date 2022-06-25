package com.keyin.member;

public class Member extends Person {

    private Membership membership;
    public static int memberCount = 0;

    public Member() {
        super("", "", "", 0);
        this.membership = new Membership();
        memberCount++;
    }

    public Member(String type) {
        super("", "", "", 0);
        this.membership = new Membership(type);
        memberCount++;
    }

    public Member(String name, String address, String email, int phone, String type) {
        super(name, address, email, phone);
        this.membership = new Membership(type);
        memberCount++;
    }

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

    public String getType() {
        return this.membership.getType();
    }

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

    public void setMembership(String type) {
        this.membership = new Membership(type);
    }

    public String toString() {
        return "Member name: " + name + "\n"
                + "Address: " + address + "\n"
                + "Email: " + email + "\n"
                + "Phone: " + phone + "\n"
                + "Member Type: " + membership + "\n";
    }

}
