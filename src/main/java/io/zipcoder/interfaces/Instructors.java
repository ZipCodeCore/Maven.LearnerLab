package io.zipcoder.interfaces;

public class Instructors extends People {

    private final static Instructors INSTANCE = new Instructors();

    public static Instructors getInstance() {

        return INSTANCE;
    }

    private Instructors() {
        super.add(new Instructor(1, "Tariq Hook"));
        super.add(new Instructor(2, "L. Dolio Durant"));
        super.add(new Instructor(3, "Leon Hunter"));
    }
}
