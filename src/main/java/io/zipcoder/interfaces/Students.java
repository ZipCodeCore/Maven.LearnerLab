package io.zipcoder.interfaces;

public class Students extends People{

    private static final Students INSTANCE = new Students();

    Students(){

    }

    public static Students getInstance(){
        return INSTANCE;
    }
    public Student[] getStudentArray() {
        Student[] allStudents = new Student[getArray().length];
        for(int i =0; i < getArray().length; i++) {
            allStudents[i] = (Student) getArray()[i];
        }
        return allStudents;
    }

}
