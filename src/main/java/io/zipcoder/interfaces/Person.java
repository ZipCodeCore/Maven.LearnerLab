package io.zipcoder.interfaces;

import java.lang.reflect.Field;


public class Person {
    protected long id;
    String name;


    public Person(long id, String name){
        this.id = id;
        this.name = name;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }




}
