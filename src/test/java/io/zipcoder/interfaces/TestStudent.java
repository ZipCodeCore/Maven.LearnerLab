package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void testImplementation(){
        Student student = new Student(8);
        Assert.assertTrue(student instanceof Learner);
    }

    @Test
    public void testInheritance(){
        Student stu = new Student(89);
        Assert.assertTrue(stu instanceof Person);
    }

    @Test
    public void testLearn(){
        Student student = new Student(97);
        student.setTotalStudyTime(10.0);
        double expected = 17.0;
        student.learn(7.0);
        double actual = student.getTotalStudyTime();
        Assert.assertEquals(expected, actual, 0.0);
    }
}
