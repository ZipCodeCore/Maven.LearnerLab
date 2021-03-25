package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class EducatorTest {

    Educator tariq = Educator.TARIQ;
    Instructors instructors;
    Student student;
    Student[] students;

    @Test
    public void implementationTest() {
        // Given
        // When
        // Then
        Assert.assertTrue(tariq instanceof Teacher);
    }

    @Test
    public void teachTest() {
        // Given
        double expectedTotalTimeWorked = 7;
        // When
        student = new Student(0);
        tariq.teach(student, expectedTotalTimeWorked);
        double actualTotalTimeWorked = student.getTotalStudyTime();
        // Then
        Assert.assertEquals(expectedTotalTimeWorked, actualTotalTimeWorked, 0.01);
    }

    @Test
    public void lectureTest() {
        // Given
        int expectedNumberOfStudents = 2;
        double expectedTotalTimeForInstructor = 7;
        double expectedTotalStudyTimeForAllStudents = 7;
        double expectedTotalStudyTimePerStudent = expectedTotalStudyTimeForAllStudents/expectedNumberOfStudents;
        // When
        Student student0 = new Student(0);
        Student student1 = new Student(0);
        students = new Student[expectedNumberOfStudents];
        students[0] = student0;
        students[1] = student1;
        tariq.lecture(students, expectedTotalStudyTimeForAllStudents);
        double actualTotalTimeForInstructor = tariq.getTimeWorked();
        // Then
        Assert.assertEquals(expectedTotalTimeForInstructor, actualTotalTimeForInstructor, 0.01);
    }
}
