package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void PersonConstructorTest(){
        Person personOne = new Person(1234L, "Maira");
        Long expectedId = 1234L;
        Long actualId = personOne.getId();
        String expectedName = "Maira";
        String actualName = personOne.getName();

        Assert.assertEquals(expectedId, actualId);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void setNameTest(){
        Person personOne = new Person(1234L, "Maira");
        personOne.setName("Brian");
        String expectedName = "Brian";
        String actualName = personOne.getName();

        Assert.assertEquals(expectedName,actualName);
    }
}
