package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {
    @Test
    public void testConstructor(){
        //Given
        Person person = new Person(82l, "John");

        //When
        long expectedId = 82;
        String expectedName = "John";

        //Then
        Assert.assertEquals(expectedId, person.getid());
        Assert.assertEquals(expectedName, person.getName());

    }

    @Test
    public void testSetName(){
        //Given
        Person person = new Person(24l, "John");
        String expectedName = "John";

        //When
        person.setName(expectedName);
        String actualName = person.getName();

        //Then
        Assert.assertEquals(expectedName, actualName);

    }

}
