package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testConstructor() {

        long expected = 101010;
        Person person = new Person(expected, null);

        long actual = person.getId();

        Assert.assertEquals(expected, actual, 0);
    }


    @Test
    public void testSetName() {
        Person person = new Person(101010, "Aaron");

        String expected = "Aaron";
        person.setName(expected);
        String actual = person.getName();

        Assert.assertEquals(expected, actual);
    }


}
