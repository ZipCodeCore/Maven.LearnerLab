package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestInstructor {

    Instructor testInstructor = new Instructor(666, "Dude Love");
    Student testStudent = new Student(0, "Phil");

    @Test
    public void testImplementation() {

        boolean expected = true;
        boolean actual = (testInstructor instanceof Teacher);

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void testInheritance(){

        boolean expected = true;
        boolean actual = (testInstructor instanceof Person);

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void testTeach(){

        double expected = 5000;
        testInstructor.teach(testStudent, 5000);

        double actual = testStudent.getTotalStudyTime();

        Assert.assertEquals(expected,actual,0);

    }

    @Test
    public void testLecture(){

        Student testStudent2 = new Student(2,"Ted");

        ArrayList<Student> students = new ArrayList<>();
        students.add(testStudent);
        students.add(testStudent2);

        double expected = 50;
        testInstructor.lecture(students, 100);
        double actual = testStudent.getTotalStudyTime();

        Assert.assertEquals(expected,actual);

    }

}
