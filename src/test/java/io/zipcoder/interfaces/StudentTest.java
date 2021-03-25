package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StudentTest {
    private Student testStudent;
    private Double totalStudyTime;
    private Double numberOfHours;

    @Before
    public void setUp() throws Exception {
       testStudent = new Student(98764L, "Coolio");
    }

    @Test
    public void instanceOfLearnerTest () {  //test implementation that student implements Learner
        Assert.assertTrue(testStudent instanceof Learner);
    }

    @Test
    public void inheritanceTest () {  //test inheritance that student extends Person
        Assert.assertTrue(testStudent instanceof Person);
    }

    @Test
    public void testLearn () {
        Double expected = 25D;
        testStudent.setTotalStudyTime(20D);
        testStudent.learn(5.00);
        Double actual = testStudent.getTotalStudyTime();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testLearn2 () {
        Double expected = 15.5;
        testStudent.learn(15.5);
        Double actual = testStudent.getTotalStudyTime();
        Assert.assertEquals(expected, actual);
    }

}
