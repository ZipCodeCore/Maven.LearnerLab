package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {
    @Test

    public void testConstructor(){
        Person person = new Person(12345,"Lina");
        String expected = "Lina";
        String actual = person.getName();
        Assert.assertEquals(expected,actual);

        long expected2= 12345;
        long actual2=person.getId();
        Assert.assertEquals(expected2,actual2);

        person.setName("Merin");
        String expected3 = "Merin";
        String actual3= person.getName();
        Assert.assertEquals(expected3,actual3);
    }
}
