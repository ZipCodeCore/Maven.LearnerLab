package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TestPeople {
    People<Person> people;
    Person p1, p2, p3;

    @Before
    public void setUp(){
        people = new ConcretePeople();
        p1 =  new Person(1L, "Bob");
        p2 = new Person(2L, "Pat");
        p3 = new Person(3L, "Billy");
        people.add(p1);
        people.add(p2);
    }

    @Test
    public void add() {
        people.add(p3);
        Assert.assertTrue(people.contains(p3));
    }

    @Test
    public void findById() {
        Person actual = people.findById(2L);
        Person expected = p2;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void remove() {
        people.remove(p2);
        Assert.assertFalse(people.contains(p2));
    }

    @Test
    public void testRemoveById(){
        Assert.assertTrue(people.contains(p2));
        people.removeById(2L);
        Assert.assertFalse(people.contains(p2));
    }

    @Test
    public void testRemoveAll(){
        people.removeAll();
        Assert.assertEquals(people.count(), 0);
    }

    @Test
    public void testCount(){
        people.add(p3);
        people.count();
        Assert.assertEquals(people.count(), 3);
    }

    @Test
    public void testToArray(){
        Person[] personArr = people.toArray();
        Assert.assertEquals(2, personArr.length);
    }
}