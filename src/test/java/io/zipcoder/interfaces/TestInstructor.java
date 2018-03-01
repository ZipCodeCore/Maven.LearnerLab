package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestInstructor {

    @Test
    public void test(){
        Instructors instance = Instructors.getInstance();
        Person perosn1 = new Person("Kris",1);
        instance.add(perosn1);

        String expected = "Kris";
        String actual  = instance.findById(1).getName();

        Assert.assertEquals(expected,actual);


    }



    @Test
    public void getInstance() {
    }
}