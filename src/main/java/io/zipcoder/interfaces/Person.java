package io.zipcoder.interfaces;

public class Person {

    final long id;
    String name;

    Person(long id, String name){
        this.id = id;
        this.name = name;
    }

    long getId(){
        return this.id;
    }

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return this.name;
    }

}
