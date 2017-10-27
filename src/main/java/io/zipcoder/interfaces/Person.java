package io.zipcoder.interfaces;

public class Person {

    final Long id;
    private String name;

    public Person(String name, Long id){
        this.name = name;
        this.id = id;
    }

    public long getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }
}
