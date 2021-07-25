package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void implementationTest() {
        // Given
        long id = 5;
        String name = "Billy";

        // When
        Student student = new Student(id, name);

        // Then
        Assert.assertTrue(student instanceof Learner);
    }

    @Test
    public void inheritanceTest() {
        // Given
        long id = 5;
        String name = "Billy";

        // When
        Student student = new Student(id, name);

        // Then
        Assert.assertTrue(student instanceof Person);
    }

    @Test
    public void learnTest() {
        // Given
        Student student = new Student(5, "Sam");
        double expectedStudyTime = 10;

        // When
        student.learn(expectedStudyTime);
        double actualStudyTime = student.getTotalStudyTime();

        // Then
        Assert.assertEquals(expectedStudyTime, actualStudyTime, 0);
    }
}
