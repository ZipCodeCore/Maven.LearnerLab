package io.zipcoder.interfaces;

public class Students extends People<Student> {
    private static final Students INSTANCE;

    private Students() {}

    public static Students getInstance() {
        if (INSTANCE == null) {
            INSTANCE.add(new Student(Long.valueOf(3), "Wes"));
        }
        return INSTANCE;
    }

    static {
        INSTANCE = new Students();
        for (int i = 0; i < 35; i++) {
            INSTANCE.add(new Student(Long.valueOf(i+1), "student"+i));
        }
    }

    public Student[] toArray() {
        return personList.toArray(new Student[personList.size()]);
    }
}