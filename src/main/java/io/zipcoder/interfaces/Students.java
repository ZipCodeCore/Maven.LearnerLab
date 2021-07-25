package io.zipcoder.interfaces;

import java.util.Arrays;

public final class Students extends People<Student> {
    private final static Students INSTANCE = new Students();
    private Students(){
        Student nate = new Student(0,"Nate");
        Student zach = new Student(1,"Zach");
        Student jeremy = new Student(2,"Jeremy");
        Student jen = new Student(3, "Jen");
        Arrays.asList(nate,zach,jeremy,jen)
                .forEach(student -> add(student));
    }

    @Override
    public Student[] toArray() {
        return INSTANCE.getPersonList().toArray(new Student[0]);
    }

    public static Students getInstance(){return INSTANCE;}


}
