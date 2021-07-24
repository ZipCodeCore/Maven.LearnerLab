package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPeople {

    @Test
    public void testAdd () {
        Person person = new Person();
        Person person1 = new Person();
        Integer expected = 2;

        People people = new People();
        people.add(person);
        people.add(person1);
        Integer actual = people.personList.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemove () {
        Person person = new Person();
        Person person1 = new Person();
        Integer expected = 1;

        People people = new People();
        people.add(person);
        people.add(person1);
        people.removePerson(person);
        Integer actual = people.personList.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFindById () {
        Person person = new Person(2, "");
        Person person1 = new Person(23, "");
        Person expected = person;

        People people = new People();
        people.add(person);
        people.add(person1);
        Person actual = people.findById(2);

        Assert.assertEquals(expected, actual);
    }
}
