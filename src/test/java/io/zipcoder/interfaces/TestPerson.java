package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    Person personTest;

    @Test
    public void personConstructorTest(){
        //Given
        Person personTest = new Person(1209384353L);

        //When
        long expected = 1209384353L;
        long actual = personTest.getId();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setNameTest(){
        //Given
        personTest = new Person(642123981238L);
        String name = "Stinky";

        //When
        personTest.setName("Stinky");

        String expected = "Stinky";
        String actual = personTest.getName();

        Assert.assertEquals(expected, actual);

    }

}
