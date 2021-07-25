package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestPeople {

    @Test
    public void testAdd() {
        // Given
        List<Person> personList = new ArrayList<>();
        Person person1;

        // When
        personList.add(person1 = new Person(null, "Jawn"));

        // Then
        Assert.assertTrue(personList.contains(person1));
    }

    @Test
    public void testRemove() {
        // Given
        List<Person> personList = new ArrayList<>();
        Person person1;
        Person person2;
        personList.add(person1 = new Person(null, "Jawn"));
        personList.add(person2 = new Person(null, "Jawnay"));

        // When
        personList.remove(person1);

        // Then
        Assert.assertFalse(personList.contains(person1));
        Assert.assertTrue(personList.contains(person2));
    }

    @Test
    public void testFindById() {
        // Given
        List<Person> personList = new ArrayList<>();
        Person person1;
        Person person2;
        personList.add(person1 = new Person(123450L, "Jawn"));
        personList.add(person2 = new Person(246810L, "Jawnay"));

        // When
        People people = new People();
        Person expectedPerson = person1;

        Person actualPerson = people.findById(person1.getId());

        // Then
        //Assert.assertEquals(expectedPerson, actualPerson);
        System.out.println(actualPerson);
    }
}
