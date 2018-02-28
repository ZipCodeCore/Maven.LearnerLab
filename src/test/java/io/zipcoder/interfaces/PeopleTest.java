package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class PeopleTest {

    @Test
    public void testAdd() {
        //given
        People people = new People();
        Person expected = new Person(8L);
        //When
        people.add(expected);
        Person actual = people.findById(expected.getId());
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemove(){
        //Given is the class we are testing so we have to instantiate/create it
        Person person = new Person(9L);
        People people = new People();
        Person expected = null;
        people.add(person);

        //When is when the method we are testing/invoking is called
        people.remove(person);
        Person actual = people.findById(person.getId());
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFindById(){
        //Given
        long id = 3;
        Person expected = new Person(id);
        People people = new People();
        people.add(expected);
        //When
        people.findById(id);
        Person actual = people.findById(id);
        //Then
        Assert.assertEquals(expected, actual);
    }
}
