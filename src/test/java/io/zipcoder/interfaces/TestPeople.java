package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestPeople {

    People testPeople = new People();

    @Test
    public void addTest() {
        // Given
        Person testperson1 = new Person(1);
        Person testPerson2 = new Person(2);

        testPeople.add(testperson1);
        testPeople.add(testPerson2);

        int expected = 2;
        int actual = testPeople.getCount();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeTest() {
        Person testPerson1 = new Person(1);
        Person testPerson2 = new Person(2);

        testPeople.remove(testPerson1);
        testPeople.remove(testPerson2);

        int expected = 0;
        int actual = testPeople.getCount();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findByIDTest() {
        Person testPerson1 = new Person(1);

        testPeople.add(testPerson1);

        Person expected = testPerson1;
        Person actual = testPeople.findByID(1);

        Assert.assertEquals(expected, actual);
    }


}