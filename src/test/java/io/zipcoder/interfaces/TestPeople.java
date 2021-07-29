package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPeople {
    /**
     * Create a TestPeople class.
     * Create a testAdd method which ensures that our
     * personList in our People class populated with respective
     * Person objects following invokation of the add method.
     *
     * Create a testRemove method which ensures that the
     * personList in a People object is depopulated with a respective
     * Person object following the invokation of the remove method.
     *
     * Create a testFindById method which ensures that a respective
     * Person object with a respective id field is returned upon
     * invokation of the findById method on a respective People object.
     */


    @Test
    public void testAdd() {
        Person person = new Person(1L, "Taco");
        Person person2 = new Person(2L, "TacoTuesday");
        People personList =  Students.getInstance();

        personList.add(person);
        personList.add(person2);
        int expected =  21;
        int actual = personList.count();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemove() {
        Person person = new Person(1L, "Taco");
        Person person2 = new Person(2L, "TacoTuesday");
        People personList =  Students.getInstance();

        personList.add(person);
        personList.add(person2);
        personList.remove(person);
        int expected = 22;
        int actual = personList.count();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFindById() {
        Students personList =  Students.getInstance();


        String expected = "Me";
        String actual = personList.findById(1L).getName();


        Assert.assertEquals(expected, actual);

    }
}
