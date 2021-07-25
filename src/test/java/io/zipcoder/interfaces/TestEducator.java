package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestEducator {
    @Test
    public void testTeach() {
        // Given
        Educator instructor = Educator.Leon;
        Student student = Students.getInstance().findById(122L);

        Double expectedStudyTime = 10.0;
        // When
        instructor.teach(student,10.0);
        Double actualStudyTime = student.getTotalStudyTime();

        // Then
        Assert.assertEquals(expectedStudyTime, actualStudyTime);
    }

    @Test
    public void testLecture() {
        // Given
        Educator instructor = Educator.Leon;
        Student student1 = Students.getInstance().findById(122L);
        Student student2 = Students.getInstance().findById(123L);
        Student[] students = new Student[] {student1, student2};

        Double expectedStudyTimePerStudent = 10.0 / students.length;

        // When
        instructor.lecture(students,10.0);
        Double actualStudyTimePerStudent = student1.getTotalStudyTime();

        // Then
        Assert.assertEquals(expectedStudyTimePerStudent,actualStudyTimePerStudent);
    }

    @Test
    public void testTimeWorked() {
        // Given
        Educator instructor = Educator.Dolio;
        Student student1 = Students.getInstance().findById(122L);
        Student student2 = Students.getInstance().findById(123L);
        Student[] students = new Student[] {student1, student2};

        Double expectedTimeWorked = 20.0;
        // When
        instructor.teach(student1, 10.0);
        instructor.lecture(students, 10.0);
        Double actualTimeWorked = Educator.Dolio.timeWorked;

        // Then
        Assert.assertEquals(expectedTimeWorked,actualTimeWorked);

    }

}
