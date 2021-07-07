package io.zipcoder.interfaces;

public final class Instructors extends People<Instructor>{

    private static final Instructors INSTANCE = new Instructors();

    private Instructors(){

        Instructor newInstructor1 = new Instructor(100L, "Rick");
        Instructor newInstructor2 = new Instructor(110L, "Dana");
        Instructor newInstructor3 = new Instructor(120L, "John");

        super.add(newInstructor1);
        super.add(newInstructor2);
        super.add(newInstructor3);

    }

    public Instructor[] getArray() {
        return super.personList.toArray(new Instructor[0]);
    }

    public static Instructors getInstance(){

        return INSTANCE;
    }

}

