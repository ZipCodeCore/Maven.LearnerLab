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


    @Test
    public void testLearn() {
        Student student = new Student(1, "Zan");
        student.learn(10);

        double expected = 10;
        double actual = student.getTotalStudyTime();

        Assert.assertEquals(expected, actual, 0);

    }

}
