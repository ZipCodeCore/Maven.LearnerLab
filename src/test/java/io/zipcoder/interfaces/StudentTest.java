package io.zipcoder.interfaces;

import org.junit.Test;

import org.junit.Assert;

public class StudentTest
{
    @Test
    public void testImplementation()
    {
        //Given
        Student student = new Student("Wilt", -2L);

        //When

        //Then
        Assert.assertTrue(student instanceof Learner);
    }

    @Test
    public void testInheritance()
    {
        //Given
        Student student = new Student("Tom",-2L);

        //When
        //Then
        Assert.assertTrue(student instanceof Person);

    }

    @Test
    public void testLearn()
    {
        //Given
        Student student = new Student("Kibret",-2L);
        double expectedHours = 5;

        //When
        student.learn(5);
        double actualHours = student.getTotalStudyTime();

        //Then
        Assert.assertEquals(expectedHours, actualHours, 0);

    }




}