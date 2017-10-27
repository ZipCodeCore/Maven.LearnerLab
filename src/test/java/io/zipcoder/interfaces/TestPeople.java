package io.zipcoder.interfaces;

import io.zipcoder.interfaces.Class.People;
import io.zipcoder.interfaces.Class.Person;
import io.zipcoder.interfaces.Class.Person;
import org.junit.Assert;
import org.junit.Test;

public class TestPeople {

    People people = new People();
    Person Person = new Person(123);
    @Test
    public void testAdd(){

        people.add(Person);

        int expected = 1;

        int actual = people.getCount();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testRemove(){


        int expected1 = 1;
        int expected2 = 0;

        people.add(Person);
        int actual1 = people.getCount();
        people.remove(Person);
        int actual2 = people.getCount();

        Assert.assertEquals(expected1,actual1);
        Assert.assertEquals(expected2,actual2);

    }

    @Test
    public void testFindById(){
        Person expected = Person;
        people.add(Person);
        Person actual = people.findById(123);
        Assert.assertEquals(expected,actual);
    }

}
