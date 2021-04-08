package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class InstructorTest {

    @Test
    public void testImplementation() {
        //Given
        Instructor instructor = new Instructor(00045);
        //When
        Assert.assertTrue(instructor instanceof Teacher);

    }

    @Test
    public void testInheritance() {
        //Given
        Instructor instructor = new Instructor(00045);
        //Then
        Assert.assertTrue(instructor instanceof Person);

    }


    @Test
    public void teach() {
        //Given
        Instructor instructor = new Instructor(123);
        Student student = new Student(1222);
        //When
        instructor.teach(student, 4);
        double expected = 4;
        double actual = student.getTotalStudyTime();
        //Then
        Assert.assertEquals(expected, actual, .001);
    }

    @Test
    public void lecture() {
        //Given
        Teacher teacher = new Instructor(123);
        Student[] learner = new Student[4];
        double numberOfHours = 8;
        //When
        learner[0] = new Student(12);
        learner[1] = new Student(13);
        learner[2] = new Student(14);
        learner[3] = new Student(15);
        teacher.lecture(learner, numberOfHours);


        double numberOfHoursPerLearner = numberOfHours / learner.length;
        //had to downcast in order to get student method of getTotalStudyTime
        double actual = (learner[0]).getTotalStudyTime();
        //Then
        Assert.assertEquals(numberOfHoursPerLearner, actual, .001);
    }
}