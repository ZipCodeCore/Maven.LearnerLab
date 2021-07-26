package io.zipcoder.interfaces;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestPeople extends TestCase {
    People people = Students.getInstance();

    @Test
    public void testAdd() {
        //given
        Person person = new Person(5L, "Dips");
        //when
        people.add(person);
        //then
        Assert.assertTrue(people.contains(person));
    }

    @Test
    public void testRemove() {
        //given
        Person person = new Person(5l, "Dips");
        //when
        people.add(person);
        people.remove(person);
        //then
        Assert.assertFalse(people.contains(person));
    }

    @Test
    public void testFindById() {
        //given
        Person expectedValue = new Person(9L, "Dolio");
        //when
        people.add(expectedValue);
        Person actualValue = people.findByID(9L);
        //then
        Assert.assertEquals(expectedValue, actualValue);
    }
}