package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void testImplementation(){
    //asserts that a Student is an instanceof a Learner
        Student student = new Student(00045);
        //When
        Assert.assertTrue(student instanceof Learner);

    }

    @Test
    public void testInheritance(){
    //asserts that a Student is an instanceof a Person
        Student student = new Student(00045);
        //When
        Assert.assertTrue(student instanceof Person);

    }

    @Test
    public void learn() {
    //ensures a Student's totalStudyTime instance variable is
        // incremented by the specified numberOfHours by invoking the .learn method
        Student student = new Student(00045);
        //When
        int numberOfHours = 4;
        double expected = 4;
        double actual = student.getTotalStudyTime();
        //Then
        Assert.assertEquals(expected, actual);
    }
}