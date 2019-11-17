package io.zipcoder.interfaces;

public class Person {
    final Long id;
    String name;
    Person(Long personId,String personName){
        this.name=personName;
        this.id=personId;
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
