package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PersonTest {

    Person tester;

    @Before
    public void setup(){
        tester = new Person("Tester", 1);
    }

    @Test
    public void constructorNameTest(){
        String expected = "Tester";
        String actual = tester.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void constructorIDTest(){
        long expected = 1;
        long actual = tester.getId();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setNameTest(){
        String expected = "Tester";
        String actual = tester.getName();
        Assert.assertEquals(expected, actual);
    }

}
