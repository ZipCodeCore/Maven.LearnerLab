package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    @Test
    public void testImplementation() {
        Instructor instructor = new Instructor(1234);
        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance() {
        Instructor instructor = new Instructor(1234);
        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void testTeach() {
        Instructor instructor = new Instructor(1234);
        Student student = new Student(1111);
        instructor.teach(student, 1.5);
        double expected = 1.5;
        double actual = student.getTotalStudyTime();
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void testLecture() {
        Instructor instructor = new Instructor(1234);
        Student student = new Student(1111);
        Student student1 = new Student(1112);
        Student student2 = new Student(1113);
        Student[] students = {student, student1, student2};
        instructor.lecture(students, 6.0);
        double expected = 2.0;
        double actual = student.getTotalStudyTime();
        Assert.assertEquals(expected, actual, 0);
    }

}
