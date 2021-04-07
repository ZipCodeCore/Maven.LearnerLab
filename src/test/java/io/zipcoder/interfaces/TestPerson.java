package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {
    @Test
    public void testConstructor() {
        Long expectedId = Long.valueOf(5);
        String expectedName = "Wes";
        Person person = new Person(expectedId, expectedName);
        Long actualId = person.getId();
        String actualName = person.getName();
        Assert.assertEquals(expectedId, actualId);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testSetName() {
        Long expectedId = Long.valueOf(5);
        String expectedName = "Wes";
        Person person = new Person(expectedId, expectedName);
        person.setName("newname");
        Assert.assertEquals("newname", person.getName());
    }
}
