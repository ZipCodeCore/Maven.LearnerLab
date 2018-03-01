package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestPeople {
    People people = new People() {
        public Person[] getArray() {
            return new Person[0];
        }
    };


    @Test
    public void testAdd(){
        //given

        Person person = new Person("Joe", 123);

        //when
        people.add(person);
        int expected = 1;

        //then
        int actual = people.getCount();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemove(){
        //given

        //ArrayList<Person> personList = new ArrayList<Person>();
        Person personJoe = new Person("Joe", 123);
        Person personBob = new Person("Bob", 124);
        Person personTim = new Person("Tim", 125);
        people.add(personJoe);
        people.add(personBob);
        people.add(personTim);

        //when
        people.remove(personBob);
        int expected = 2;

        //then
        int actual = people.getCount();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testFindById(){
        // Given

        Person person = new Person("Joe", 9);
        Person person1 = new Person("Bob", 10);
        Person person2 = new Person("Tim", 11);
        Person person3 = new Person("Bill", 12);
        people.add(person);
        people.add(person1);
        people.add(person2);
        people.add(person3);

        // When
        Person expected = person2;

        //Then
        Person actual = people.findById(11);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemoveAll(){

        ArrayList<Person> personList = new ArrayList<Person>();
        Person personJoe = new Person("Joe", 123);
        Person personBob = new Person("Bob", 124);
        Person personTim = new Person("Tim", 125);
        personList.add(personJoe);
        personList.add(personBob);
        personList.add(personTim);

        //when
        people.removeAll();
        int expected = 0;

        //then
        int actual = people.getCount();
        Assert.assertEquals(expected, actual);

    }

//    @Test
//    public void testGetArray(){
//
//
//        Person personJoe = new Person("Joe", 123);
//        Person personBob = new Person("Bob", 124);
//        Person personTim = new Person("Tim", 125);
//        people.add(personJoe);
//        people.add(personBob);
//        people.add(personTim);
//
//        Person[] personarray = people.getArray();
//        //when
//        Person expected = personJoe;
//        Person actual = personarray[0];
//        //then
//
//        Assert.assertEquals(expected, actual);
//    }
}
