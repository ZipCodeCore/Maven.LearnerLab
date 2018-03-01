package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class InstructorTest {

    private Instructor instructor;
    private Student student;
    private Student[] students;

    @Test
    public void implementationTest() {
        // Given
        // When
        instructor = new Instructor();
        // Then
        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void inheritanceTest() {
        // Given
        // When
        instructor = new Instructor();
        // Then
        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void teachTest() {
        // Given
        double expectedTotalStudyTime = 7;
        // When
        instructor = new Instructor();
        student = new Student(0);
        instructor.teach(student, expectedTotalStudyTime);
        double actualTotalStudyTime = student.getTotalStudyTime();
        // Then
        Assert.assertEquals(expectedTotalStudyTime, actualTotalStudyTime, 0.01);
    }

    @Test
    public void lectureTest() {
        // Given
        int expectedNumberOfStudents = 2;
        double expectedTotalStudyTimeForAllStudents = 7;
        double expectedTotalStudyTimePerStudent = expectedTotalStudyTimeForAllStudents/expectedNumberOfStudents;
        // When
        instructor = new Instructor();
        Student student0 = new Student(0);
        Student student1 = new Student(0);
        students = new Student[expectedNumberOfStudents];
        students[0] = student0;
        students[1] = student1;
        instructor.lecture(students, expectedTotalStudyTimeForAllStudents);
        double actualTotalStudyTimePerStudent = students[0].getTotalStudyTime();
        // Then
        Assert.assertEquals(expectedTotalStudyTimePerStudent, actualTotalStudyTimePerStudent, 0.01);
    }
}
