package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    /*Create a testConstructor method which
    ensures that a Person object's id field
    is being set upon construction.
     */
    @Test
    public void getIDTest()
    {
        Person person1 = new Person(888);

        long expected = 888;
        long actual = person1.getID();
        Assert.assertEquals(expected, actual);

    }


    @Test
    public void secondConstructor(){

        Person person3 = new Person("Linda",321);
        String expected = "Linda";
        String actual = person3.getName();
        Assert.assertEquals(expected,actual);
    }

    /* Create a testSetName method which ensures that a
    Person object's name variable is being set by
    invoking the .setName method. */

    @Test
    public void setNameTest()
    {
        Person person2 = new Person(1);
        person2.setName("linda");

        String expected = "linda";
        String actual = person2.getName();
        Assert.assertEquals(expected, actual);

    }
}

