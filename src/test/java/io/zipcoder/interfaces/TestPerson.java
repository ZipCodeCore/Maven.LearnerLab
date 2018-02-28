package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testContructor(){
        //Given
        long expectedId = 5L;

        //When
        Person person = new Person(expectedId);
        long actualId = person.getId();

        //Then
        Assert.assertEquals(expectedId,actualId);

    }

    @Test
    public void testSetName(){
        //Given
        String expected = "TestName";
        Person person = new Person(7L);

        //When
        person.setName(expected);
        String actual = person.getName();

        //Then
        Assert.assertEquals(expected, actual);

    }
}

