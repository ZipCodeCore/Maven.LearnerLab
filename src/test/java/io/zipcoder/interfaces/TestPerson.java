package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    Person testPerson = new Person(100,"Rick");

    @Test
    public void getIdTest(){

        long expected = 100;
        long actual = testPerson.getId();

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void getNameTest(){
        String expected = "Steve";
        testPerson.setName("Steve");
        String actual = testPerson.getName();

        Assert.assertEquals(expected,actual);
    }

}
