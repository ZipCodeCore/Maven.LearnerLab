package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPeople {

    People people = Students.getInstance();

    @Test
    public void testAdd() {
        //given
        Person person = new Person(0L, "Bo");
        //when
        people.add(person);
        //then
        Assert.assertTrue(people.contains(person));
    }

    @Test
    public void testRemove() {
        //given
        Person person = new Person(0L, "Bo");
        //when
        people.add(person);
        people.remove(person);
        //then
        Assert.assertFalse(people.contains(person));
    }

    @Test
    public void testFindById() {
        //given
        Person person = new Person(0L, "Bo");
        //when
        people.add(person);
        Person actual = people.findByID(0L);
        //then
        Assert.assertEquals(person, actual);
    }
}
