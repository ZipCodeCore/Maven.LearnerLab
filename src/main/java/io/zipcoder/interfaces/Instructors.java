package io.zipcoder.interfaces;

public class Instructors extends People<Instructor> {
    private static final Instructors INSTANCE = new Instructors();

    private Instructors() {
        int countId = 0;
        for (Educator aEducator:Educator.values()) {
            super.add(new Instructor(aEducator.toString(), countId));
            countId++;
        }
    }

    public static Instructors getInstance(){
        return Instructors.INSTANCE;
    }


    public Instructor[] getArray() {
        return INSTANCE.getPersonList().toArray(new Instructor[INSTANCE.getCount()]);
    }
}

