package io.zipcoder.interfaces;

public class Person {

    long id;
    private String name;

    public Person(long id, String oleg) {
        this.id = id;
    }

    public Person() {}

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }
}
