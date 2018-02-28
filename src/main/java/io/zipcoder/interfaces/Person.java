package io.zipcoder.interfaces;

public class Person {
    private final Long id;
    private String name;
    //constructors
    public Person (Long id){
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
