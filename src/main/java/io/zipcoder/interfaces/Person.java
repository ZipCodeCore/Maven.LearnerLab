package io.zipcoder.interfaces;

public class Person<E> {
    private final long id;
    private String name;

    Person(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
