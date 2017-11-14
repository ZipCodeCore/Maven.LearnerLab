package io.zipcoder.interfaces;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EducatorTest {
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
        Educator.Tariq_Hook.timeWorked = 0.0;
    }

    @Test
    public void addTimeworked() throws Exception {
        double expected = 1.0;
        Educator.Tariq_Hook.addTimeworked(expected);
        double actual = Educator.Tariq_Hook.getTimeWorked();
        Assert.assertEquals(expected,actual,0.001);

    }

    @Test
    public void teach() throws Exception {
        Student aStudent = new Student("Andrew",1);
        double expected = 1.0;
        Educator.Tariq_Hook.teach(aStudent,1.0);
        double actual = aStudent.getTotalStudyTime();
        Assert.assertEquals(expected,actual, 0.001);
    }

    @Test
    public void lecture() throws Exception {
        Student aStudent = new Student("Andrew",1);
        Learner[] listOfStudents= {aStudent};

        double expected = 1.0;
        Educator.Tariq_Hook.lecture(listOfStudents,1.0);
        double actual = aStudent.getTotalStudyTime();
        Assert.assertEquals(expected, actual,0.001);
    }

}