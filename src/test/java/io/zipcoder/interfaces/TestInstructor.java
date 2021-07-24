package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    @Test
    public void testImplementation(){
        Instructor instructor = new Instructor(10L, "SomeoneWhoCares");

        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance(){
        Instructor instructor = new Instructor(15L, "LiterallyAnyoneElse");

        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void testTeach(){
        Instructor instructor = new Instructor(5L, "Available");

        Learner learner = new Student(1L, "Pordy");
        instructor.teach(learner, 10.00);

        Double actual = learner.getTotalStudyTime();
        Double expected = 10.00;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testLecture(){
        Instructor instructor = new Instructor(7L, "AnotherBootcampInstructor");

        Learner[] learners = {new Student(2L, "AAA"), new Student(3L, "BBB")};
        instructor.lecture(learners, 10.00);

        Double actual = 5.00;
        Double expected = learners[0].getTotalStudyTime();

        Assert.assertEquals(expected, actual);
    }
}
