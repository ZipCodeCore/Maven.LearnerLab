package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void PersonConstructorTest(){
        Long id = Long.MAX_VALUE;
        String name = "Tacodog";
        Person person = new Person(id, name);

        Long expectedId = id;
        Long actualId = person.getId();

        String expectedName = "Tacodog";
        String actualName = person.getName();

        Assert.assertEquals(expectedId, actualId);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void TestSetName(){
        Long id = Long.MIN_VALUE;
        String name = "Tacocat";
        Person person = new Person(id, name);

        String expectedName = name;

        String actualName = person.getName();

        Assert.assertEquals(expectedName, actualName);
    }
}
