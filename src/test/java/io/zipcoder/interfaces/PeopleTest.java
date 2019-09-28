package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class PeopleTest extends People {
    //public ArrayList<E> testPerson = new ArrayList<E>();

    @Test
    public void testAddPerson() {
        PeopleTest aPeople = new PeopleTest();
        Person aPerson = new Person("katrina", 10);
        Person aPerson2 = new Person("steve", 11);
        Person aPerson3 = new Person("mila", 12);
        aPeople.add(aPerson);
        aPeople.add(aPerson2);
        aPeople.add(aPerson3);
        int expected = 3;
        int actual = aPeople.getCount();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFindById() {
        PeopleTest aPeople = new PeopleTest();
        Person aPerson = new Person("katrina", 10);
        aPeople.add(aPerson);
        Person expected = aPerson;
        Person actual = aPeople.findById(10);
        Assert.assertEquals(expected, actual);
    }

    public void testRemovePerson() {
        PeopleTest peopleTest1 = new PeopleTest();
        Person aPerson = new Person("katrina", 10);
        Person aPerson2 = new Person("steve", 11);
        int expected = 1;
        peopleTest1.remove(aPerson);
        int actual = peopleTest1.getCount();
        Assert.assertEquals(expected, actual);
    }



    @Test //expected 1 and actual 0
    public void testRemoveById() {
        PeopleTest aPeople = new PeopleTest();
        Person aPerson = new Person("katrina", 10);
        Person aPerson2 = new Person("steve", 11);
        aPeople.add(aPerson);
        aPeople.add(aPerson2);
        int expected = 1;
        aPeople.removeById(10);
        int actual = aPeople.getCount();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetCount() {
    }

    @Test
    public void testGetArray() {
    }

    @Test
    public void testRemoveAll() {
        PeopleTest peopleTest1 = new PeopleTest();
        Person aPerson = new Person("katrina", 10);
        Person aPerson2 = new Person("steve", 11);
        int expected = 0;
        peopleTest1.removeAll();
        int actual = peopleTest1.getCount();
        Assert.assertEquals(expected, actual);

    }

    @Override
    public Person[] getArray() {
        return new Person[0];
    }
}

/**
 * Create a TestPeople class.
 * Create a testAdd method which ensures that our personList in our People class populated with
 * respective Person objects following invokation of the add method.
 * Create a testRemove method which ensures that the personList in a People object is depopulated
 * with a respective Person object following the invokation of the remove method.
 * Create a testFindById method which ensures that a respective Person object with a respective
 * id field is returned upon invokation of the findById method on a respective People object.public class PeopleTest extends People{
 *
 * @Override +    public Person[] getArray() {
 * +        return new Person[0];
 * +
/** @Test People is abstract and can't be instantiated
public void testFindById(){
Person aPerson = new Person("katrina", 786);
People aPeople = new People();
aPeople.add(aPerson);
String expected = "katrina";
String actual = aPeople.findById(786).getName();
Assert.assertEquals(expected, actual);

}*/
/**public void testFindById(){
 Person aPerson = new Person("katrina", 786);
 }*/


/**
 * @Test abstract and can't be instantiated
 * public void testRemove() {
 * Person aPerson = new Person("katrina", 786);
 * People aPeople = new People();
 * aPeople.add(aPerson);
 * Boolean expected = true;
 * Boolean actual = aPeople.remove(aPerson);
 * Assert.assertEquals(expected, actual);
 * }
 */