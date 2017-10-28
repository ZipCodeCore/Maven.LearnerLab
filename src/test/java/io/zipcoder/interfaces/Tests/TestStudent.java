package io.zipcoder.interfaces.Tests;

import io.zipcoder.interfaces.classes.Student;
import io.zipcoder.interfaces.interfaces.Learner;
import org.junit.Assert;
import org.junit.Test;

public class TestStudent {


    Student testStudent = new Student(1, "Bill");

    @Test
    public void testImplementation() {
        boolean expected = true;
        boolean actual = testStudent instanceof Learner;

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testInheritance() {
        long expected = 1;
        long actual = testStudent.getId();

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testLearn(){
        testStudent.learn(200);
        testStudent.learn(100);
        testStudent.learn(50);

        double expected = 350;
        double actual = testStudent.getTotalStudyTime();

        Assert.assertEquals(expected, actual, 0);

    }


}
