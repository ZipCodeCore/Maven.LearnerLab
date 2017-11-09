package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPeople {

    //ArrayList<Person> personList = new ArrayList<Person>();
    People people = new People();
    @Test
    public void testAdd() {
        Person expected = new Person(15);
        people.add(expected);

        Assert.assertTrue(people.contains(expected));
    }

    @Test
    public void testFindById(){
        int id = 15;
        Person expected = new Person(id);
        people.add(expected);
        Person actual = people.findById(id);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemove(){
        int id = 15;
        Person expected = new Person(id);
        people.remove(expected);
        Assert.assertFalse(people.contains(expected));
    }

}
