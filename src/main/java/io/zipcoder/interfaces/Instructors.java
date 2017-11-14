package io.zipcoder.interfaces;

public final class Instructors extends People<Instructor> {

    private static final Instructors INSTANCE = new Instructors();

    private Instructors() {
        long count = 0;
        for (Educator educator : Educator.values()) {
            super.add(new Instructor(count, educator.toString()));
            count++;
        }
    }

    @Override
    public Instructor[] getArray() {
        return INSTANCE.getPersonList().toArray(new Instructor[INSTANCE.getCount()]);
    }

    public static Instructors getInstance() {
        return INSTANCE;
    }
}
