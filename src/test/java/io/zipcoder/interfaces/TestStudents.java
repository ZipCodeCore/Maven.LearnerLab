package io.zipcoder.interfaces;

import org.junit.Test;

public class TestStudents {

    @Test

    public void singletonTest(){
        Students students = Students.getInstance();

        System.out.println(students.studentList.get(0).getName());
    }
}
