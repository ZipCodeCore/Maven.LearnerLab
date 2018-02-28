package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void testImplementation(){
        //Given
        Student student;

        //When
        student = new Student(12345);

        //Then
        Assert.assertTrue(student instanceof Learner);

    }

    @Test
    public void testInheritance(){
        //Given
        Student student;

        //When
        student = new Student(12345);

        //Then
        Assert.assertTrue(student instanceof Person);

    }

    @Test
    public void testLearn() {
        //Given
        Student student = new Student(12345);

        //When
        student.learn(3);
        double expected = 3;
        double actual = student.getTotalStudyTime();

        //Then
        Assert.assertEquals(expected, actual, .001);
    }
}