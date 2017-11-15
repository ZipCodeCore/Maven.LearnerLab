package io.zipcoder.interfaces;

public class Person {
    public final long id;        //declare a "final" field named "id" of type "long"
    public String name;         //


 //person constructor
    public Person (long id, String name) {
        this.id = id;
        this.name = name;
    }




    public long getId(){     //test
        return id;
    }

    public String getName() {    //test
        return name;
    }

    public void setName() {        //test
        this.name = name;
    }

        }


