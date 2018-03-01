package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class PersonTest {

    private Person person;

    @Test
    public void PersonConstructorId() {
        // Given
        long expectedID = 0;
        String expectedName = null;
        // When
        person = new Person(expectedID, expectedName);
        long actualID = person.getId();
        // Then
        Assert.assertEquals(expectedID, actualID);
    }

    @Test
    public void getIDTest() {
        // Given
        long expectedID = -9223372036854775808L;
        String expectedName = "name";
        // When
        person = new Person(expectedID, expectedName);
        long actualID = person.getId();
        // Then
        Assert.assertEquals(expectedID, actualID);
    }

    @Test
    public void setNameTest() {
        // Given
        long expectedID = 0;
        String expectedName = "name";
        String expectedNewName = "newName";
        // When
        person = new Person(expectedID, expectedName);
        person.setName(expectedNewName);
        String actualName = person.getName();
        // Then
        Assert.assertEquals(expectedNewName, actualName);
    }

    @Test
    public void getNameTest() {
        // Given
        long expectedID = 9223372036854775807L;
        String expectedName = "name";
        // When
        person = new Person(expectedID, expectedName);
        String actualName = person.getName();
        // Then
        Assert.assertEquals(expectedName, actualName);
    }
}
