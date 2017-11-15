package io.zipcoder.interfaces;

public final class Students extends People<Student> {

    static final Students INSTANCE = new Students();

    private Students() {

        super.add(new Student(1, "Zan"));
        super.add(new Student(2, "Jeff"));
        super.add(new Student(3, "Claude"));

    }

    public static Students getInstance() {

        return INSTANCE;
    }


    public Student[] getStudentArray() {
        return new Student[0];
    }
}
