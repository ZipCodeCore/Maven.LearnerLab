package io.zipcoder.interfaces;

public class Person {
        final Long id;
        String name;

    public Person(Long id, String name){
        this.id = id;
        this.name = name;
    }

    public Long getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }
}
