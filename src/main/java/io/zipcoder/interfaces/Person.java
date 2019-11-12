package io.zipcoder.interfaces;

public class Person {

    private final Long id;
    private String name;

    public Person(Long id, String name){
        this.id = id;
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public Long getId(){
        return id;
    }

    public void setName(String name){
        this.name = name;
    }

}
