package io.zipcoder.interfaces;

public final class Students extends People {

    static final Students INSTANCE = new Students();

    private Students() {

       super.add(new Student(1,"Zan"));
       super.add(new Student(2,"Jeff"));
       super.add(new Student(3,"Claude"));

    }

    public static Students getInstance() {

        return INSTANCE;
    }

    public Student[] getStudentArray() {
        Person[] persons = getArray();
        Student[] students = new Student[getCount()];
        for (int i = 0; i < students.length; i++) {
            students[i] = (Student) persons[i];
        }
        return students;
    }


}
