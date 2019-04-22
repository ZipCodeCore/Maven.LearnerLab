package io.zipcoder.interfaces;

import java.util.concurrent.atomic.AtomicInteger;

public class Person {

    private String name;
    private static AtomicInteger nextId = new AtomicInteger();
    private final long id;

    public Person(){
        this(nextId.incrementAndGet(), null);
    }
    public Person(long id){
        this(id, null);
    }

    public Person(String name) {
        this(nextId.incrementAndGet(), name);
    }

    public Person(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
