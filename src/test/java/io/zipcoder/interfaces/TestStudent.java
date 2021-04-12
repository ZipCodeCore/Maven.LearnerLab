package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.notification.StoppedByUserException;

public class TestStudent {

    @Test
    public void studentIsLearnerTest(){
        Student student = new Student(9, "Bob");
        Assert.assertTrue(student instanceof Learner);
    }
    @Test
    public void studentIsPersonTest(){
        Student student = new Student(9, "Bob");
        Assert.assertTrue(student instanceof Person);
    }
    @Test
    public void testLearn(){
        Student student = new Student(9, "Bob");
        student.learn(10);
        double actual = student.getTotalStudyTime();
        student.learn(10);
        double expected = student.getTotalStudyTime();

        Assert.assertEquals(actual+10.0, expected,0);
    }
}


