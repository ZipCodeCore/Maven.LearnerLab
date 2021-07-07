package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PeopleTest {

    @Test
    public void addTest(){
        People newPeople = new PeopleClass();
        Person newPerson = new Person(98L, "Sam");

        newPeople.add(newPerson);

        int expected = 1;
        int actual = newPeople.count();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeTest(){
        People newPeople = new PeopleClass();
        Person newPerson = new Person(98L, "Sam");
        Person newPerson2 = new Person(34L, "Mike");
        Person newPerson3 = new Person(10L, "Julia");

        newPeople.add(newPerson);
        newPeople.add(newPerson2);
        newPeople.add(newPerson3);

        newPeople.removeByPerson(newPerson2);

        int expected = 2;
        int actual = newPeople.count();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeByIdTest(){
        People newPeople = new PeopleClass();
        Person newPerson = new Person(98L, "Sam");
        Person newPerson2 = new Person(34L, "Mike");
        Person newPerson3 = new Person(10L, "Julia");

        newPeople.add(newPerson);
        newPeople.add(newPerson2);
        newPeople.add(newPerson3);

        newPeople.removeById(10L);

        Assert.assertFalse(newPeople.contains(newPerson3));
    }

    @Test
    public void RemoveAllTest() {

        People newPeople = new PeopleClass();
        Person newPerson = new Person(98L, "Sam");
        Person newPerson2 = new Person(34L, "Mike");
        Person newPerson3 = new Person(10L, "Julia");

        newPeople.add(newPerson);
        newPeople.add(newPerson2);
        newPeople.add(newPerson3);

        newPeople.removeAll();

        int actual = newPeople.count();

        Assert.assertEquals(0, actual);
    }

        @Test
    public void findByIdTest(){

        People newPeople = new PeopleClass();
        Person newPerson = new Person(98L, "Sam");
        Person newPerson2 = new Person(34L, "Mike");
        Person newPerson3 = new Person(10L, "Julia");

        newPeople.add(newPerson);
        newPeople.add(newPerson2);
        newPeople.add(newPerson3);

        Person actual = newPeople.findById(34L);

        Assert.assertEquals(newPerson2, actual);
    }

}