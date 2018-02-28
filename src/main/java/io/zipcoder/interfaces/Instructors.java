package io.zipcoder.interfaces;

public class Instructors extends People<Instructor> {

    private static final Instructors INSTANCE = new Instructors();

    private Instructors() {

    }

    public static Instructors getInstance() {

        return INSTANCE;
    }

    @Override
    public Instructor[] getArray() {
        Instructor[] instructorArray = new Instructor[personList.size()];

        for (int i = 0; i < personList.size(); i++) {
            instructorArray[i] = personList.get(i);
        }
        return instructorArray;
    }
}
