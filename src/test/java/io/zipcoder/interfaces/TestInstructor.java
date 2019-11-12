package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {
    @Test
    public void testImplementation() {
        Instructor instructor = new Instructor(Long.valueOf(3), "github");
        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance() {
        Instructor instructor = new Instructor(Long.valueOf(3), "github");
        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void testTeach() {
        Instructor instructor = new Instructor(Long.valueOf(3), "github");
        Student student1 = new Student(Long.valueOf(5), "Wes");
        instructor.teach(student1, 45.4);
        Double actual = student1.getTotalStudyTime();
        Double expected = 45.4;
        Assert.assertEquals(expected, actual, 2);
    }

    @Test
    public void testLecture() {
        Instructor instructor = new Instructor(Long.valueOf(3), "github");
        Student student1 = new Student(Long.valueOf(5), "Wes");
        Student student2 = new Student(Long.valueOf(8), "Table");
        Student student3 = new Student(Long.valueOf(33), "Book");
        Student[] students = {student1, student2, student3};

        instructor.lecture(students, 48.0);
        for (Student student: students) {
            Assert.assertEquals(student.getTotalStudyTime(), 16.0, 2);
        }
    }
}
