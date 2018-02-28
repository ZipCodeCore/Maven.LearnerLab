package io.zipcoder.interfaces;

public class Instructors extends People {
    private static final Instructors INSTANCE = new Instructors();

    private Instructors(){
        Student keith = new Student(12345);
        Student gio = new Student(54321);
        Student eric = new Student(98765);
        Student pete = new Student (56789);
    }

    public static Instructors getInstance(){
        return INSTANCE;
    }
}
