package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class PeopleTest {
    People people = new People();
    Person person = new Person(12345,"Kendall");
    Person person2 = new Person(23456,"Kendall1");
    Person person3 = new Person(34567,"Anna1");
    Person person4 = new Person(45678,"Anna2");

    @Test
    public void add() throws Exception {
        //Given
        // Also tests for getCount
       people.add(person);
      //  people.add(person2);

        //When
        long expected = 1;
        long actual = people.getCount();

        //Then
        Assert.assertEquals(expected,actual);



    }

    @Test
    public void findByIdTest() throws Exception {
        //Given
        people.add(person);

        //When
        Person expected = person;
        Person actual = people.findById(12345);
        //Then
        Assert.assertEquals(expected,actual);
    }


    @Test
    public void removeById() throws Exception {
        //Given

        people.add(person);
        people.add(person2);
        people.add(person3);
        people.add(person4);

        //When
        people.removeById(45678);
        long expected = 3;
        long actual = people.getCount();

        Assert.assertEquals(expected, actual);


    }

    @Test
    public void remove() throws Exception {
        // Given
        people.add(person);

        //When
        people.remove(person);

        // Then
        Assert.assertNull(people.findById(person.getId()));
    }


    @Test
    public void getArray() throws Exception {
    }

    @Test
    public void removeAll() throws Exception {
    }

}