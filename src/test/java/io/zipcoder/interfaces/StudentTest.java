package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {
    @Test
    public void testImplementation(){
    Student student = new Student(-1);

        Assert.assertTrue(student instanceof Student);

    }
    @Test
    public void testInheritance(){

        Student student = new Student (-1);

        Assert.assertTrue(student instanceof Person);
    }
    @Test
    public void testLearner(){
        Student student = new Student( -1);
        double hoursToAdd = 5;

        student.learn(hoursToAdd);
        double actual = student.getTotalStudyTime();

        Assert.assertEquals(hoursToAdd, actual, 0);
    }
}
