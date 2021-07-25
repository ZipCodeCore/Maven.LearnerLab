package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestEducator {

    @Before
    public void setUp() {
        Educator educator = Educator.LEON;
        educator.timeWorked = 0;
    }

    @Test
    public void implementationTest() {
        // When
        Educator educator = Educator.LEON;

        // Then
        Assert.assertTrue(educator instanceof Teacher);
    }

    @Test
    public void teachTest() {
        // Given
        Educator educator = Educator.LEON;
        Student student = new Student(1, "Bill");
        double numberOfHours = 2;
        double expectedTeachingTime = 2;

        // When
        educator.teach(student, numberOfHours);
        double actualTeachingTime = educator.timeWorked;

        // Then
        Assert.assertEquals(expectedTeachingTime, actualTeachingTime, 0);
    }

    @Test
    public void lectureTest() {
        // Given
        Educator educator = Educator.LEON;
        Student studentBill = new Student(1, "Bill");
        Student studentBen = new Student(2, "Ben");
        Student studentAllen = new Student(3, "Allen");
        Student[] students = new Student[] {studentBill, studentBen, studentAllen};
        double numberOfHours = 18;
        double expectedTeachingTime = 18;

        // When
        educator.lecture(students, numberOfHours);
        double actualTeachingTime = educator.timeWorked;

        // Then
        Assert.assertEquals(expectedTeachingTime, actualTeachingTime, 0);
    }
}
