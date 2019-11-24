package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestPeople {
    People personList;
    Person person;
    Person person2;
    Person person3;


    @Before
    public void testContr(){
        personList = new People();
        person = new Person(11, "Zan");
        person2 = new Person(01, "Johnny");
        person3 = new Person(02, "Elliot");
    }

    @Test
    public void testAdd(){
        personList.add(person);

        Integer expected = 1;
        Integer actual = personList.personList.size();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testRemove(){
        personList.add(person);
        personList.add(person2);
        personList.add(person3);
        personList.remove(person);

        Integer expected = 2;
        Integer actual = personList.personList.size();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testFindById(){
        personList.add(person);


        Person expected = person;
        Person actualId = personList.findById(person.getId());

        Assert.assertEquals(expected,actualId);
    }

}
