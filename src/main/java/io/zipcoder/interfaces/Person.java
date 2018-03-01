package io.zipcoder.interfaces;
public class Person {

    private final Long id;
    private String name;

    public Person (Long id){
        this.id = id;
    }

    public Long getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }



}


