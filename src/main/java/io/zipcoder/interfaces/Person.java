package io.zipcoder.interfaces;

public class Person {

    public final long id;
    String name;

    public Person(long id) {
        this.id = id;
        this.name = "Gabi";
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }
}

//when you remove the default constructor from the parent
//class, then all its subclasses need constructors