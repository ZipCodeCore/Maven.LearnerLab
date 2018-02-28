package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {
    Person person;

    @Test
    public void testConstructor(){
    //be careful with primitives and wrappers in testing
        long expected = 2147483649L;
        person = new Person(expected);
        long actual = person.getId();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setName() {

        person = new Person(5147483649L);
        //String name = "Katrice";
        String expected = "Katrice";


        person.setName("Katrice");

        String actual = person.getName();

        Assert.assertEquals(expected,actual);
    }
}