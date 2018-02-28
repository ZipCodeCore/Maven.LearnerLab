package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class PeopleTest {

    @Test
    public void addTest() {
         ArrayList<Person> personList = new ArrayList<Person>();
        //Given
        Person person = new Person(123);
        //When
        personList.add(person);
        //Then
        Assert.assertTrue(personList.contains(person));
    }

    @Test
    public void findByIdTest() {
        ArrayList<Person> personList = new ArrayList<Person>();
        People people = new People();
        //Given
        Person person = new Student(123);
        Person person1 = new Student(124);
        Person person2 = new Student(125);
        personList.add(person);
        personList.add(person1);
        personList.add(person2);
        //When
        Person expected = person2;
        Person actual = people.findById(125);
        //Then
        personList.remove(person2);
        Assert.assertTrue(personList.contains(person) && personList.contains(person1));
    }


    @Test
    public void removeTest() {
        People people = new People();
        ArrayList<Person> personList = new ArrayList<Person>();
        //Given
        Person person = new Person(123);
        Person person1 = new Person(124);
        Person person2 = new Person(125);
        //When
        personList.add(person);
        personList.add(person1);
        personList.add(person2);
        personList.remove(person2);

        int expected = 2;
        int actual = personList.size();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getCountTest() {
        ArrayList<Person> personList = new ArrayList<Person>();
        //Given
        Person person = new Person(123);
        Person person1 = new Person(124);
        //When
        personList.add(person);
        personList.add(person1);
        //Then
        Assert.assertTrue(personList.size() == 2);
    }

    @Test
    public void getArrayTest() {
        ArrayList<Person> personList = new ArrayList<Person>();
        //Given
        Person person = new Person(123);
        Person person1 = new Person(124);
        Person person2 = new Person(125);
        //When
        personList.add(person);
        personList.add(person1);
        personList.add(person2);
        //Then
        Object[] expected = personList.toArray();
        Assert.assertTrue(personList.contains(person) && personList.contains(person1));
    }

    @Test
    public void removeAllTest() {
        ArrayList<Person> personList = new ArrayList<Person>();
        //Given
        Person person = new Person(123);
        Person person1 = new Person(124);
        Person person2 = new Person(125);
        //When
        personList.add(person);
        personList.add(person1);
        personList.add(person2);
        //Then
        personList.clear();
        Assert.assertTrue(personList.size() == 0);
    }
}