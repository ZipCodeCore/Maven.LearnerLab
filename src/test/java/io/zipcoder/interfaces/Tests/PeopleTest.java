package io.zipcoder.interfaces.Tests;

import io.zipcoder.interfaces.classes.People;

import io.zipcoder.interfaces.classes.Person;
import org.junit.Assert;
import org.junit.Test;


public class PeopleTest {

    People people = new People();
    Person testPerson1 = new Person(1);
    Person testPerson2 = new Person(2);

    @Test
    public void testAdd() {


        people.add(testPerson1);

        int expected = 1;
        int actual = people.getCount();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemove() {

        people.add(testPerson1);
        people.add(testPerson2);

        people.remove(testPerson1);

        int expected = 1;
        int actual = people.getCount();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFindById(){

        people.add(testPerson2);

        Person expected = testPerson2;
        Person actual = people.findById(2);

        Assert.assertEquals(expected,actual);
    }


}
