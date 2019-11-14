package io.zipcoder.interfaces;

public final class Instructors extends People<Instructor>{

    private static final Instructors INSTANCE = new Instructors();



    private Instructors(){
        super();
        Instructor instructorOne = new Instructor(311412L, "Dolio");
        Instructor instructorTwo = new Instructor(24302L, "Roberto");

        personList.add(instructorOne);
        personList.add(instructorTwo);

    }

    Instructor[] getArray() {
        return personList.toArray(new Instructor[personList.size()]);
    }

    public static Instructors getInstance(){
        return INSTANCE;
    }
}
