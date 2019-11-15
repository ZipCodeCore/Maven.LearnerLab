package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.List;

public final class Students extends People<Student> {

    private static final List<Student> INSTANCE = new ArrayList<>();

    private Students(Student student){
        // private constructor to avoid client applications to use constructor
        INSTANCE.add(student);
    }

    public static List<Student> getInstance(){
        return INSTANCE;
    }


    public Student[] toArray() {
        Student[] studentArray = new Student[this.INSTANCE.size()];
        int i = 0;
        for (Student eachStudent : this.INSTANCE){
            studentArray[i++] = eachStudent;
        }
        return studentArray;
    }
}
