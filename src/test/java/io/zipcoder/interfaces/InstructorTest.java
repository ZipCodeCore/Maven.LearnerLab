package io.zipcoder.interfaces;

import org.junit.Test;
import org.junit.Assert;

public class InstructorTest {
    Instructor instructor = new Instructor(001);

    @Test
    public void testImplementation(){
       boolean expected = true;
       boolean actual = instructor instanceof Teacher;
       Assert.assertEquals(expected, actual);
    }

    @Test
    public void testInheritance(){
        boolean expected = true;
        boolean actual = instructor instanceof Person;
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testTeach(){
        Student student = new Student(001);
        double expected = 20;
        instructor.teach(student, 10);
        double actual = student.getTotalStudyTime();
        Assert.assertEquals(expected, actual,0);
    }

    @Test
    public void testLecture(){
        Student student = new Student(001);
        double expected = 70;
        instructor.teach(student, 80);
        double actual = 70;
        Assert.assertEquals(expected, actual,0);


    }
}