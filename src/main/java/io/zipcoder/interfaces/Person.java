package io.zipcoder.interfaces;

public class Person {

    private final long id;
    public String name;

    public Person(long id, String name){
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }
    public String getName(){
        return name;
    }
    public void setName(){
        this.setName();
    }
}
