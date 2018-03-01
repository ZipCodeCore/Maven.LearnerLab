package io.zipcoder.interfaces;

public class Person {

    private final long ID;
    private String name;

    public Person() {
        this.ID = 0;
        this.name = "";
    }

    public Person(long ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    public long getID() {
        return ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
