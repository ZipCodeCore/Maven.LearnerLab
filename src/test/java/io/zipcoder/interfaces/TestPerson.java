package io.zipcoder.interfaces;
import org.junit.*;

public class TestPerson {

    @Test
    public void testConstructor(){
        Person person = new Person(1234, "jack");

        long expected = 1234;

        long actual = person.getId();

        Assert.assertEquals(expected, actual);

    }
    @Test
    public void testSetName(){
        Person personName = new Person(1234,"jack");

        String expected = "jack";

        String actual = personName.getName();

        Assert.assertEquals(expected, actual);
    }

}
