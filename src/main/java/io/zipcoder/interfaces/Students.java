package io.zipcoder.interfaces;

public final class Students extends People{

    private static final Students INSTANCE = new Students();

    private Students(){

        Student newStudent1 = new Student(10L, "Sam");
        Student newStudent2 = new Student(20L, "Dan");

        personList.add(newStudent1);
        personList.add(newStudent2);

    }

    public static Students getInstance(){
        return INSTANCE;
    }
}
