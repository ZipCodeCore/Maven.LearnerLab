package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    Student student = new Student(1234, "Aaron");

    @Test
    public void testImplementation() {

        Assert.assertTrue(student instanceof Learner);


    }

    @Test

    public void testInheritance() {

        Assert.assertTrue(student instanceof Person);

    }

//    @Test
//
//    public void testLearn() {
//
//        double expected = 15;
//        student.learn(expected);
//        double actual = student.learn(15);
//
//        Assert.assertEquals(expected, actual, 0);
//
//    }

}
