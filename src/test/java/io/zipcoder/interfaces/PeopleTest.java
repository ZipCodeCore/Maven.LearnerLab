package io.zipcoder.interfaces;

import org.junit.Assert;

import org.junit.Test;


public class PeopleTest {


    @Test
    public void testAdd() {
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
        Person expected = new Person(-1L);

        //When
        people.add(expected);
        Person actual = people.findById(expected.getId());

        //Then
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
        String name = "Bobby";
        Person expected = new Person(3L);

        //When
        people.add(expected);
        Person actual = people.findById(expected.getId());

        //Then
        Assert.assertEquals(expected, actual);



    }
}