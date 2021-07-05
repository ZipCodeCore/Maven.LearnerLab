package io.zipcoder.interfaces;

public final class Instructors extends People<Instructor> {

    private static final Instructors INSTANCE = new Instructors();

    private Instructors(){
        Instructor Leon = new Instructor(9898);
        Instructor Tariq = new Instructor(9876);
        Instructor Kris = new Instructor(9999);
        Instructor Wilhem = new Instructor(8888);
        getPersonList().add(Leon);
        getPersonList().add(Tariq);
        getPersonList().add(Kris);
        getPersonList().add(Wilhem);
    }

    public Instructor[] getArray() {
        return (Instructor[]) Instructors.getInstance().getPersonList().toArray();
    }

    public static Instructors getInstance(){
        return INSTANCE;
    }

    public static Instructors[] getInstructorsArray() {
        return (Instructors[]) Instructors.getInstance().getPersonList().toArray();
    }

}