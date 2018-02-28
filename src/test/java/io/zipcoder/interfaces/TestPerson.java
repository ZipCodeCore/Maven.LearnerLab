package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {


    @Test
    public void testGetID() {
        // Given
        long expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        long actual = person.getId();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected, 9);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person(9);
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }


}
