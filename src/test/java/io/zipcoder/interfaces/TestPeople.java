package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestPeople {
    @Test
    public void testAdd() {
        //Given
        List<Person> personList = new ArrayList<>();
        Person person = new Person(2l, "John");

        //When
        personList.add(person);

        //Then
        Assert.assertTrue(personList.contains(person));
    }

    @Test
    public void testRemove() {
        //Given
        List<Person> personList = new ArrayList<>();
        Person person = new Person(2l, "John");

        //When
        personList.remove(person);

        //THen
        Assert.assertFalse(personList.contains(person));
    }

    @Test
    public void testFindById() {
        //Given
        List<Person> personList = new ArrayList<>();
        Person person = new Person(2l, "John");

        //when
        person.getid();

        //then
        Assert.assertEquals(2, person.getid());

    }
}
