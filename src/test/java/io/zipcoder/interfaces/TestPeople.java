package io.zipcoder.interfaces;

import org.junit.*;


public class TestPeople {
    Person person = new Person(786, "Zan");
    People p1 = new People();

    @Test
    public void testAdd() {
        p1.add(person);

        long expected = 786;
        long actual = p1.findById(expected).getId();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testRemove(){
        p1.removeAll();

        int expected = 0;
        int actual = p1.personList.size();

        Assert.assertEquals(expected,actual);

    }
    @Test
    public void testFindById() {
        p1.add(person);

        long expected = 786;
        long actual = p1.findById(expected).getId();

        Assert.assertEquals(expected, actual);

    }

}