package io.zipcoder.interfaces;

public final class Instructors extends People {

    private static final Instructors INSTANCE = new Instructors();

    private Instructors() {

        String[] names = {"Dolio", "Leon", "Tariq"};

        for (int i = 0; i < names.length; i++) {
            Instructor instructor = new Instructor();
            instructor.setName(names[i]);
            this.add(instructor);
        }

    }

    public static Instructors getInstance() {
        return INSTANCE;
    }

}
