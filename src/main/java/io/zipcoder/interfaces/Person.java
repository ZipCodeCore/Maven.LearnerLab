package io.zipcoder.interfaces;

public class Person {

    long id;
    private String name;

    public Person(String name, long id) {
        this.name = name;
        this.id = id;
    }

    public Person(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }

    public void learn(double numberOfHoursPerLearner) {}
}
