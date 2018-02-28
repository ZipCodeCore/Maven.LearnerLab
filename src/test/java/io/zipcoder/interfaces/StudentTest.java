package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {
    public Student student;

    @Before
    public void setup(){

    }
    @Test
    public void testImplementation(){
        Student aStudent = new Student("Kibret",1);
        Assert.assertTrue(aStudent instanceof Learner);
    }
    @Test
    public void testInheritance(){
        Student aStudent = new Student("Kibret",1);
        Assert.assertTrue(aStudent instanceof Person);
    }


    @Test
    public void testLearn() {
        student =new Student("John",100,0.0);
        student.learner(336.0);
        double expected = 336.0;
        double actual = student.getTotalStudyTime();
        Assert.assertEquals(expected,actual,0.01);
    }

    @Test
    public void getTotalStudyTimeTest() {
        student =new Student("John",100,100.0);
        student.learner(400.0);
        double expected = 500.0;
        double actual = student.getTotalStudyTime();

        Assert.assertEquals(expected,actual,0.01);



    }
}