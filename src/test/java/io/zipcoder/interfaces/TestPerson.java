package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testConstructor() {
        // Given
        Long expectedId = Long.MAX_VALUE;
        String expectedName = "Name Of Person";
        Person person = new Person(expectedId, expectedName);

        // When
        Long actualId = person.getId();
        String actualName = person.getName();

        // Then
        Assert.assertEquals(expectedId, actualId);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person(null,null);
        person.setName("Jawnay");

        String expectedName = "Jawnay";
        // When
        String actualName = person.getName();

        // Then
        Assert.assertEquals(actualName, expectedName);

    }
}
