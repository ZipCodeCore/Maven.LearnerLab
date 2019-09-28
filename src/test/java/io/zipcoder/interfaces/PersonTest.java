package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void getId() {
        Long expected = 1000000L;
        Person me = new Person("Katrina", expected);
        Long actual = me.getId();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getName() {
        String expected = "Katrina";
        Person me = new Person(expected,1000000L) ;
        String actual = me.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setName() {
        String expected = "Katrina";
        Person me = new Person(expected, 1000000L);
        me.setName(expected);
        String actual = me.getName();
        Assert.assertEquals(expected,actual);
    }
}

