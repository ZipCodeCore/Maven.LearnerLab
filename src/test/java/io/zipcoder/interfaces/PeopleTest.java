package io.zipcoder.interfaces;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

/**
 * Create a TestPeople class.
 * Create a testAdd method which ensures that our personList in our People class
 * populated with respective Person objects following invocation of the add method.
 * Create a testRemove method which ensures that the personList in a People object is
 * depopulated with a respective Person object following the invokation of the remove method.
 * Create a testFindById method which ensures that a respective Person object with
 * a respective id field is returned upon invokation of the findById method on a respective People object.
 */

public class PeopleTest {
    @Test
    public void addTest(){
        //given
        People peeps = Students.getInstance();
        Person nick = new Person(10,"nick");
        //when
        peeps.add(nick);
        //then
        boolean peepsHasNick= peeps.contains(nick);
        Assert.assertTrue(peepsHasNick);
        peeps.removeById(10);

    }

    @Test
    public void removeTest(){
        //given
        People peeps = Students.getInstance();
        Person jason = new Person(12,"Jason");
        peeps.add(jason);
        //when
        peeps.removePerson(jason);
        boolean peepsHasJason = peeps.contains(jason);
        //then
        Assert.assertFalse(peepsHasJason);
    }

    @Test
    public void findByIdTest(){
        //given
        People peeps = Students.getInstance();
        Person laura = new Person(16, "Laura");
        peeps.add(laura);
        //when
        Person retrieved = peeps.findById(16);
        //then
        Assert.assertEquals(laura,retrieved);
        peeps.removePerson(laura);
    }
}
