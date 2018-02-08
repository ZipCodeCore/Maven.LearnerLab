package io.zipcoder.interfaces;

import org.junit.Test;
import org.junit.Assert;

public class InstructorTest {
    Instructor instructor = new Instructor();
    Student student = new Student(1);

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
        double expected = 20.0;
        instructor.teach(student, 20);
        double actual = student.getTotalStudyTime();
        Assert.assertEquals(expected, actual,0);
    }

    @Test
    public void testLecture(){
        Student student1 = new Student(1);
        Learner[] learners = {student1};
        double expected = 20.0;
        instructor.lecture(learners, 10);
        double actual = student1.getTotalStudyTime();
        Assert.assertEquals(expected, actual,0);
    }
}