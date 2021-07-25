package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void constructorTest() {
        // Given
        long expectedId = 5;
        String expectedName = "Bob";

        // When
        Person person = new Person(expectedId, expectedName);
        long actualId = person.getId();
        String actualName = person.getName();

        // Then
        Assert.assertEquals(expectedId, actualId);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void setNameTest() {
        // Given
        Person person = new Person(5, "Allen");
        String expectedName = "Bob";

        // When
        person.setName(expectedName);
        String actualName = person.getName();

        // Then
        Assert.assertEquals(expectedName, actualName);
    }
}
