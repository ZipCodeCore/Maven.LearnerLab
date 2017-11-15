package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;


public class TestPeople {

    @Test
    public void testAdd() {
        People people = new People();
        Person person1Linda = new Person("Linda", 302);
        people.add(person1Linda);

        Person expected = person1Linda;
        Person actual = people.personList.get(0);
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testRemove(){

    People people = new People();
    Person person2Jack = new Person("Jack", 323);
    people.add(person2Jack);
    people.remove(person2Jack);
    Assert.assertFalse(people.personList.contains(person2Jack));

    }

    @Test
    public void testFindById(){

        People people = new People();
        Person person3Tim = new Person("Time", 6778);
        people.add(person3Tim);

        Person expected = person3Tim;
        Person actual = people.findByID(person3Tim.getID());
        Assert.assertEquals(expected, actual);
    }


}








