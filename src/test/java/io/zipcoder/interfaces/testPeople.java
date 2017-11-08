package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class testPeople {

    @Test
    public void testAdd() {
        Person person = new Person();
        People people = new People();
        people.add(person);
        int expectedSize = 1;
        int actualSize = people.getCount();
        Assert.assertEquals(expectedSize,actualSize);
    }

    @Test
    public void testRemove() {
        People people = new People();
        Person person = new Person();
        people.add(person);
        people.remove(person);
        int expectedSize = 0;
        int actualSize = people.getCount();
        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void testFindById() {
        Person brian = new Person(100, "Brian");
        People people = new People();
        people.add(brian);
        Person expected = brian;
        Person actual = people.findById(100);
        Assert.assertEquals(expected, actual);
    }
}
