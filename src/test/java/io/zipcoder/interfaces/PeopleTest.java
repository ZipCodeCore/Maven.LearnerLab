package io.zipcoder.interfaces;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class PeopleTest {
    Person aPerson;
    People aPeople;

    @Before
    public void setUp(){
        aPeople = new People();
        aPerson = new Person("Andrew",1);

    }

    @After
        public void breakDown(){
        aPeople = new People();
        aPerson = new Person("Andrew",1);
    }


    @Test
    public void testAdd() {
        String expected = "Andrew";
        aPeople.personList.add(aPerson);
        String actual = aPeople.personList.get(0).getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemove_InputPerson() {
        aPeople.personList.add(aPerson);
        int expected = 0;
        aPeople.personList.remove(aPerson);
        int actual = aPeople.personList.size();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testFindById() {
        aPeople.personList.add(aPerson);
        long expected = 1;
        long actual = aPeople.findById(1).id;
        Assert.assertEquals(expected,actual);
    }


}