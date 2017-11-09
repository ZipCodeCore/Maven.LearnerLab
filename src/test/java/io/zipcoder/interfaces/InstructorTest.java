package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class InstructorTest {

    @Test
    public void testImplementation(){
        Instructor instructor = new Instructor(859, "Rob");
        boolean expected = true;
        boolean actual;
        if (instructor instanceof Teacher){
            actual = true;
        } else {
            actual = false;
        }

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testInheritance(){
        Instructor instructor = new Instructor(542, "Karen");
        boolean expected = true;
        boolean actual;
        if (instructor instanceof Person){
            actual = true;
        } else {
            actual = false;
        }

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testTeach(){
        Student student = new Student(9921, "Rob");
        Instructor instructor = new Instructor(91, "Mark");
        instructor.teach(student, 11);

        double expected = 11;
        double actual = student.getTotalStudyTime();

        Assert.assertEquals(expected, actual, 0);

    }

    @Test
    public void testLecture(){
        Student[] students = {new Student(23, "Rob"), new Student(13, "Larry"), new Student(12, "Lauren")};
        Instructor instructor = new Instructor(1, "Ralph");
        instructor.lecture(students, 12);

        double expected = 4;
        double actual = students[0].getTotalStudyTime();

        Assert.assertEquals(expected, actual, 0);

    }

}