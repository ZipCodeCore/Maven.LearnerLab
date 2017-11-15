package io.zipcoder.interfaces;



public class Person {
    private final long id;
    private String name;


    public Person(long thisPersonId) {


        this.id = thisPersonId;
    }

    public Person (long id, String name){
        this.name = name;
        this.id = id;

    }


    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
