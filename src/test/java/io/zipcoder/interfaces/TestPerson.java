package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testConstructor(){
        Person person = new Person(234, "Rob");
        long expectedID = 234;
        long actualID = person.getId();
        Assert.assertEquals(expectedID, actualID);
    }

    @Test
    public void testSetName(){
        Person person = new Person(312, "Rob");
        person.setName("Randy");
        String expected = "Randy";
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorName(){
        Person person = new Person(8294, "Larry");
        String expectedName = "Larry";
        String actualName = person.getName();
        Assert.assertEquals(expectedName, actualName);
    }

}
