package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {
    @Test
    public void testImplementation() {
        //Given
        Student student = new Student(25, "John");

        //When
        Boolean actual = student instanceof Learner;

        //Then
        Assert.assertTrue(student instanceof Learner);


    }

    @Test
    public void testInheritance(){
        //Given
        Student student = new Student(25, "John");

        //Then
        Assert.assertTrue(student instanceof Person);
    }

    @Test
    public void testLearn(){
        Student student = new Student(25, "John");
        Double expected = 16.0;

        //When
        student.learn(16);
        Double actual = student.getTotalStudyTime();

        //Then
        Assert.assertEquals(expected, actual);

    }

}
