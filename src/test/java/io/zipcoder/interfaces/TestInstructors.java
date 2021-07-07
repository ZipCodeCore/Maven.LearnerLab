package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestInstructors {

    @Test
    public void test(){
        Instructors instance = Instructors.getInstance();
        Instructor instructor1 = new Instructor("Kris",1);
        instance.add(instructor1);

        String expected = "Kris";
        String actual  = instance.findById(1).getName();

        Assert.assertEquals(expected,actual);


    }



    @Test
    public void getInstance() {
    }
}