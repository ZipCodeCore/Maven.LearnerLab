package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void getIdTest() {
        Person testPerson = new Person(500, "Name");

        long expected = 500;
        long actual = testPerson.getId();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNameTest() {
        Person testPerson = new Person(0, "Name");
        testPerson.setName("The Mill");
        String expected = "The Mill";
        String actual = testPerson.getName();
        Assert.assertEquals(expected, actual);

    }

}
