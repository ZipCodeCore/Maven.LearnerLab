package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    Student student = new Student(2);

    @Test
    public void learnTest()

    {//:Given
        double expected = 12;


        //:when
        student.learn(12);


        double actual = student.getTotalStudyTime();

        //:then
        Assert.assertEquals(expected, actual, 0);

    }


    @Test
    public void testImplmentation() {
        Learner learner;

        Assert.assertTrue(student instanceof Learner);


    }

    @Test
    public void testInheritance() {
        Person person;

        Assert.assertTrue(student instanceof Person);


    }

}