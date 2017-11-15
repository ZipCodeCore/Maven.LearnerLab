package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testGetId(){
        //Given
        Person person = new Person(123456789, "Jeff");
        //When
        long expected = 123456789;
        //Then
        long actual = person.getId();

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void testGetName(){
        //Given
        Person person = new Person(123456, "Jeff");
        //When
        String expected = "Jeff";
        //Then
        String actual = person.getName();


        Assert.assertEquals(expected, actual);

    }


    @Test
    public void testSetName() {

        //Given
        Person person = new Person(123456789, "Jackson");
        //When
        String expected = "Jackson";
        //Then
        String actual = person.getName();

        Assert.assertEquals(expected, actual);

    }



}
