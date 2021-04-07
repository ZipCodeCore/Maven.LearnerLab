package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestPeople {
    People<Person> people;
    Person person1, person2, person3;

    @Before
    public void setUp() {
        people = new ConcretePeople();
        person1 = new Person(3L, "rake");
        person2 = new Person(2L, "ferb");
        person3 = new Person(5L, "jimothy");
        people.add(person1);
        people.add(person2);
    }

    @Test
    public void testAdd1() {
        people.add(person3);
        Assert.assertTrue(people.contains(person3));
    }

    @Test
    public void testAdd2() {
        Person person4 = new Person(6L, "lump");
        people.add(person4);
        Assert.assertTrue(people.contains(person4));
    }

    @Test
    public void testRemove() {
        Assert.assertTrue(people.contains(person2));
        people.remove(person2);
        Assert.assertFalse(people.contains(person2));
    }

    @Test
    public void testRemoveById() {
        Assert.assertTrue(people.contains(person2));
        people.remove(Long.valueOf(2));
        Assert.assertFalse(people.contains(person2));
    }

    @Test
    public void testRemoveAll() {
        Assert.assertTrue(people.contains(person2));
        people.removeAll();
        Integer actual = people.count();
        Integer expected = 0;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFindById() {
        Person actual = people.findById(3L);
        Person expected = person1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testToArray() {
        Person[] personArr = people.toArray();
        Assert.assertEquals(2, personArr.length);
    }
}
