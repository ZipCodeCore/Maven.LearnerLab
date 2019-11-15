package io.zipcoder.interfaces;

public final class Instructors extends People<Instructor> {
    private static final Instructors INSTANCE = new Instructors();

    private Instructors() {

        Instructor instructor = new Instructor(35, "Kris");
        Instructor instructor1 = new Instructor(36, "Roberto");
        Instructor instructor2 = new Instructor(37, "Chris");

        personList.add(instructor);
        personList.add(instructor1);
        personList.add(instructor2);
    }

    public Instructor[] toArray() {
        return personList.toArray(new Instructor[personList.size()]);
    }

    public static Instructors getInstance(){
        return INSTANCE;
    }
}
