package io.zipcoder.interfaces;

public class Students extends People<Student> {
    private static final Students INSTANCE;

    private Students() {}

    static Students getInstance() {
        if (INSTANCE == null) {
            INSTANCE.add(new Student(3L, "Wes"));
        }
        return INSTANCE;
    }

    static {
        INSTANCE = new Students();
        for (long i = 0; i < 35; i++) {
            INSTANCE.add(new Student(i+1L, "student"+i));
        }
    }

    public Student[] toArray() {
        return personList.toArray(new Student[0]);
    }
}