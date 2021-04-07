package io.zipcoder.interfaces;

public class Instructors extends People <Instructor> {

    private static final Instructors INSTANCE = new Instructors();

    Instructors() {

    }

    public static Instructors getInstance() {
        return INSTANCE;
    }

    public Instructor[] getArray() {
        return personList.toArray(new Instructor[personList.size()]);
    }
}
