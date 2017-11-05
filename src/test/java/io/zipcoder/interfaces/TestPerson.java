package io.zipcoder.interfaces;

import org.junit.Test;
import org.junit.Assert;

public class TestPerson {
    @Test
    public void testConstructor() {
        //:given
        Person person = new Person(4);
        long expected = 4;
        //: when
        long actual = person.getId();

        //:then
        Assert.assertEquals(expected, actual);
    }


    @Test

    public void testSetName() {
        //:given
        Person person = new Person(4);
        person.setName("AJ");
        String expected = "AJ";

        //:when
        String actual = person.getName();

        //:then
        Assert.assertEquals(expected, actual);
    }


}
