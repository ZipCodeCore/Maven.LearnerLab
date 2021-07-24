package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testConstructor() {
        //given
        String expectedName = "rameez";
        Long id = 4l;
        Person person = new Person(4l, "rameez");
        //when
        String actual = person.getName();
        //then
        Assert.assertEquals(expectedName, actual);
    }

    @Test
    public void testConstructorForId() {
        //given
        String expectedName = "rameez";
        Long expectedId = 4l;
        Person person = new Person(4l, "rameez");
        //when
        Long actual = person.getId();
        //then
        Assert.assertEquals(expectedId, actual);
    }

    @Test
    public void testSetName() {
        //given

        Long id = 4l;
        Person person = new Person(4l, "rameez123");
        String expectedName = "rameez";
        //when
        person.setName(expectedName);
        String actual = person.getName();
        //then
        Assert.assertEquals(expectedName, actual);
    }
}
