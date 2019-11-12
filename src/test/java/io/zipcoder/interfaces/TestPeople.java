package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPeople {
    @Test
    public void testAdd1() {
        Person person1 = new Person(Long.valueOf(3), "rake");
        Person person2 = new Person(Long.valueOf(2), "ferb");
        People people = new ConcretePeople();
        people.add(person1);
        people.add(person2);
        Assert.assertTrue(people.contains(person1));
    }

    @Test
    public void testAdd2() {
        Person person1 = new Person(Long.valueOf(3), "rake");
        Person person2 = new Person(Long.valueOf(2), "ferb");
        People people = new ConcretePeople();
        people.add(person1);
        people.add(person2);
        Assert.assertTrue(people.contains(person2));
    }

    @Test
    public void testRemove() {
        Person person1 = new Person(Long.valueOf(3), "rake");
        Person person2 = new Person(Long.valueOf(2), "ferb");
        People people = new ConcretePeople();
        people.add(person1);
        people.add(person2);
        Assert.assertTrue(people.contains(person2));
        people.remove(person2);
        Assert.assertFalse(people.contains(person2));
    }

    @Test
    public void testRemoveById() {
        Person person1 = new Person(Long.valueOf(3), "rake");
        Person person2 = new Person(Long.valueOf(2), "ferb");
        People people = new ConcretePeople();
        people.add(person1);
        people.add(person2);
        Assert.assertTrue(people.contains(person2));
        people.remove(Long.valueOf(2));
        Assert.assertFalse(people.contains(person2));
    }

    @Test
    public void testRemoveAll() {
        Person person1 = new Person(Long.valueOf(3), "rake");
        Person person2 = new Person(Long.valueOf(2), "ferb");
        People people = new ConcretePeople();
        people.add(person1);
        people.add(person2);
        Assert.assertTrue(people.contains(person2));
        people.removeAll();
        Integer actual = people.count();
        Integer expected = 0;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFindById() {
        Person person1 = new Person(Long.valueOf(3), "rake");
        Person person2 = new Person(Long.valueOf(2), "ferb");
        People people = new ConcretePeople();
        people.add(person1);
        people.add(person2);
        Person actual = people.findById(Long.valueOf(3));
        Person expected = person1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testToArray() {
        Person person1 = new Person(Long.valueOf(3), "rake");
        Person person2 = new Person(Long.valueOf(2), "ferb");
        People people = new ConcretePeople();
        people.add(person1);
        people.add(person2);
        Person[] personArr = people.toArray();
        Assert.assertEquals(2, personArr.length);
    }
}
