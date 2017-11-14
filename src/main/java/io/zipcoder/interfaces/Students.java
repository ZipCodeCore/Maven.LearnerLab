package io.zipcoder.interfaces;

import java.util.ArrayList;

public final class  Students extends People<Student>{
    private static final Students INSTANCE=new Students();

    private Students(){
        for (int i=1; i<35; i++)
        super.add(new Student(i));
    }


    public Student[] getArray() {


        return personList.toArray(new Student[personList.size()]);

    }


    public static Students getInstance(){
        return INSTANCE;
    }

}
