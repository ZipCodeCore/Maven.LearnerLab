package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    @Test
    public void implementationTest() {
        Instructor instructor = new Instructor(12);

        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void inheritanceTest() {
        Instructor instructor = new Instructor(13);

        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void teachTest() {
        Instructor instructor = new Instructor(14);
        Student student = new Student(15);

        instructor.teach(student, 4);

        double expected = 4;
        double actual = student.getTotalStudyTime();

        Assert.assertEquals(expected, actual, 1e-15);
    }

    @Test
    public void lectureTest() {
        Instructor instructor = new Instructor(16);
        Student student1 = new Student(17);
        Student student2 = new Student(18);
        Student student3 = new Student(19);

        Student[] students = new Student[3];
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;

        instructor.lecture(students, 9);

        double expected = 3;
        double actual = student1.getTotalStudyTime();

        Assert.assertEquals(expected, actual, 1e-15);
    }
}
