package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {


    @Test
    public void testimplementation(){
     Student student = new Student(654, "jack");
        Assert.assertTrue(student instanceof Person);
    }

    @Test
    public void testInheritance(){
        Student student = new Student(654, "jack");
        Assert.assertTrue(student instanceof Learner);
    }

    @Test
    public void testLearn(){
        //GIVEN
        Student student = new Student(654, "jack");

        //WHEN
        student.learn(12.0);
        Double expected = 12.0;
        Double actual = student.getTotalStudyTime();

        //THEN
        Assert.assertEquals(expected, actual);
    }

}
