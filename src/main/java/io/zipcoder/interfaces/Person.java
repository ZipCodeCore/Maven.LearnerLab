package io.zipcoder.interfaces;

public class Person {

    private final long ID;
    private String name;

    public Person (long ID){
        this.ID = ID;
    }

    public long getID (){
        return this.ID;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }


}
