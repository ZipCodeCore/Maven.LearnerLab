package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PeopleTest {

    People people;
    Person bill;
    Person carol;
    Person geoff;
    Person sarah;

    @Before
    public void setup(){
        bill = new Person();
        carol = new Person("carol", 1234);
        geoff = new Person();
        sarah = new Person();
        people = new People();
        people.personList.add(bill);
        people.personList.add(carol);
        people.personList.add(geoff);
    }

    @Test
    public void addTest(){
        people.add(sarah);
        Assert.assertEquals(people.personList.get(3), sarah);
    }

    @Test
    public void removeTest(){
        people.remove(carol);
        Assert.assertFalse(people.personList.contains(carol));
    }

    @Test
    public void findByIdTest(){
        Person actual = people.findById(1234);
        Assert.assertEquals(carol, actual);
    }

}
