package io.zipcoder.interfaces;

public class Person {

    private final long id;
    private String name;

    public Person(){
        id=0;
        name="DefaultConstructor";
    }

    public Person(long passedID, String passedName){
        id=passedID;
        setName(passedName);
    }


    public long getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public void setName(String passedName){
        name=passedName;
    }
}
