package io.zipcoder.interfaces;

public class Person {
    private final long id;
    private String name;

    public Person() {
        this.id = 1;
        this.name = "Brian";
    }

    public Person(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
