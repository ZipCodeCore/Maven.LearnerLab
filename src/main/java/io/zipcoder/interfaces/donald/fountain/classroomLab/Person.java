package io.zipcoder.interfaces.donald.fountain.classroomLab;

public class Person {

    private final long id;
    private String name;


    public Person(long userId){
        id = userId;

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
