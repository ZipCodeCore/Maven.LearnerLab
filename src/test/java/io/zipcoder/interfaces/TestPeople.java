package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestPeople {
    @Test
    public void testAdd(){
        People people = new People();
        long personId2 = 29386449;
        long personId3 = 76488743;
        Person person2 = new Person(personId2);
        Person person3 = new Person(personId3);
        people.add(person3);
        people.add(person2);
        int expected = 2;
        int actual = people.getCount();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testRemove(){
        People people = new People();
        long personId2 = 29386449;
        long personId3 = 76488743;
        Person person2 = new Person(personId2);
        Person person3 = new Person(personId3);
        people.add(person3);
        people.add(person2);
        people.remove(person2);
        int expected = 1;
        int actual = people.getCount();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testFindById(){
        People people = new People();
        long personId1 = 32894403;
        long personId2 = 29386449;
        long personId3 = 76488743;
        Person person1 = new Person(personId1);
        Person person2 = new Person(personId2);
        Person person3 = new Person(personId3);
        people.add(person3);
        people.add(person2);
        people.add(person1);
        String expected = person3.toString();
        Assert.assertEquals(expected , people.findById(personId3).toString());
    }
}
