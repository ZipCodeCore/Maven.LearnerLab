package io.zipcoder.interfaces;

import java.util.ArrayList;

public class Students extends People {

    private static final Students INSTANCE = new Students();

    ArrayList<Student> studentList = new ArrayList<Student>();
    @Override
    public Person[] getArray() {
        return studentList.toArray(new Student[]{});
    }

    private Students(){

    }

    public static Students getInstance(){
        return INSTANCE;
    }

//    public Student[] getStudentArray(){
//        for (int i = 0; i < getArray().length; i++){
//            studentArray[i] = (Student) getArray()[i];
//        }
//        return studentArray;
//    }
}
