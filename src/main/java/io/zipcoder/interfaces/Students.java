package io.zipcoder.interfaces;

public final class Students extends People {

    static final Students INSTANCE = new Students();

    private Students() {

        add(new Person(123, "Zan"));
        add(new Person(456, "Jeff"));
        add(new Person(789, "Sam"));
    }

    public static Students getInstance() {

        return INSTANCE;
    }

    public Student[] getArray() {
        Person[] persons = getArray();
        Student[] students = new Student[getCount()];
        for (int i = 0; i < students.length; i++) {
            students[i] = (Student) persons[i];
        }
        return students;
    }


}
