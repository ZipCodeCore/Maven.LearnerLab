package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestPeople {

    People peopleTest;
    @Before
    public void setUp() {
        peopleTest = new People();
    }


    @Test
    public void addPersonTest() {
        //Given
        Person personTest1 = new Person(1);
        Person personTest2 = new Person(2);

        int expected1 = 0;
        int expected2 = 1;

        //When
        peopleTest.addPerson(personTest1);
        int actual1 = peopleTest.personList.indexOf(personTest1);
        peopleTest.addPerson(personTest2);
        int actual2 = peopleTest.personList.indexOf(personTest2);

        //Then
        Assert.assertEquals(expected1, actual1);
        Assert.assertEquals(expected2, actual2);
    }

    @Test
    public void removePersonTest() {
        //Given
        Person personTest1 = new Person(1);
        Person personTest2 = new Person(2);
        peopleTest.addPerson(personTest1);
        peopleTest.addPerson(personTest2);
        boolean expected = false;

        //When
        peopleTest.removePerson(personTest1);
        boolean actual = peopleTest.personList.contains(personTest1);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findByIdTest() {
        //Given
        Person personTest1 = new Person(1);
        Person personTest2 = new Person(2);
        peopleTest.addPerson(personTest1);
        peopleTest.addPerson(personTest2);
        Person expected = personTest1;

        //When
        Person actual = peopleTest.findById(1);

        //Then
        Assert.assertEquals(expected, actual);
    }
}
