package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class PeopleTest {


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

//    @Test
//    public void findById() {
//
//        People<Person> person;
//        ArrayList<Person> personList = new ArrayList<Person>();
//        Person[] arrayOfPerson = new Person[personList.size()];
//        //Given
//        Person personTest1 = new Person(21L);
//        Person personTest2 = new Person(12L);
//        Person personTest3 = new Person(1L);
//
//        //When
//        person.addPerson(personTest1);
//        person.addPerson(personTest2);
//        person.addPerson(personTest3);
//
//        Person expected = personTest1;
//        Person actual = person.findById(21);
//        //Then
//        Assert.assertEquals(expected, actual);
//    }

    @Test
    public void removeByName() {
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
}