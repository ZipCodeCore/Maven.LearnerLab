package io.zipcoder.interfaces;

import java.util.concurrent.atomic.AtomicInteger;

public class Person {

    private final long id;
    private String name;
    private static AtomicInteger nextId = new AtomicInteger();

    public Person(){
        this(nextId.incrementAndGet(), null);
    }

    public Person(String name){
        this(nextId.incrementAndGet(), name);
    }

    public Person(long id, String name){
        this.id = id;
        this.name = name;
    }

    public Person(long id) {
        this(id, null);
    }

    public long getId(){
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
