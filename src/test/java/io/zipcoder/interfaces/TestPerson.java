package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testConstructor() {
        long personID= 721952324;
        Person person = new Person(personID);
        long expected = personID;
        long actual = person.getId();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testSetName() {
        String personName = "Namor";
        long personID = 721952324;
        Person person = new Person(personID);
        String expected = personName;
        person.setName(personName);
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

}
