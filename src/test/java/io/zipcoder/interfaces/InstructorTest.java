package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class InstructorTest {
    @Test
    public void testImplementation(){
        Instructor instructor = new Instructor(null,null);
        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance(){
        Instructor instructor = new Instructor(null,null);
        Assert.assertTrue(instructor instanceof Person);
    }
    @Test
    public void testTeach() {
        Instructor instructor = new Instructor(null,null);
        Student student = new Student(null,null);
        Double expected = 10D;
        instructor.teach(student,expected);

        Assert.assertEquals(expected,student.getTotalStudyTime());
    }

    @Test
    public void testLecture() {
        Instructor instructor = new Instructor(null, null);
        Student student = new Student(null, null);
        Student student2 = new Student(null, null);
        Student student3 = new Student(null, null);
        Learner[] students = {student, student2, student3};
        Double numberOfHours = 9D;
        Double totalHoursSplit = numberOfHours / students.length;

        instructor.lecture(students, numberOfHours);
        Assert.assertEquals(totalHoursSplit, student.getTotalStudyTime());
    }
}