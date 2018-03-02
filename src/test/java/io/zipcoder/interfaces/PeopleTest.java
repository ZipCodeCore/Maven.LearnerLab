package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PeopleTest {


    @Test
    public void testAdd() {
        //Given
        People people = new People() {
            @Override
            Person[] getArray() {
                return new Person[0];
            }

            @Override
            public void removeId(Instructor person) {

            }

            @Override
            public void removeId(Person person) {

            }
        };

        //First I need to create new person
        Person person = new Person(1L);
        Person person1 = new Person(2L);
        Person person2 = new Person(3L);

        //now we need to add
        //When
        people.add(person);
        people.add(person1);
        people.add(person2);

        //Then I want to get back an array of my new persons
        Person[] expected = {person, person1, person2};
        Person[] actual = people.getArray();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFindById() {

        People people = new People() {
            Person[] getArray() {
                return new Person[0];
            }

            @Override
            public void removeId(Instructor person) {

            }

            @Override
            public void removeId(Person person) {

            }
        };

        //First I need to create new person
        Person person = new Person(1L);
        Person person1 = new Person(2L);


        //now we need to add the new persons we just made to our people object
        //When
        people.add(person);
        people.add(person1);

        Person expected = person1;
        Person actual = people.findById(2L);

        Assert.assertEquals(expected, actual);




    }

    @Test
    public void testRemoveId() {

        People people = new People() {
            Person[] getArray() {
                return new Person[0];
            }

            @Override
            public void removeId(Instructor person) {

            }

            @Override
            public void removeId(Person person) {

            }
        };

        //First I need to create new person
        Person person = new Person(1L);
        Person person1 = new Person(2L);
        Person person2 = new Person(3L);


        people.add(person);
        people.add(person1);
        people.add(person2);

        //now we need to add the new persons we just made to our people object
        //When
        people.removeId(person);

        Person[] expected = {person1, person2};
        Person[] actual = people.getArray();

        Assert.assertEquals(expected, actual);



    }
}