package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestStudent {

    @Test
    public void testInstanceOfLearner() {
        Student student = new Student(0, "Jackson", 5.0);
        assertTrue(student instanceof Learner);
    }

    @Test
    public void testInstanceOfPerson() {
        Student student = new Student(0, "Ryland", 5.0);
        assertTrue(student instanceof Person);
    }

    @Test
    public void testLearn() {
        //given
        double currentTotalStudyTime = 5.0;
        double expected = 8.5;
        Student student = new Student(0, "Candace", currentTotalStudyTime);
        //when
        student.learn(3.5);
        double actual = student.getTotalStudyTime();
        //then
        Assert.assertEquals(expected, actual, 0.001);

    }
}
