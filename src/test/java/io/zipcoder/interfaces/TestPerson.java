package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    Person testPerson = new Person(12);

    @Test
    public void constructorTestID() {
        // Given
        long expected = 12;

        // When
        long actual = testPerson.getId();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setNameTest() {
        // Given
        testPerson.setName(("Eric"));
        String expected = "Eric";

        // When
        String actual = testPerson.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

}
