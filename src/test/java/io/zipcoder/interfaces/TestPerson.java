package io.zipcoder.interfaces;

import org.junit.jupiter.api.Test;
import org.junit.Assert;

public class TestPerson {
    @Test
    public void testConstructor_ID() {
        //: Given
        Person person = new Person(123);
        long expected = 123;

        //: When
        long actual = person.getId();

        //: Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructor_Name() {
        Person person = new Person(123);
        String expected = null;

        String actual = person.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetName() {

        Person person = new Person(123);
        String expected = "Bob";

        person.setName("Bob");
        String actual = person.getName();

        Assert.assertEquals(expected, actual);
    }


}
