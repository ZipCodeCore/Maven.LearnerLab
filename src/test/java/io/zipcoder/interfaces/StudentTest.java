package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {

    private Student student;

    @Test
    public void implementationTest() {
        // Given
        // When
        student = new Student();
        // Then
        Assert.assertTrue(student instanceof Learner);
    }

    @Test
    public void inheritanceTest() {
        // Given
        // When
        student = new Student();
        // Then
        Assert.assertTrue(student instanceof Person);
    }

    @Test
    public void learnTest() {
        // Given
        double expectedStartingTotalStudyTime = 0;
        double expectedNewNumberOfHours = 7;
        double expectedFinalTotalStudyTime = 7;
        // When
        student = new Student(expectedStartingTotalStudyTime);
        student.learn(expectedNewNumberOfHours);
        double actualFinalTotalStudyTime = student.getTotalStudyTime();
        // Then
        Assert.assertEquals(expectedFinalTotalStudyTime, actualFinalTotalStudyTime, 0.01);
    }
}
