package io.zipcoder.interfaces;

public class Person {

    protected final long id;
    private String name;

    public Person(long id) {
        this.id = id;
        this.name = "";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public long getId(){
        return id;
    }
}
