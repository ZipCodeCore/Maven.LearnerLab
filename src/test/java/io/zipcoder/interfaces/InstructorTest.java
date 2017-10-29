package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class InstructorTest {

    Instructor aInstructor;

    @Before
    public void setUp(){
        aInstructor = new Instructor("Tariq",1);
    }

    @Test
    public void testImplementation() {

        Assert.assertTrue(aInstructor instanceof Teacher);
    }

    @Test
    public void testInheritance() {
        Assert.assertTrue(aInstructor instanceof Person);
    }

    @Test
    public void testTeach() {
        Student aStudent = new Student("Andrew",1);
        double expected = 1.0;
        aInstructor.teach(aStudent,1.0);
        double actual = aStudent.getTotalStudyTime();
        Assert.assertEquals(expected,actual, 0.001);
    }

    @Test
    public void testLecture() {
        Student aStudent = new Student("Andrew",1);
        Learner[] listOfStudents= {aStudent};

        double expected = 1.0;
        aInstructor.lecture(listOfStudents,1.0);
        double actual = aStudent.getTotalStudyTime();
        Assert.assertEquals(expected, actual,0.001);
    }
}

