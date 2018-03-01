package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class PeopleTest {
    @Test
    public void testAdd(){
        //Given
        People people = new People();
        Person expected = new Person(-1L);

        //When
        people.add(expected);
        Person actual = people.findById(expected.getId());

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testRemove(){
        //Given
            //ALWAYS THE CLASS YOURE TESTING. YOU HAVE TO CREATE THAT CLASS.
        People people = new People();
        Person expected = new Person(-1L);
        people.add(expected);

        //When
            //ALWAYS THE METHOD WE ARE TESTING
            //we remove the person
        people.remove(expected);

        //Then
        Assert.assertTrue(people.findById(expected.getId()) == null);
    }

    @Test
    public void testFindById(){
        //Given
        People people = new People();
        long id = -1;
        Person person = new Person(id);
        people.add(person);
        Person expected = person;

        //When
            //when we try to look the person up by ID
            Person actual = people.findById(id);

        //Then
            //we expect to have the corresponding person returned
            Assert.assertEquals(expected,actual);

    }
}
