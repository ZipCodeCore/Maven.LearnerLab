package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EducatorTest {

    @Test
    public void testAdd(){

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
        Person expected = new Person(10L);

        people.add(expected);
        Person actual = people.findById(expected.getId());

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemove(){

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
        Person person = new Person(5L);
        Person expected = null;
        people.add(person);


        people.remove(person);
        Person actual = people.findById(person.getId());


        Assert.assertEquals(expected, actual);
        }

    @Test
    public void testByFindId() {

        long id = 50;
        String name = "Bobby";
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
        Person expected = new Person(id);
        people.add(expected);


        Person actual = people.findById(id);

        Assert.assertEquals(expected, actual);
    }

}