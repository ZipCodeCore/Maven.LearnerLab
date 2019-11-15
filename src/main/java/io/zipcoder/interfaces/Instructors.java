package io.zipcoder.interfaces;

public final class Instructors extends People {

    private static final Instructors INSTANCE = new Instructors();

    protected Instructors(){

        this.add(new Instructor(75, "Dolio"));
        this.add(new Instructor(74, "Kris"));
        this.add(new Instructor(73 , "Christopher"));
        this.add(new Instructor(72, "Roberto"));
        this.add(new Instructor(71, "Froilan"));
    }

    public static Instructors getInstance() {
        return INSTANCE;
    }
}
