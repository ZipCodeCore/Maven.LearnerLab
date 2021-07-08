package io.zipcoder.interfaces;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class EducatorTest {
    Instructor instructor = new Instructor(0);
    Educator tariq = Educator.TARIQ;
    Educator leon = Educator.LEON;
    Educator nhu = Educator.NHU;
    Educator kris = Educator.KRIS;

    @Test
    public void testImplementationt() {
        assertTrue(tariq instanceof Teacher);
    }

    @Test
    public void testImplementationl() {
        assertTrue(leon instanceof Teacher);
    }

    @Test
    public void testImplementationn() {
        assertTrue(nhu instanceof Teacher);
    }

    @Test
    public void testImplementationk() {
        assertTrue(kris instanceof Teacher);
    }

    @Test
    public void testTeach() {
        Student student = new Student();
        tariq.teach(student, 5.7);
        assertEquals(5.7, student.getTotalStudyTime(), 0.001);
    }

    @Test
    public void testLecture() {
        Student[] students = new Student[5];
        students[0] = new Student(56580);
        students[1] = new Student(56581);
        students[2] = new Student(56582);
        students[3] = new Student(56583);
        students[4] = new Student(56584);

        leon.lecture(students, 100.7);
        for (Student student : students) {
            assertEquals(100.7 / students.length, student.getTotalStudyTime(), 0.001);
        }
    }
}
