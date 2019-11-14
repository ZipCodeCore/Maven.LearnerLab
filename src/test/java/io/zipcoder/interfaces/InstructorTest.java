package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class InstructorTest {
    Instructor instructor;


    @Before
    public void setUp() throws Exception {
        instructor = new Instructor(100, "Charlotte");
    }

    @Test
    public void testImplementation() {
        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance() {
        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void teachTest() {
        Student student = new Student(678978, "Val");
        double expected = 100.0;
        instructor.teach(student, expected);

        Assert.assertEquals(expected, student.getTotalStudyTime());
    }

    @Test
    public void lectureTest() {
        Student[] students = new Student[4];

        for (int i = 0; i < students.length; i++) {
            students[i] = new Student(i, "Charlotte");
            instructor.lecture(students, 12);
            Double expected = 3.0;

            double totalStudyTime +=( double numberOfHours/students.length);

            Assert.assertEquals(expected, students[1].getTotalStudyTime());
        }
    }
}

