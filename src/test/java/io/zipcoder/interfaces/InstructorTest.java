package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class InstructorTest {
    @Test
    public void testImplementation(){
        Instructor instructor = new Instructor(null,null);
        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance(){
        Instructor instructor = new Instructor(null,null);
        Assert.assertTrue(instructor instanceof Person);
    }
    @Test
    public void testTeach() {
    }

    @Test
    public void testLecture() {
    }
}