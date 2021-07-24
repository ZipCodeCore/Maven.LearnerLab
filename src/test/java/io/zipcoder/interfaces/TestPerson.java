package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testConstructor(){
        Person person = new Person(100L, "Joe");

        String actualName = person.getName();
        String expectedName = "Joe";

        Long actualId = person.getId();
        Long expectedId = 100L;

        Assert.assertEquals(actualId, expectedId);
        Assert.assertEquals(actualName, expectedName);
    }

    @Test
    public void testSetName(){
        Person person = new Person(200L, "Bonnie");

        person.setName("Kara");

        String actualName = person.getName();
        String expectedName = "Kara";

        Assert.assertEquals(actualName, expectedName);
    }
}
