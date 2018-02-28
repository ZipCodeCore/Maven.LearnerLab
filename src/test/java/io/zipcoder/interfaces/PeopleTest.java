package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class PeopleTest {
    public ArrayList<Person> testPerson = new ArrayList<Person>();

    @Test
    public void testAdd() {
        Person aPerson = new Person("katrina", 897);
        testPerson.add(aPerson);
        String expected = "katrina";
        String actual = aPerson.getName();
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void testFindById(){
        Person aPerson = new Person("katrina", 786);
        testPerson.add(aPerson);
        People aPeople = new People(testPerson);
        String expected = "katrina";
        String actual = aPeople.findById(786).getName();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testRemove() {
        Person aPerson = new Person("katrina", 786);
        testPerson.add(aPerson);
        People aPeople = new People(testPerson);
        Boolean expected = true;
        Boolean actual = aPeople.remove(aPerson);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemoveById() {
    }

    @Test
    public void testGetCount() {
    }

    @Test
    public void testGetArray() {
    }

    @Test
    public void testRemoveAll() {
    }
}

/**Create a TestPeople class.
 Create a testAdd method which ensures that our personList in our People class populated with respective Person objects following invokation of the add method.
 Create a testRemove method which ensures that the personList in a People object is depopulated with a respective Person object following the invokation of the remove method.
 Create a testFindById method which ensures that a respective Person object with a respective id field is returned upon invokation of the findById method on a respective People object.*/
