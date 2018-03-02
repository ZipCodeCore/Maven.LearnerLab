package io.zipcoder.interfaces;

import org.junit.Test;
import org.junit.Assert;

public class PeopleTest
{
    @Test
    public void testAdd()
    {
        //Given


        ConcreteImplementationOfPeople people = new ConcreteImplementationOfPeople();
        Person expected = new Person("Bob",-1L);

        //When
        people.add(expected);
        Person actual = people.findById(expected.getId());

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemove()
    {

        //Given is instantiating the classs you are testing
        ConcreteImplementationOfPeople people = new ConcreteImplementationOfPeople();
        Person person = new Person("Kate",-1L);
        Person expected = null;
        people.add(person);

        //When is the method that we are invoking/testing
        people.remove(person);
        Person actual = people.findById(person.getId());

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testByFindId()
    {
        //Given
        long id = -1;
        String name = "Jack";
        ConcreteImplementationOfPeople people = new ConcreteImplementationOfPeople();
        Person expected = new Person(name, id);
        people.add(expected);

        //When
        Person actual = people.findById(id);

        //Then
        Assert.assertEquals(expected, actual);

    }


}
