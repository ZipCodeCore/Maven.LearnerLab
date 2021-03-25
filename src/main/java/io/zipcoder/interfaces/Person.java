package io.zipcoder.interfaces;

public class Person {

    private final long ID;
    private String name;

    public Person() {
        this.ID = 0;
        this.name = "";
    }

    public Person(long id, String name) {
        this.ID = id;
        this.name = name;
    }

    public long getId() {
        return ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
