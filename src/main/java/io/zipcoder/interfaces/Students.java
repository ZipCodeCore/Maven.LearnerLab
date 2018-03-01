package io.zipcoder.interfaces;

import java.util.ArrayList;

public final class Students extends People {
    private static Students instance = null;

    private Students() {
        super();
        long id = 0;
        for (StudentNames name : StudentNames.values()) {
            id++;
            Student s = new Student(id);
            s.setName(name.toString());
            personList.add(s);

        }
    }

    public static Students getInstance() {
        if (instance == null) {
            instance = new Students();
        }
        return instance;
    }

    public Student[] getStudentArray() {
        Person[] person = Students.getInstance().getPersonAsArray();
        Student[] students = new Student[person.length];
        for (int i = 0; i < person.length; i++) {
            students[i] = (Student) person[i];
        }
        return students;

    }
}
