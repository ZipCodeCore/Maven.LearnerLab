package io.zipcoder.interfaces;

public class Person {
    private final long id;
    private String name;

    public Person(long id) {
        this.id = id;
    }

    public long getid() {
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
