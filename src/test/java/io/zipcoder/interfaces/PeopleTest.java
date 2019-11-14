package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PeopleTest {
    People testPerson;

    @Test
    public void testAdd() {
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
    public void testFindById() {
        testPerson = new People();
        Person person = new Person(32L,"Joe");

        testPerson.add(person);

        Assert.assertEquals(person,testPerson.findById(32L));
        Assert.assertNotEquals(person,testPerson.findById(31L));
    }

    @Test
    public void testRemove() {
        testPerson = new People();
        Person person = new Person(32L,"Joe");
        Person person1 = new Person(30L,"Jack");

        testPerson.add(person);
        testPerson.add(person1);

        Integer expected = 1;
        testPerson.remove(32L);
        Integer actual = testPerson.count();

        Assert.assertEquals(expected,actual);
    }
}