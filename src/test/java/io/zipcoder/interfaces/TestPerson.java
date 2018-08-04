package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestPerson {
    private String name;
    private Person person;
    @Before
    public void setUp() throws Exception {
         name = "Sally";

        person = new Person(9);
    }
    @Test
    public void setNameTest(){
        person.setName(name);
        String expected = name;
        String actual = person.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getIdTest(){

        long expected = 9;
        long actual = person.getid();

        Assert.assertEquals(expected, actual);
    }

}
