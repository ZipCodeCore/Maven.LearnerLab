package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testConstructor() {
        Person person = new Person(1234);
        long expected = 1234;
        long actual = person.getId();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetName() {
        Person person = new Person(1234);
        person.setName("Rufus");
        String expected = "Rufus";
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

}
