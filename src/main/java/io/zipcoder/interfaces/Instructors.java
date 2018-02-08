package io.zipcoder.interfaces;

public class Instructors extends People<Instructor> {

    private final static Instructors INSTANCE = new Instructors();

    public static Instructors getInstance() {
        return INSTANCE;
    }

    private Instructors() {

        for (Educator a : Educator.values()){
            this.add(a.getInstructor());
        }

    }

    public Instructor[] getArray() {
        return personList.toArray(new Instructor[personList.size()]);
    }
}
