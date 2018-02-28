package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class PeopleTest {
    public ArrayList<Person> personListTest;


    @Before
    public void setup(){


    }

    @Test
    public void testAdd1() {
        personListTest = new ArrayList<Person>();
        Person firstPerson = new Person("Mathew",1);
        personListTest.add(firstPerson);

        int expected = 1;
        int actual = personListTest.size();
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testAdd2() {
        personListTest = new ArrayList<Person>();
        Person secondPerson = new Person("Lukas",2);
        personListTest.add(secondPerson);

        Person expected = secondPerson;
        Person actual = personListTest.get(0);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testFindById() {

        personListTest =new ArrayList<Person>();
        People peopleTest = new People(personListTest);
        Person thirdPerson = new Person("Micheal",3);
        Person expected = thirdPerson;
        personListTest.add(thirdPerson);
        Person actual = peopleTest.findById(3);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testRemove() {
        personListTest =new ArrayList<Person>();
        People peopleTest = new People(personListTest);
        Person thirdPerson = new Person("Micheal",3);
        Person secondPerson = new Person("Lukas",2);
        personListTest.add(secondPerson);

        peopleTest.remove(thirdPerson);

        boolean expected = false;
        boolean actual = personListTest.contains(thirdPerson);

        Assert.assertEquals(expected,actual);


    }

    @Test
    public void remove1() {
    }

    @Test
    public void getCount() {
    }

    @Test
    public void getArray() {
    }

    @Test
    public void removeAll() {
    }
}