package io.zipcoder.interfaces;

public final class Instructors extends People {

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

    public static Instructors getInstance(){
        return INSTANCE;
    }

    /*  Might not need this method
    public static Students[] getStudentsArray() {
        return (Students[]) getInstance().getPersonList().toArray();
    }
    */

}