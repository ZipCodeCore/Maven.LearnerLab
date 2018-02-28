package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void testImplementation(){
        //Given
        Student student = new Student(5L);

        //When
        //Then
        Assert.assertTrue(student instanceof Learner);
    }

    @Test
    public void testInheritance(){
        //Given
        Student student = new Student(10L);
        //When
        //Then
        Assert.assertTrue(student instanceof Person);
    }

    @Test
    public void testLearn(){
        //Given
        Student student = new Student(15L);

        double numberOfHours = student.getTotalStudyTime();
        double hoursToAdd = 5;
        double expected = numberOfHours + hoursToAdd;


        // is incremented by the specified numberOfHours by invoking the .learn method.
        //When
        student.learn(hoursToAdd);

        //Then
        double actual = student.getTotalStudyTime();
        Assert.assertEquals(expected, actual, 0.001);
    }
}
