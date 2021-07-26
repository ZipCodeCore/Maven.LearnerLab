package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestInstructor {
    @Test
    public void testImplementation() {
        // Given
        Instructor instructor = new Instructor(null, null);
        // Then
        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInterface() {
        // Given
        Instructor instructor = new Instructor(null, null);
        // Then
        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void testTeach() {
        // Given
        Instructor instructor = new Instructor(null, null);
        Student student1 = new Student(null, "Jawnay");
        Double expectedStudyTime = 10.0;
        // When
        instructor.teach(student1,10.0);
        Double actualStudyTime = student1.getTotalStudyTime();
        // Then
        Assert.assertEquals(expectedStudyTime, actualStudyTime);
    }

    @Test
    public void testLecture() {
        // Given
//        List<Student> studentList = new ArrayList<>();
//        studentList.add(new Student(null, null));
        Instructor instructor = new Instructor(null, null);
        Student student1 = new Student(null, "Jawn");
        Student student2 = new Student(null, "Jawnay");
        Student student3 = new Student(null, "JawnyJawn");
        Student[] students = new Student[]{student1, student2, student3};
        Double expectedStudyTimePerStudent = 10.0 / students.length;

        // When
        instructor.lecture(students,10.0);
        Double actualStudyTimePerStudent = student1.getTotalStudyTime();
        // Then
        Assert.assertEquals(expectedStudyTimePerStudent,actualStudyTimePerStudent);
    }

}
