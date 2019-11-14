package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PeopleTest {
    People testPerson;

    @Test
    public void add() {
        testPerson = new People();
        Person person = new Person(32L,"Joe");
        Integer actual;

        Integer expected = 0;
        actual = testPerson.count();

        Assert.assertEquals(expected,actual);

        testPerson.add(person);
        expected = 1;
        actual = testPerson.count();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void findById() {
    }

    @Test
    public void remove() {
    }
}