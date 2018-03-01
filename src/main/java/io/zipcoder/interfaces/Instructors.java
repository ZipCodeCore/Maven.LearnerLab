package io.zipcoder.interfaces;

public final class Instructors extends People {
    private static final Instructors INSTANCE = new Instructors();

    private Instructors() {
        Instructor instructor1 = new Instructor(10);
        instructor1.setName("Tariq");

        addPerson(instructor1);
    }

    public static Instructors getInstance() {
        return INSTANCE;
    }

    public Instructor[] getArray() {
        int index = 0;
        Instructor[] instructorsArray = new Instructor[personList.size()];
        for (Object instructor: personList) {
            instructorsArray[index] = (Instructor) instructor;
            index++;
        }
        return instructorsArray;
    }
}
