package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.stream.Collectors;

public final class  Students extends People<Student>{
    private static final Students INSTANCE=new Students();

    private Students(){
        for (int i=1; i<35; i++)
        super.add(new Student(i));
    }


    public Student[] getArray() {
        Student [] students=personList.stream().toArray(Student[]::new);

        return students;

    }


    public static Students getInstance(){
        return INSTANCE;
    }

}
