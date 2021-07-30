package io.zipcoder.interfaces;

public class Person {

    final long id;
    private String name;

    public Person(long id) {
        this.id = id;

    }

    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String aName) {
        this.name = aName;
    }


}
