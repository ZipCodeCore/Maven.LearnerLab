package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testPerson() {

    }

    @Test
    public void testConstructor() {
        Person person = new Person(2);
        long expected = 2;
        long actual = person.getId();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetName() {
    }

}

//
//    @Test
//    public void testSetName() {
//        Person person = new Person(2);
//        String expected = person.setName();
//        String actual = person.setName();
//        Assert.assertEquals(expected, actual);
//    }