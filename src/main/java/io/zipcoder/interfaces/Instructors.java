package io.zipcoder.interfaces;

public final class Instructors extends People {
    private static final Instructors INSTANCE = new Instructors();

    private Instructors() {
        Instructor instructor1 = new Instructor(10);
        instructor1.setName("Tariq");

        Instructor instructor2 = new Instructor(11);
        instructor2.setName("Leon");

        Instructor instructor3 = new Instructor(12);
        instructor3.setName("Kris");

        Instructor instructor4 = new Instructor(13);
        instructor4.setName("Wilhelm");

        Instructor instructor5 = new Instructor(14);
        instructor5.setName("Froilan");

        Instructor instructor6 = new Instructor(15);
        instructor6.setName("Nhu");

        addPerson(instructor1);
        addPerson(instructor2);
        addPerson(instructor3);
        addPerson(instructor4);
        addPerson(instructor5);
        addPerson(instructor6);
    }

    public static Instructors getInstance() {
        return INSTANCE;
    }
}
