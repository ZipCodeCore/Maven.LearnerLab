package io.zipcoder.interfaces;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class TestStudent extends TestCase {

    @Test
    public void testImplementation(){
        //given
       Learner student=new Student(3l,"fiona");
        //when
        boolean expectedValue=student instanceof Learner;
        //then
        Assert.assertTrue(expectedValue);
    }

    @Test
    public void testInheritance(){
        //given
        Person student=new Student(4l,"kimmy");
        //when
        boolean expectedValue=student instanceof Person;
        //then
        Assert.assertTrue(expectedValue);
    }

    @Test
    public void testLearn(){
        //given
        Student newStudent=new Student(15l,"magnolia");
        Double expectedValue=5.0;
        //when
        newStudent.learn(5);
        Double actualValue=newStudent.totalStudyTime;
        //then
        Assert.assertEquals(expectedValue,actualValue);
    }

}