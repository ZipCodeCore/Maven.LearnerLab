package io.zipcoder.interfaces;

public class Person {

    private final long id;
    private String name;

    Person() {

    }

    public Person(long id) {
        this.id = id;
    }

    public long getId() {
        return this.id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
