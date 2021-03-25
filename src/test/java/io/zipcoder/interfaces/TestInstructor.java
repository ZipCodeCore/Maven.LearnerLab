package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    @Test
    public void implementInstructorTest(){
        Instructor instructorOne = new Instructor(1232L, "Dolio");

        Assert.assertTrue(instructorOne instanceof Teacher);
    }

    @Test
    public void inheritanceInstructorTest(){
        Instructor instructorOne = new Instructor(1232L, "Dolio");

        Assert.assertTrue(instructorOne instanceof Person);
    }

    @Test
    public void teachTest(){
        Instructor instructorOne = new Instructor(1232L, "Dolio");
        Student studentOne = new Student(1333L, "Joe");
        double expectedTime = 20.0;
        instructorOne.teach(studentOne, expectedTime);
        double actualTime = studentOne.getTotalStudyTime();

        Assert.assertEquals(expectedTime, actualTime, 0);
    }

    @Test
    public void lectureTest(){
        Instructor instructorOne = new Instructor(1232L, "Dolio");
        Student studentOne = new Student(1333L, "Joe");
        Student studentTwo = new Student(123222L, "Zoe");

        Learner[] students = {studentOne, studentTwo};
        instructorOne.lecture(students, 36);

        double expectedTime = 18;
        double actualTime = studentTwo.getTotalStudyTime();

        Assert.assertEquals(expectedTime, actualTime, 0);
    }
}
