package io.zipcoder;

import io.zipcoder.interfaces.Learner;
import io.zipcoder.interfaces.Teacher;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InstructorTest {

    Instructor instructor;
    Student student;
    Student student2;

    @Before
    public void setup(){
        instructor = new Instructor();
        student = new Student("Jill", 1);
        student2 = new Student("Bill", 2);
    }

    @Test
    public void testImplementation(){
        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance(){
        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void teachTest(){
        instructor.teach(student, 2);
        double expected = 2.0;
        double actual = student.getTotalStudyTime();
        Assert.assertEquals(actual, expected, 0);
    }

    @Test
    public void lectureTest(){
        Learner[] learnerArray = new Learner[2];
        learnerArray[0] = student;
        learnerArray[1] = student2;
        instructor.lecture(learnerArray, 2);
        Assert.assertEquals(student.getTotalStudyTime(), student2.getTotalStudyTime(), 0);
    }

}
