package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestPeople {
    @Test
    public void testAdd(){
        //given
        People people = new People();
        ArrayList<Person> personList = new ArrayList<Person>();
        Person person = new Person("Joe", 123);

        //when
        personList.add(person);
        int expected = 1;

        //then
        int actual = people.getCount(personList);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemove(){
        //given
        People people = new People();
        ArrayList<Person> personList = new ArrayList<Person>();
        Person personJoe = new Person("Joe", 123);
        Person personBob = new Person("Bob", 124);
        Person personTim = new Person("Tim", 125);
        personList.add(personJoe);
        personList.add(personBob);
        personList.add(personTim);

        //when
        personList.remove(personBob);
        int expected = 2;

        //then
        int actual = people.getCount(personList);
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testFindById(){
        // Given
        People people = new People();
        Person person = new Person("Joe", 9);
        Person person1 = new Person("Bob", 10);
        Person person2 = new Person("Tim", 11);
        Person person3 = new Person("Bill", 12);
        people.add(person);
        people.add(person1);
        people.add(person2);
        people.add(person3);

        // When
        String expected = "Tim";

        //Then
        String actual = people.findById(11);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemoveAll(){
        People people = new People();
        ArrayList<Person> personList = new ArrayList<Person>();
        Person personJoe = new Person("Joe", 123);
        Person personBob = new Person("Bob", 124);
        Person personTim = new Person("Tim", 125);
        personList.add(personJoe);
        personList.add(personBob);
        personList.add(personTim);

        //when
        people.removeAll(personList);
        int expected = 0;

        //then
        int actual = people.getCount(personList);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testGetArray(){
        People people = new People();

        Person personJoe = new Person("Joe", 123);
        Person personBob = new Person("Bob", 124);
        Person personTim = new Person("Tim", 125);
        people.add(personJoe);
        people.add(personBob);
        people.add(personTim);

        Person[] personarray = people.getArray();
        //when
        Person expected = personJoe;
        Person actual = personarray[0];
        //then

        Assert.assertEquals(expected, actual);
    }
}
