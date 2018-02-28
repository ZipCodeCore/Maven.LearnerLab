package io.zipcoder.interfaces;

import com.sun.xml.internal.xsom.impl.scd.Iterators;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.Assert.*;

public class InstructorTest {

    @Test
    public void testImplementation(){
        //Given
        Instructor instructor;

        //When
        instructor = new Instructor(12345);

        //Then
        Assert.assertTrue(instructor instanceof Teacher);

    }

    @Test
    public void testInheritance(){
        //Given
        Instructor instructor;

        //When
        instructor = new Instructor(12345);

        //Then
        Assert.assertTrue(instructor instanceof Person);

    }
    @Test
    public void teach() {
        //Given
        Instructor instructor = new Instructor(12345);
        //OR Teacher teacher = new Instructor(221);
        Student student = new Student(9999);

        //When
        instructor.teach(student, 4);
        double expected = 4;
        double actual = student.getTotalStudyTime();

        //Then
        Assert.assertEquals(expected, actual, .001);

    }

    @Test
    public void lecture() {
        //Given
        Instructor instructor = new Instructor(12345);
        Student[] learners = new Student[3];
        double numberOfHours = 9;
        learners[0] = new Student(9991);
        learners[1] = new Student(9992);
        learners[2] = new Student(9993);

        //When

        instructor.lecture(learners, numberOfHours);
        double expected = numberOfHours / learners.length;
        double actual = (learners[0]).getTotalStudyTime();

        //Then
        Assert.assertEquals(expected, actual, .001);
    }
}