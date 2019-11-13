package io.zipcoder.interfaces;

public class Instructors extends People<Instructor> {
     private static final Instructors INSTANCE;

    private Instructors() {}

    public static Instructors getInstance() {
        if (INSTANCE == null) {
            INSTANCE.add(new Instructor(Long.valueOf(3), "Wes"));
        }
        return INSTANCE;
    }

    static {
        INSTANCE = new Instructors();
        for (int i = 0; i < 5; i++) {
            INSTANCE.add(new Instructor(Long.valueOf(i+1), "instructor"+i));
        }

    }

    public Instructor[] toArray() {
        return personList.toArray(new Instructor[personList.size()]);
    }
}
