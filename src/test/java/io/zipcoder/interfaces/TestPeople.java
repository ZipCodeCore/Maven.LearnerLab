package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class TestPeople {
    People people = new People();
    Person p1 = new Person(001);
    Person p2 = new Person(002);

    @Test
    public void testAdd() {
        people.add(p1);

        int expected = 1;
        int actual = people.getCount();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemove() {
        people.add(p1);
        people.add(p2);
        people.remove(p1);

        int expected = 1;

        int actual = people.getCount();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFindById() {
        people.add(p1);
        people.add(p2);

        Person expected = p2;

        Person actual = people.findById(002);
    }
}
