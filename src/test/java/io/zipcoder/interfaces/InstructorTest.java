package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class InstructorTest {

    Instructor instructor;

    @Test
    public void implementationTest(){
        Instructor i = new Instructor();
        Assert.assertTrue(i instanceof Instructor);
    }
    @Test
    public void inheritanceTest(){
        Instructor i = new Instructor();
        Assert.assertTrue(i instanceof Person);
    }
    @Test
    public void teachTest(){

    }
    @Test
    public void lectureTest(){

    }
}
