package io.zipcoder.interfaces;

public class Person {
    private final long id;
    private String name;

    public Person(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        StringBuilder personAsString = new StringBuilder();
        personAsString.append(this.getName() + ": " + this.getId());
        return personAsString.toString();
    }
}
