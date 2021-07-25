package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

/**
 * Create a testLecture method that ensures when an Instructor invokes the lecture method, a respective
 * array of students' totalStudyTime instance variables is incremented by numberOfHours/students.length.
 */

public class TestInstructor {
    @Test
    public void implementationTest(){
        //given
        Instructor instructor = new Instructor(null,null);

        //when
        Boolean check1 = instructor instanceof Teacher;
        Boolean check2 = instructor instanceof Person;

        //then
        Assert.assertTrue(check1);
        Assert.assertTrue(check2);

    }
    @Test
    public void teachTest(){
        //given
        Instructor instructor = new Instructor(null,null);
        Student student = new Student(null, null);

        //when
        instructor.teach(student, 20.0);
        Double actual = student.getTotalStudyTime();
        Double expected = 20.0;

        //then
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void lectureTest(){
        //given
        Instructor instructor = new Instructor(null, null);
        Learner[] learners = new Learner[20];

        //when
        instructor.lecture(learners, 10.0);
        Double actual = learners
        //then

    }


}
