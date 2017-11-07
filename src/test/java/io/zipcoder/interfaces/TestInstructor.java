package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;

public class TestInstructor {

    Instructor ryan = new Instructor(5);

    @Test
    public void testImplementation(){
        Assert.assertTrue(ryan instanceof Teacher);

    }
    @Test
    public void testInheritance(){
        Assert.assertTrue(ryan instanceof Person);

    }
    @Test
    public void testTeach(){
        Student bob = new Student(2);

        double expected = 15;

        ryan.teach(bob, expected);

        double actual = bob.getTotalStudyTime();

        Assert.assertEquals(expected, actual, 0.001);

    }
    @Test
    public void testLecture(){
        Student bob = new Student(1);
        Student jim = new Student(2);
        Student kelly = new Student(3);
        Learner[] learners = {bob, jim, kelly};

        ryan.lecture(learners, 12);

        double expected = 4;
        double actual = bob.getTotalStudyTime();

        Assert.assertEquals(expected, actual, 0.00);
        Assert.assertEquals(expected, kelly.getTotalStudyTime(), 00);

    }

}
