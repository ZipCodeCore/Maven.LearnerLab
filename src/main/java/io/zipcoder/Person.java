package io.zipcoder;

public class Person {
    public final long id;
    protected String name;

    public Person(String name, long id) {
        this.name = name;
        this.id = id;
    }

    public Person(){
        this.name = "";
        this.id = 0;
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
