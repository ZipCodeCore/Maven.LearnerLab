package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class PeopleTest {
//    People people = new People();
//    Person p1 = new Person(1);
//    Person p2 = new Person (2);

//    @Test
//    public void testAdd() {
//        people.add(p1);
//
//        int expected = 1;
//        int actual = people.getCount();
//
//        Assert.assertEquals(expected, actual);
//    }

    @Test
    public void addPerson() {
        ArrayList<Person> personList = new ArrayList<Person>();
        Person[] arrayOfPerson = new Person[personList.size()];
        //Given
        Person personTest1 = new Person(21L);
        Person personTest2 = new Person(12L);
        Person personTest3 = new Person(1L);

        //When
        personList.add(personTest1);
        personList.add(personTest2);
        personList.add(personTest3);

        Person[] expected = {personTest1, personTest2, personTest3};
        Person[] actual = personList.toArray(arrayOfPerson);
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removePerson() {
        ArrayList<Person> personList = new ArrayList<Person>();
        Person[] arrayOfPerson = new Person[personList.size()];
        //Given
        Person personTest1 = new Person(21L);
        Person personTest2 = new Person(12L);
        Person personTest3 = new Person(1L);

        //When
        personList.add(personTest1);
        personList.add(personTest2);
        personList.add(personTest3);
        personList.remove(personTest3);

        Person[] expected = {personTest1, personTest2};
        Person[] actual = personList.toArray(arrayOfPerson);
        //Then
        Assert.assertEquals(expected, actual);
    }

//
//    @Test
//    public void findById() {
//        people.add(p1);
//        people.add(p2);
//
//        Person expected = p2;
//        Person actual = people.findById(2);
//    }
//
//    @Test
//    public void testRemove() {
//        people.add(p1);
//        people.add(p2);
//        people.remove(p1);
//
//        int expected = 1;
//        int actual = people.getCount();
//
//        Assert.assertEquals(expected, actual);
//    }
}