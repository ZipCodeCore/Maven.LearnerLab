package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void testConstructor(){
        //Given
        Person person = new Person(11234);

        //When
        long expected = 11234;
        long actual = person.getId();

        //Then
        Assert.assertEquals(expected, actual);



    }

    @Test
    public void testSetName() {
        //Given
        Person person = new Person(123456789);
        person.setName("Sally Sue");

        //When
        String expected = "Sally Sue";
        String actual = person.getName();

        //Then
        Assert.assertEquals(expected, actual);


    }
}