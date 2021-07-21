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
        Instructor instructor = new Instructor(0, "Leon");
        Learner learner = new Student(0, "Stephen", 8.0);
        //when

        //then

    }

}
