package io.zipcoder.interfaces;

public class Person {

    private final long id;
    private String name;


    public Person(long id) {
        this.id = id;
    }

    public long getId(){
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
