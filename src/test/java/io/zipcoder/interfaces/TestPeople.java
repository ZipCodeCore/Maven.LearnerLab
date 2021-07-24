package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPeople {

    @Test
    public void testAdd() {
        //given
        People people = new People();
        Person person = new Person(0L, "Bo");
        //when
        people.add(person);
        //then
        Assert.assertTrue(people.contains(person));
    }

    @Test
    public void testRemove() {
        //given
        People people = new People();
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
        People people = new People();
        Person person = new Person(0L, "Bo");
        //when
        people.add(person);
        Person actual = people.findByID(0L);
        //then
        Assert.assertEquals(person, actual);
    }
}
