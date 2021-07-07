package io.zipcoder.interfaces;

public class Instructors extends People<Instructor>{
    private static final Instructors INSTANCE = new Instructors();

    public static Instructors getInstance() {
        return INSTANCE;
    }

    private Instructors() {
    }

    public Instructor[] getArray() {
        Instructor[] arrayOfInstructor = new Instructor[personList.size()];

        for(int i =0;i<personList.size();i++){
            arrayOfInstructor[i] = personList.get(i);
        }
        return arrayOfInstructor;
    }
}
