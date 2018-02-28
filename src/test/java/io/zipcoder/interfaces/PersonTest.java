package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {
    Person personTest;

    @Before
    public void setup(){
        personTest =new Person("Micheal",100L);
    }

    @Test
    public void getIdTest() {
        long expected = 100l;
        long actual =personTest.getId();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setNameTest() {
        personTest.setName("Kibret");
        String expected  = "Kibret";
        String actual = personTest.getName();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getNameTest() {
        personTest.setName("Bravo");
        String expected = "Bravo";
        String actual = personTest.getName();
        Assert.assertEquals(expected,actual);

    }
}