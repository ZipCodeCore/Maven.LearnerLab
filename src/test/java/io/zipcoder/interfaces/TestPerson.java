package io.zipcoder.interfaces;

import io.zipcoder.interfaces.Person.Person;
import org.junit.Assert;
import org.junit.Test;

public class TestPerson {
    @Test
    public void testConstructor() {
        Person p = new Person(9);
        long expected = 9;
        long actual = p.getId();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetName() {
        Person p = new Person(9);
        String expected = "Mythra";
        p.setName(expected);
        String actual = p.getName();

        Assert.assertEquals(expected, actual);
    }
}
