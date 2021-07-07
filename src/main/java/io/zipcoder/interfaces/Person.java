package io.zipcoder.interfaces;

public class Person {
    protected final long id;
    protected String name;


    public Person(String name,long id) {
        this.id =id;
        this.name =name;
    }

    public long getId() {
        return id;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }



}
