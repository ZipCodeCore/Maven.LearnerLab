package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    @Test
    public void testInstructor() {
        Instructor instructor = new Instructor(222);
        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance(){
        Instructor instructor = new Instructor(222);
        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void testTeach(){
        // :Given
        Instructor instructor = new Instructor(222);
        Student student = new Student(221);
        double expected = 10.0;

        // : When
        instructor.teach(student, expected);

        // : Then
        double actual = student.getTotalStudyTime();
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void testLecture(){
        //: Given
        Instructor instructor = new Instructor(222);
        Student student = new Student(111);
        double expected = 10;

        //: When
        instructor.teach(student, expected);
        //: Then
        double actual = student.totalStudyTime;
        Assert.assertEquals(expected, actual, 0);
    }
}
