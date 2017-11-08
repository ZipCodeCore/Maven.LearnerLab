package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void PersonConstructorTest1() {
        Person person = new Person(1, "Brian");
        long expectedId = 1;
        long actualId = person.getId();
        Assert.assertEquals(expectedId, actualId);
    }

    @Test
    public void PersonConstructorTest2() {
        Person person = new Person(1, "Brian");
        String expectedName = "Brian";
        String actualName = person.getName();
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void setNameTest() {
        Person person = new Person(1, "Brian");
        person.setName("Brian");
        String expectedName = "Brian";
        String actualName = person.getName();
        Assert.assertEquals(expectedName, actualName);
    }



}
