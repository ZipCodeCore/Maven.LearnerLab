package io.zipcoder.interfaces;

import java.util.ArrayList;

public class Students extends People<Student> {

    private static final Students INSTANCE = new Students();

   // private ArrayList<Student> studentList = new ArrayList<Student>();
//    @Override
//    public Person[] getArray() {
//        return personList.toArray(new Student[]{});
//    }

    @Override
    public Student[] getArray() {
        return personList.toArray(new Student[]{});
    }

    private Students(){
        Student keith = new Student(1234);
        Student corinne  = new Student(432);
        Student bo = new Student(54321);
        Student josh = new Student(87654);
        Student pat = new Student(98475);


        personList.add(keith);
        personList.add(corinne);
        personList.add(bo);
        personList.add(josh);
        personList.add(pat);

    }

    public static Students getInstance(){
        return INSTANCE;
    }

//    public Student[] getStudentArray(){
//        Student[] studentArray = new Student[getArray().length];
//        for (int i = 0; i < getArray().length; i++){
//           studentArray[i]  = (Student) getArray()[i];
//        }
//        return studentArray;
//    }
}
