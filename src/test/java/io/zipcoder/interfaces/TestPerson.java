package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {
    @Test
    public void testConstructor1(){
        //given
        String expectedName = "BillyBob";
        long expectedId = 2;
        Person person = new Person(expectedId, expectedName);
        //when
        String actualName = person.getName();
        long actualId = person.getId();
        //then
        Assert.assertEquals(expectedId, actualId);
        Assert.assertEquals(expectedName, actualName);
    }
    @Test
    public void testSetName(){
        //given
        String expectedName = "BillyBob";
        Person person = new Person(1, expectedName);
        //when
        String actualName = person.getName();
        //then
        Assert.assertEquals(expectedName, actualName);
    }

}
