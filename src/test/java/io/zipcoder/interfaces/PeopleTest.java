package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class PeopleTest{

    @Test
    public void addTest(){
        //Given
        ArrayList<Person> personListTest = new ArrayList<Person>();
        //When
        Person person1= new Person(3);
        personListTest.addPerson(person1);
        //Then
        boolean actual = personListTest.contains(person1);
        Assert.assertTrue(actual);
    }

    @Test
    public void removeTest(){
        //Given
        ArrayList<Person> personListTest = new ArrayList<Person>();
        //When
        Person person1= new Person(3);
        Person person2= new Person(6);
        personListTest.add(person1);
        personListTest.add(person2);
        personListTest.removePerson(person2);
        //Then
        Integer expected = 1;
        Integer actual = personListTest.size();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void removeTest2(){
        //Given
        ArrayList<Person> personListTest = new ArrayList<Person>();
        //When
        Person person1= new Person(3);
        Person person2= new Person(6);
        personListTest.add(person1);
        personListTest.add(person2);
        personListTest.removePerson(person2);
        //Then
        boolean actual = personListTest.contains(person2);
        Assert.assertFalse(actual);
    }

    @Test
    public void findByIdTest(){
        //Given
        ArrayList<Person> personListTest = new ArrayList<Person>();
        //When
        Person person1= new Person(3);
        Person person2= new Person(6);
        personListTest.add(person1);
        personListTest.add(person2);
        personListTest.findById(3);
        //Then
        
    }
}
