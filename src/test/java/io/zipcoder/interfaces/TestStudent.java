package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {
    @Test
    public void testImplementation() {
        // Given
        Student student = new Student(null, null);
        // Then
        Assert.assertTrue(student instanceof Learner);
    }

    @Test
    public void testInheritance() {
        // Given
        Student student = new Student(null, null);
        // Then
        Assert.assertTrue(student instanceof Person);
    }

    @Test
    public void testLearn() {
        // Given
        Student student = new Student(null,"Jawnay");

        Double expectedStudyTime = 20.0;

        // When
        student.learn(20.0);
        Double actualStudyTime = student.getTotalStudyTime();

        // Then
        Assert.assertEquals(expectedStudyTime, actualStudyTime);
    }

}
