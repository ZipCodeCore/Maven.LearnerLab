package io.zipcoder.interfaces;

import io.zipcoder.interfaces.People.People;
import io.zipcoder.interfaces.People.PeopleC;
import io.zipcoder.interfaces.Person.Person;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * filename:
 * project: interfaces-1
 * author: https://github.com/vvmk
 * date: 2/27/18
 */
public class PeopleTest {
    People people;

    @Before
    public void setup() {
        people = new PeopleC();
    }

    @Test
    public void testAdd() {
        people.add(new Person(9));
        int expected = 1;
        int actual = people.getCount();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFindById() {
        Person expected = new Person(9);
        people.add(expected);
        Person actual = people.findById(expected.getId());

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemove() {
        people.add(new Person(9));
        people.remove(9);

        Assert.assertNull(people.findById(9));
    }
}