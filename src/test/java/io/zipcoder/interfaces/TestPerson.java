package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testConstructor() {
        Person person = new Person(7);
        long expected = 7;
        long actual = person.getId();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetName(){
        Person person = new Person(74);
        String expected = "Bob";
        person.setName("Bob");
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }
}
