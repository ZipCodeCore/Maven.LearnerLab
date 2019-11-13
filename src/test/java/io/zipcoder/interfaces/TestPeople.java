package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPeople {
    @Test
    public void addTest() {
        People people = new People();
        Person person = new Person(15, "Red");
        Person person1 = new Person(16,"Blue");
        people.addPerson(person);
        people.addPerson(person1);
        int actual = people.count();
        int expected = 2;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void removeTest() {
        People people = new People();
        Person person = new Person(15, "Red");
        Person person1 = new Person(16,"Blue");
        people.addPerson(person);
        people.addPerson(person1);
        people.removePerson(person);
        int actual = people.count();
        int expected = 1;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testFindById() {
        People people = new People();
        Person person = new Person(15, "Red");
        Person person1 = new Person(16,"Blue");
        people.addPerson(person);
        Person actual = people.findById(15L);
        Person expected = person;
        Assert.assertEquals(actual, expected);

    }
}
