package io.zipcoder.interfaces;

public class Person {
    private final long id;
    protected String name;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(long id, String name) {
        this.id = id;
        this.name = name;
    }
}
