package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

   Student testStudent = new Student(666, "Beelzebub");

    @Test
    public void testImplementation(){

        boolean expected  = true;
        boolean actual = (testStudent instanceof Learner);

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void testInheritance(){

        boolean expected = true;
        boolean actual = (testStudent instanceof Student);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testLearn(){

        double expected = 500;
        testStudent.learn(500);
        double actual = testStudent.getTotalStudyTime();

    }

}
