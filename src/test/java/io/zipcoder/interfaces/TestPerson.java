package io.zipcoder.interfaces;

import io.zipcoder.interfaces.Class.Person;
import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testConstructor(){
        // expected
        long expectedId = 123;
        Person wes = new Person(expectedId);
        //actual
        long actualId = wes.getId();
        //test
        Assert.assertEquals(expectedId,actualId);

    }

    @Test
    public void testSetName(){
        //expected
        long expectedId = 123;
        Person wes = new Person(expectedId);
        String expectedName = "wes";
        //actual
        wes.setName(expectedName);
        String actualName = wes.getName();
        //test
        Assert.assertEquals(expectedName,actualName);
    }

    @Test
    public void testConstructorWithName(){
        //expected
        long expectedId = 123;
        String expectedName = "wes";
        Person wes = new Person(expectedId,expectedName);
        //actual
        String actualName = wes.getName();
        //test
        Assert.assertEquals(expectedName,actualName);
    }
}
