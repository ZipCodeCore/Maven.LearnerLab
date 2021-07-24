package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.awt.*;

public class TestPeople {

    @Test
    public void testAdd(){
        People people = Instructors.getInstance();

        Person person = new Person(2L, "Goe");
        people.add(person);

        Integer expected = 1;
        Integer actual = people.count();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemove(){
        People people = Students.getInstance();

        Person person = new Person(4L, "Eck");
        people.add(person);
        people.remove(person);

        Integer expected = 0;
        Integer actual = people.count();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFindById(){
        People people = Students.getInstance();

        Person person = new Person(5L, "Ys");
        people.add(person);

        Person actual = people.findById(5L);

        Assert.assertEquals(person, actual);
    }
}
