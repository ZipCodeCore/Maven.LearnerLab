package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class TestPeople {

    People peopleTest = new ConcretePeople();


    @Test
    public void addTest() {
        //Given
        Person personTest = new Person(666666L);
        Person personTest2 = new Person(555555L);
        Person personTest3 = new Person(444444L);

        //When
        peopleTest.add(personTest);
        peopleTest.add(personTest2);
        peopleTest.add(personTest3);

        Person[] expected = {personTest, personTest2, personTest3};
        Person[] actual = peopleTest.getArray();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeTest() {
        //Given
        Person personTest = new Person(666666L);
        Person personTest2 = new Person(555555L);
        Person personTest3 = new Person(444444L);

        //When
        peopleTest.add(personTest);
        peopleTest.add(personTest2);
        peopleTest.add(personTest3);

        peopleTest.remove(personTest2);

        Person[] expected = {personTest, personTest3};
        Person[] actual = peopleTest.getArray();
        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testFindByIdTest() {
        //Given
        Person personTest = new Person(666666L);
        Person personTest2 = new Person(555555L);

        //When
        peopleTest.add(personTest);
        peopleTest.add(personTest2);

        Person expected = personTest;
        Person actual = peopleTest.findById(666666L);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeByIdTest() {
        //Given
        Person personTest = new Person(666666L);
        Person personTest2 = new Person(555555L);
        Person personTest3 = new Person(444444L);

        peopleTest.add(personTest);
        peopleTest.add(personTest2);
        peopleTest.add(personTest3);

        //When
        peopleTest.removeById(555555L);

        Person[] expected = {personTest, personTest3};
        Person[] actual = peopleTest.getArray();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getCountTest() {
        //Given
        Person personTest = new Person(666666L);
        Person personTest2 = new Person(555555L);
        Person personTest3 = new Person(444444L);

        peopleTest.add(personTest);
        peopleTest.add(personTest2);
        peopleTest.add(personTest3);

        //When
        int expected = 3;
        int actual = peopleTest.getCount();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getArray() {
        //Given
        Person personTest = new Person(777777);
        Person personTest2 = new Person(555555L);
        Person personTest3 = new Person(444444L);

        peopleTest.add(personTest);
        peopleTest.add(personTest2);
        peopleTest.add(personTest3);

        //When
        Person[] expected = {personTest, personTest2, personTest3};
        Person[] actual = peopleTest.getArray();

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void removeAll() {
        //Given
        Person personTest = new Person(777777);
        Person personTest2 = new Person(555555L);
        Person personTest3 = new Person(444444L);

        peopleTest.add(personTest);
        peopleTest.add(personTest2);
        peopleTest.add(personTest3);

        peopleTest.removeAll();

        //When
        Person[] expected = {};
        Person[] actual = peopleTest.getArray();

        //Then
        Assert.assertEquals(expected, actual);

    }
}
