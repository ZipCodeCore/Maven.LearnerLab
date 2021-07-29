package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void inheritanceTest(){
        Student student = new Student(Long.MIN_VALUE, "Danielsan",40); //created a student

        Assert.assertTrue(student instanceof Learner); //should be true if student is learner
    }

    @Test
    public void StudentPersonTest() {
        Student student = new Student(Long.MAX_VALUE,"DoctorDoom",50.0);

        Assert.assertTrue(student instanceof Person);
    }

    @Test
    public void testlearn() {
        double numberOfHours = 20.0;
        Student student = new Student(Long.MAX_VALUE, "Brainiac", 80.0);

        Double expectedHours = 100.0;
        student.learn(numberOfHours);
        Double actualHours = student.getTotalStudyTime();

        Assert.assertEquals(expectedHours,actualHours);

    }
}
