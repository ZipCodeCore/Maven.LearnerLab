package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    @Test
    public void implementationTest() {
        // Given
        long id = 5;
        String name = "Billy";

        // When
        Instructor instructor = new Instructor(id, name);

        // Then
        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void inheritanceTest() {
        // Given
        long id = 5;
        String name = "Billy";

        // When
        Instructor instructor = new Instructor(id, name);

        // Then
        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void teachTest() {
        // Given
        Instructor instructor = new Instructor(5, "Sam");
        Student student = new Student(1, "Bill");
        double numberOfHours = 2;
        double expectedStudyTime = 2;

        // When
        instructor.teach(student, numberOfHours);
        double actualStudyTime = student.getTotalStudyTime();

        // Then
        Assert.assertEquals(expectedStudyTime, actualStudyTime, 0);
    }

    @Test
    public void lectureTest() {
        // Given
        Instructor instructor = new Instructor(5, "Sam");
        Student studentBill = new Student(1, "Bill");
        Student studentBen = new Student(2, "Ben");
        Student studentAllen = new Student(3, "Allen");
        Student[] students = new Student[] {studentBill, studentBen, studentAllen};
        double numberOfHours = 18;
        double expectedStudyTime = 6;

        // When
        instructor.lecture(students, numberOfHours);
        double actualStudyTimeOfBill = studentBill.getTotalStudyTime();
        double actualStudyTimeOfBen = studentBen.getTotalStudyTime();
        double actualStudyTimeOfAllen = studentAllen.getTotalStudyTime();

        // Then
        Assert.assertEquals(expectedStudyTime, actualStudyTimeOfBill, 0);
        Assert.assertEquals(expectedStudyTime, actualStudyTimeOfBen, 0);
        Assert.assertEquals(expectedStudyTime, actualStudyTimeOfAllen, 0);
    }
}
