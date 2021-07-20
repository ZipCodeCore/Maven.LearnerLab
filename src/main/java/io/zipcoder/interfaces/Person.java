package io.zipcoder.interfaces;

import sun.util.resources.ga.LocaleNames_ga;

public class Person {
    final long id;
    String name;

    public Person () {
        this.id = Long.MIN_VALUE;
        this.name = "";
    }

    public Person (long id, String name) {
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
}
