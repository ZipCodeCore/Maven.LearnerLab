package io.zipcoder;

import io.zipcoder.interfaces.Learner;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StudentTest {

    Student testStudent;

    @Before
    public void setup(){
        testStudent = new Student("Rick", 1);
    }

    @Test
    public void implementationTest(){
        Assert.assertTrue(testStudent instanceof Learner);
    }

    @Test
    public void inheritanceTest(){
        Assert.assertTrue(testStudent instanceof  Person);
    }

    @Test
    public void learnTest(){
        testStudent.learn(4);
        double actual = testStudent.getTotalStudyTime();
        double expected = 4.0;
        Assert.assertEquals(expected, actual, 0);
    }

}
