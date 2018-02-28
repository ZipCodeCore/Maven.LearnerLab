package io.zipcoder.interfaces;

public class Students extends People {

    private static final Students INSTANCE = new Students();

    private Students() {

    }

    public static Students getInstance() {

        return INSTANCE;
    }

    public Student[] getStudentsArray() {

        Student[] studentsArray = new Student[getArray().size()];

        for (int i = 0; i < getArray().size(); i++) {
            studentsArray[i] = (Student) getArray().get(i);
        }

        return studentsArray;
    }

}
