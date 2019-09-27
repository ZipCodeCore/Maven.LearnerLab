package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void testImplementation() {
        //Given
        Student student = new Student(-1);

        //When

        //Then
        Assert.assertTrue(student instanceof Student);
    }

    @Test
    public void testInheritance() {
        //Given
        Student student = new Student(-1);
        //When
        //Then
        Assert.assertTrue(student instanceof Student);

    }

    @Test
    public void testLearn() {
        //Given
        Student student = new Student(-1);
        double hoursToAdd = 5;
        //When
        student.learn(5);
        double actual = student.getTotalStudyTime();
        //Then
        Assert.assertEquals(hoursToAdd, actual,0);
    }
}
