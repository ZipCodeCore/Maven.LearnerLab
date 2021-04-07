package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestEducator {
    @Test
    public void testTeach() {
        Student student = new Student(1L, "Morgan");
        Educator.INSTRUCTOR0.teach(student, 100.0);
        Assert.assertEquals(student.getTotalStudyTime(), Educator.INSTRUCTOR0.getTimeWorked(), 0.00);
    }

    @Test
    public void testLecture() {
        Student student1 = new Student(1, "Morgan");
        Student student2 = new Student(2, "Jose");
        Student[] students = {student1, student2};
        Double numberOfHours = 40.0;
        Double expected = numberOfHours/students.length;

        Educator.INSTRUCTOR1.lecture(students, 40.0);

        Assert.assertEquals(expected, student1.getTotalStudyTime());
        Assert.assertEquals(expected, student2.getTotalStudyTime());
    }

    @Test
    public void testGetTimeWorked() {
        Student student = new Student(2, "Bobby");
        Double expected = 100.0;
        Educator.INSTRUCTOR0.teach(student, 100.0);
        Assert.assertEquals(expected, Educator.INSTRUCTOR0.getTimeWorked());
    }
}
