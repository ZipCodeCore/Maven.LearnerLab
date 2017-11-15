package io.zipcoder.interfaces;


import org.junit.Assert;
import org.junit.Test;

public class PeopleTest {

    Person person = new Person(101010, "Jim");
    People people = new People() {
        @Override
        public Person[] getStudentArray() {
            return new Person[0];
        }
    };


    @Test
    public void testAdd() {


        people.add(person);
        long expected = 101010;
        long actual = people.findById(expected).getId();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testRemove() {

        people.add(person);
        people.remove(person);
        long expected = 0;
        long actual = people.getCount();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testFindById() {

        people.add(person);
        long expected = 101010;
        long actual = people.findById(expected).getId();
        Assert.assertEquals(expected, actual);
    }


}

