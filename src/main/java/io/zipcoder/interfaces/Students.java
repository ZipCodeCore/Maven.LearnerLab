package io.zipcoder.interfaces;

public final class Students extends People<Student>{

    private static final Students INSTANCE = new Students();

    private Students(){

        Student newStudent1 = new Student(10L, "Sam");
        Student newStudent2 = new Student(20L, "Dan");

        super.add(newStudent1);
        super.add(newStudent2);

    }

    public Student[] getArray() {
        return super.personList.toArray(new Student[0]);
    }

    public static Students getInstance(){
        return INSTANCE;
    }

}
