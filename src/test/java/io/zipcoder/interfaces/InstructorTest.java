package io.zipcoder.interfaces;

import interfaces.Teacher;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class InstructorTest {
    Instructor testInstructor;

    @Test
    public void testImplementation(){
        testInstructor = new Instructor(32L,"John");

        Assert.assertTrue(testInstructor instanceof Teacher);
    }

    @Test
    public void testInheritance(){
        testInstructor = new Instructor(32L,"John");

        Assert.assertTrue(testInstructor instanceof Person);
    }

    @Test
    public void teach() {
    }

    @Test
    public void lecture() {
    }
}