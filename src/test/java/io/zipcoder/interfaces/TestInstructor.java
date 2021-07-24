package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    @Test
    public void testImplementation() {
        Instructor instructor = new Instructor(0, "Kyle");
        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance() {
        Instructor instructor = new Instructor(0, "Liz");
        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void testTeach() {
        //given
        double expected = 8.0;
        Instructor instructor = new Instructor(0, "Leon");
        Learner learner = new Student(0, "Stephen");
        //when
        instructor.teach(learner, 8.0);
        double actual = learner.getTotalStudyTime();
        //then
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testLecture() {
        //given
        double expected1 = 5.0;
        double expected2 = 5.0;
        double expected3 = 5.0;
        Learner learner1 = new Student(0, "Sabrina");
        Learner learner2 = new Student(1, "Nicolette");
        Learner learner3 = new Student(2, "Jason");
        //when
        Instructor instructor = new Instructor(0, "Ted");
        Learner[] learners = new Learner[]{learner1, learner2, learner3};
        instructor.lecture(learners, 15);
        double actual1 = learner1.getTotalStudyTime();
        double actual2 = learner2.getTotalStudyTime();
        double actual3 = learner3.getTotalStudyTime();
        //then
        Assert.assertEquals(expected1, actual1, 0.001);
        Assert.assertEquals(expected2, actual2, 0.001);
        Assert.assertEquals(expected3, actual3, 0.001);
    }
}
