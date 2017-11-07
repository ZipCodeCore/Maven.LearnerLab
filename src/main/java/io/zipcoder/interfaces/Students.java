package io.zipcoder.interfaces;

import java.util.ArrayList;

public final class  Students extends People{
    private static final Students INSTANCE=new Students();

    private Students(){
        for (int i=1; i<35; i++)
        super.add(new Student(i));
    }


    public Student[] getArray() {


        ArrayList<Student>students=super.getPersonList();
        Student [] studentArray=students.toArray(new Student[students.size()]);
        return studentArray;
    }


    public static Students getInstance(){
        return INSTANCE;
    }

}
