package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;


public class TestPerson {
    Person person = new Person(001);


    @Test
    public void testGetId(){
        long expected = 001;
        long actual = person.getId();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetName(){
        String expected = "Test name";
        person.setName(expected);
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }
}
