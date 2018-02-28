/*package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPeople {

    @Test
    public void testAdd() {
        People people = new People();
        people.add(new Person(1234));
        people.add(new Person(1212));
        int expected = 2;
        int actual = people.getPersonList().size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemove() {
        People people = new People();
        people.add(new Person(1234));
        people.add(new Person(1221));
        people.removeById(1234);
        long expected = 1221;
        long actual = people.getPersonList().get(0).getId();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFindById() {
        People people = new People();
        Person personNamedMitch = new Person(1234);
        personNamedMitch.setName("Mitch");
        people.add(personNamedMitch);
        Person personNamedBob = new Person(1212);
        personNamedBob.setName("Bob");
        people.add(personNamedBob);
        String expected = "Mitch";
        String actual = people.findById(1234).getName();
        Assert.assertEquals(expected, actual);
    }

}
*/