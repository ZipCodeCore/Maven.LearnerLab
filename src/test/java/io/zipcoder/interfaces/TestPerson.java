package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testConstructor() {
        //given
        long expectedId = 0;
        String expectedName = "Tyler";
        //when
        Person person = new Person(expectedId, expectedName);
        long actualId = person.getId();
        String actualName = person.getName();
        //then
        Assert.assertEquals(expectedId, actualId);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testSetName() {
        //given
        String expectedName = "Stephen";
        //when
        Person person = new Person(0, expectedName);
        String actualName = person.getName();
        //then
        Assert.assertEquals(expectedName, actualName);
    }

}
