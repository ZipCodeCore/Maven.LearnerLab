package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class PeopleTest {

    People people = new People();

    @Test

    public void addTest() {

        Person glagys = new Person(1);
        Person charo = new Person(2);
        people.add(glagys);
        people.add(charo);

        int expected = 2;
        int actual = people.personList.size();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void findByIdTest() {
        // : Given
        long id = 1;
        Person gaby = new Person(id);
        people.add(gaby);

        // : When
        Person actual = people.findById(id);

        // : Then
        Assert.assertEquals(gaby, actual);

    }

    @Test
    public void removeTest() {

        Person raul = new Person(1);
        people.add(raul);
        people.remove(raul);
        long expected = 0;
        long actual = people.count();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void countTest() {

        Person person1 = new Person(1);
        Person person2 = new Person(2);
        people.add(person1);
        people.add(person2);
        long expected = 2;
        long actual = people.count();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getArrayTest() {
        // Given
        Person john = new Person(1);
        Person adele = new Person(2);

        people.add(john);
        people.add(adele);

        for(Person person : people.getArray()) {
            Assert.assertNotNull(people.findById(person.getId()));
        }
    }

    @Test

    public void remoAllTest(){

        Person charo = new Person(1);
        people.add(charo);
        people.removeAll();
        long expected = 0;
        long actual = people.count();

        Assert.assertEquals(expected, actual);
    }
}
