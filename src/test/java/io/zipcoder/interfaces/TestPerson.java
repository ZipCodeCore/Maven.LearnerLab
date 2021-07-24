package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void constructorTest() {
    long expectedId = 10;
    String expectedName = "Calvin";

    Person person = new Person(10, "Calvin");
    long actualId = person.getId();
    String actualName = person.getName();

    Assert.assertEquals(expectedId, actualId);
    Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void setNameTest () {
        String expected = "Alfred";

        Person person = new Person();
        person.setName("Alfred");
        String actual = person.getName();

        Assert.assertEquals(expected, actual);
    }
}
