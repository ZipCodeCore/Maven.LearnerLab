package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;

public class TestInstructor {
    @Test
    public void testImplementation(){
        //given
        Instructor instructor = new Instructor(8);

        //then
        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance(){
        //given
        Instructor instructor = new Instructor(8);
        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void testTeach(){
        // Given
        Instructor instructor = new Instructor(8);
        Student student = new Student(10);
        double expected = 150.00;
        // When
        instructor.teach(student, 150.00);
        // Then
        double actual = student.getTotalStudyTime();
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void testLecture(){
        // Given
        Instructor instructor = new Instructor(666);
        Student student0 = new Student(0);
        Student student1 = new Student(1);
        Student student2 = new Student(2);

        Student[] students = new Student[3];
        students[0] = student0;
        students[1] = student1;
        students[2] = student2;

        // When
        double expected = 50.00;
        instructor.lecture(students, 150);
        // Then
        double actual = student0.getTotalStudyTime();
        Assert.assertEquals(expected, actual, 0);
    }

}

