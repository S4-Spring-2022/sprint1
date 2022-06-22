package com.keyin.member;

public class Family {

    private String parent;
    private String sibling;
    private String child;

    public Family() {
        this.parent = ""; // null?
        this.sibling = "";
        this.child = "";
    }

    public Family(String parent, String sibling, String child) {
        this.parent = parent;
        this.sibling = sibling;
        this.child = child;
    }

    // GETTERS

    public String getParent() {
        return this.parent;
    }

    public String getSibling() {
        return this.sibling;
    }

    public String getChild() {
        return this.child;
    }

    // SETTERS

    public void setParent(String parent) {
        this.parent = parent;
    }

    public void setSibling(String sibling) {
        this.sibling = sibling;
    }

    public void setChild(String child) {
        this.child = child;
    }
}
