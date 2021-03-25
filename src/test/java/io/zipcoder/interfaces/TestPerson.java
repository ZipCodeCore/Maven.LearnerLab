package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void constructorTest(){
        Long expectedId = 90L;
        String expectedName = "Sandy";
        Person newPerson = new Person(expectedId, expectedName);

        Long actualId = newPerson.getId();
        String actualName = newPerson.getName();

        Assert.assertEquals(expectedId, actualId);
        Assert.assertEquals(expectedName, actualName);

    }

    @Test
    public void setNameTest(){
        Person newPerson = new Person(10L, "");
        String expected = "Sandy";

        newPerson.setName(expected);
        String actual = newPerson.getName();

        Assert.assertEquals(expected, actual);

    }


}
