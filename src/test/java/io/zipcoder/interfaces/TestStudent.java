package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {
    @Test
    public void testLearn() {
        // Given
        Student student = new Student(8, 100.00 );
        double expected = 250.00;
        // When
        student.learn(150.00);
        // Then
        double actual = student.getTotalStudyTime();
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void testInstanceOfLearner() {
        // given
        Student student = new Student(8);
        //then
        Assert.assertTrue(student instanceof Learner);
    }
    @Test
    public void testInstanceOfPerson() {
        //given
        Student student = new Student(8);
        Assert.assertTrue(student instanceof Person);
    }
}
