package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    Student testStudent = new Student(2);

    @Test
    public void testImplementation(){
        boolean isInstance = testStudent instanceof  Learner;
        Assert.assertTrue(isInstance);
    }

    @Test
    public void testInheritance(){
        boolean isPerson = testStudent instanceof Person;
        Assert.assertTrue(isPerson);
    }

    @Test
    public void testLearn(){
        testStudent.learn(10);
        double expected = 10;
        double actual = testStudent.getTotalStudyTime();
        Assert.assertEquals(actual,expected, 00.5);
    }


}
