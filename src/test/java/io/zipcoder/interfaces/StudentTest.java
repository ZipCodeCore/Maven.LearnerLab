package io.zipcoder.interfaces;

import Interfaces.Learner;
import org.junit.Assert;
import org.junit.Test;

public class StudentTest{
    Student studentTest = new Student("Sue", 3);
    static final double constant = 0;

    @Test
    public void  implementationTest(){
        Assert.assertTrue (studentTest instanceof Learner);
    }

    @Test
    public void inheritanceTest(){
        Assert.assertTrue(studentTest instanceof Person);
    }

    @Test
    public void learnTest(){
        //Given
        double expected = 150.00;
        //When
        studentTest.learn(150.0);
        double actual = studentTest.getTotalStudyTime();
        //Then
        Assert.assertEquals(expected,actual, constant);
    }

}
