package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class PeopleTest {


    People people = new People();
    Person Jake = new Person(123, "Jake");
    Person Sam = new Person(456, "Sam");

    @Test
    public void testPersonAdd()  {

        // Given
        Person Jake = new Person(123, "Jake");
        people.personList.add(Jake);

        // When
        String expected = "Jake";

        // Then
        String actual = people.personList.get(0).getName();


        Assert.assertEquals(expected, actual);


    }

    @Test
    public void findById(){
        //Given
        Person person = new Person(123, "Sam");
        people.personList.add(person);

        //When
        long expected = 123;
        //Then
        long actual = people.personList.get(0).getId();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testRemoveName()  {
        // Given
        Person Mike = new Person(123, "Mike");
        Person Sam = new Person(123, "Sam");
        people.personList.add(Mike);
        people.personList.add(Sam);

        people.remove(Mike);


        // When
        String expected = "Sam";

        // Then
        String actual = people.personList.get(0).getName();


        Assert.assertEquals(expected, actual);




    }

    @Test

    public void testRemoveId()  {
            // Given
            Person Mike = new Person(123, "Mike");
            Person Sam = new Person(1234, "Sam");
            people.personList.add(Mike);
            people.personList.add(Sam);

            // When
            long expected = 1234;

            // Then
            people.remove(123);
            long actual = people.personList.get(0).getId();

            Assert.assertEquals(expected, actual);

    }

    @Test
    public void testGetCount()  {
        //Given
        Person Mike = new Person(123, "Mike");
        Person Sam = new Person(1234, "Sam");
        people.personList.add(Mike);
        people.personList.add(Sam);

        //When

        int expected = 2;

        //Then

        people.getCount();
        int actual = people.personList.size();

        Assert.assertEquals(expected, actual);

    }

    @Test

    public void testGetArray() {

        //Given
        Person Mike = new Person(123, "Mike");
        Person Sam = new Person(1234, "Sam");
        people.personList.add(Mike);
        people.personList.add(Sam);

        // When

        int expected = 2;

       //Then
       int actual = people.getArray().length;       //array of person

       //When

       Assert.assertEquals(expected, actual);

        }



    @Test
    public void removeAll()  {
        //Given


        Person Mike = new Person(123, "Mike");
        Person Sam = new Person(1234, "Sam");
        people.personList.add(Mike);
        people.personList.add(Sam);

        int expected = 0;
        //When

        people.removeAll();
        int actual = people.personList.size();

        Assert.assertEquals(expected, actual);


    }

}