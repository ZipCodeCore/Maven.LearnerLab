package io.zipcoder.interfaces;

public final class Instructors extends People<Instructor>{

    private static final String[] names = {
            "Tariq Hook",
            "L. Dolio Durant",
            "Leon Hunter"
    };
    private static final Instructors INSTANCE = new Instructors();

    private Instructors() {
        super();
        for(String name: names) {
            long nextId = assignNextId();
            add(new Instructor(nextId, name));
        }
    }

    public static Instructors getInstance() {
        return INSTANCE;
    }

    public Instructor[] getArray() {
        return super.getArrayList().toArray(new Instructor[getCount()]);
    }
}
