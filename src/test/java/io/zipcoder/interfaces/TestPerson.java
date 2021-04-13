package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testConstructor(){
        Long expectedId = 34L;
        String expectedName = "Gau";
        Person person = new Person( expectedId , expectedName);
        Long actualId = person.getId();
        String actualName = person.getName();

        Assert.assertEquals(expectedId,actualId);
        Assert.assertEquals(expectedName,actualName);
    }

    @Test
    public void testSetName(){
        Person person = new Person( null , null);
        String expected = "Gau";
        person.setName(expected);
        String actual = person.getName();

        Assert.assertEquals(expected,actual);
    }

}
