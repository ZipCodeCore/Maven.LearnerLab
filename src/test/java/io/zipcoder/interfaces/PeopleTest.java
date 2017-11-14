package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class PeopleTest {

    @Test
    public void testAdd(){
        People personList = new People();
        Person person = new Person(12, "Dan");
        Person person2 = new Person(18, "Rob");
        personList.add(person);
        personList.add(person2);

        long expected = 2;
        long actual = personList.getCount();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemove(){
        People personList = new People();
        personList.add(new Person(11, "Ralph"));
        personList.add(new Person(12, "Billy"));

        personList.remove(11);

        Person expected = null;
        Person actual = personList.findById(11);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findById(){
        People personList = new People();
        Person tim = new Person(423, "Tim");
        personList.add(tim);

        Person expected = tim;
        Person actual = personList.findById(423);

        Assert.assertEquals(expected, actual);


    }

}