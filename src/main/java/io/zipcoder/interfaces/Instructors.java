package io.zipcoder.interfaces;

public final class Instructors extends People< Instructor> {

    private static final Instructors INSTANCE = new Instructors();

    String[] nameOfInstructors = {"Tarik", "Dolio", "Leon", "Iyasu" };

    private Instructors() {
        for(int i =0; i<nameOfInstructors.length; i++){
            Instructor person = new Instructor(i+1,""+nameOfInstructors);
            personList.add(person);
        }
    }

    public static Instructors getInstance() {
        if (INSTANCE != null) {
            return INSTANCE;
        } else {
            return INSTANCE;
        }
    }

    public Instructor[] getArray() {
        return new Instructor[0];
    }
}
