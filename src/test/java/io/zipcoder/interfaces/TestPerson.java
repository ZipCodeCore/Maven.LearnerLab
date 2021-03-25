package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestPerson {
    Person person;

    @Before
    public void testConstructor() {
        person = new Person(01, "Johnny");
    }

    @Test
    public void testSetName(){
        String expectedName = "Johnny";
        long expectedId = 01;

        String actualName = person.getName();
        long actualId = person.getId();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedId, actualId);
    }





}
