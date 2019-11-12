package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TestPeople {

    @Test
    public void add() {
        Person person = new Person(2, "Jose");
        List<Person> personList = new ArrayList<Person>();

        personList.add(person);

        Assert.assertTrue("Jose", personList.contains(person));
    }

    @Test
    public void findById() {
        Person person = new Person(1, "BilliBob");
        List<Person> personList = new ArrayList<Person>();

        person.getId();

        Assert.assertEquals(1, person.getId());
    }

    @Test
    public void remove() {
        Person person = new Person(1, "Poppy");
        List<Person> personList = new ArrayList<Person>();

        personList.remove(person);

        Assert.assertFalse(personList.contains(1));
    }
}